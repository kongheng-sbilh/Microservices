package kh.com.sbilhbank.cms.controller;

import kh.com.sbilhbank.cms.external.client.AuthenticationService;
import kh.com.sbilhbank.cms.model.CardInfo;
import kh.com.sbilhbank.cms.service.CardSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CardSystemController {

    @Autowired
    private CardSystemService cardSystemService;

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/card/{cardId}")
    public ResponseEntity<CardInfo> getCardInfoById(@PathVariable Long cardId,
        @RequestHeader("Authorization") String accessToken) throws Exception {
        authenticationService.validate(accessToken);
        CardInfo cardInfo = cardSystemService.getCardInfoById(cardId);
        return new ResponseEntity<>(cardInfo, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<CardInfo> getCardInfoByUserId(@PathVariable Long userId,
        @RequestHeader("Authorization") String accessToken) throws Exception {
        authenticationService.validate(accessToken);
        CardInfo cardInfo = cardSystemService.getCardInfoByUserId(userId);
        return new ResponseEntity<>(cardInfo, HttpStatus.OK);
    }
}
