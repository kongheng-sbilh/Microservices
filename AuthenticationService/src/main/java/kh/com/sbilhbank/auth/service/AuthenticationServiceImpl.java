package kh.com.sbilhbank.auth.service;

import kh.com.sbilhbank.auth.model.AccessToken;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Override
    public String getAccessToken(Long id) {
        return AccessToken.availableTokens.get().stream()
            .filter(accessToken -> Objects.equals(accessToken.getUserId(), id))
            .findFirst()
            .map(AccessToken::getToken)
            .orElse("Access Token Not Found !!!");
    }

    @Override
    public void validate(String token) throws Exception {
        AccessToken.availableTokens.get().stream()
            .filter(accessToken -> Objects.equals(accessToken.getToken(), token))
            .findFirst()
            .orElseThrow(() -> new Exception("Token invalid !!!"));
    }
}
