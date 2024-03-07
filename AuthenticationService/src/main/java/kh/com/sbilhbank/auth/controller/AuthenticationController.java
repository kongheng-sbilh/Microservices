package kh.com.sbilhbank.auth.controller;

import kh.com.sbilhbank.auth.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/{id}")
    public ResponseEntity<String> getAccessToken(@PathVariable Long id) {
        return new ResponseEntity<>(this.authenticationService.getAccessToken(id), HttpStatus.OK);
    }

    @GetMapping("/token/{token}")
    public void validate(@PathVariable String token) throws Exception {
        this.authenticationService.validate(token);
    }
}
