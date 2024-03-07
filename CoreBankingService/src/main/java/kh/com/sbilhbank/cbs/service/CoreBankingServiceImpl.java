package kh.com.sbilhbank.cbs.service;

import kh.com.sbilhbank.cbs.model.User;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CoreBankingServiceImpl implements CoreBankingService {

    @Override
    public User getUserById(Long id) throws Exception {
        return User.users.get().stream()
            .filter(user -> Objects.equals(user.getId(), id))
            .findFirst()
            .orElseThrow(() -> new Exception("User not found !!!"));
    }
}