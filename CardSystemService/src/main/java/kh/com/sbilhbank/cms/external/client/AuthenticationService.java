package kh.com.sbilhbank.cms.external.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "AUTHENTICATION-SERVICE/auth")
public interface AuthenticationService {

    @GetMapping("/token/{token}")
    void validate(@PathVariable String token);
}
