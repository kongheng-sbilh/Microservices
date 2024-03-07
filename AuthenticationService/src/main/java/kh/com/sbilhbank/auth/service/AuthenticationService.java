package kh.com.sbilhbank.auth.service;

public interface AuthenticationService {
    String getAccessToken(Long id);
    void validate(String token) throws Exception;
}
