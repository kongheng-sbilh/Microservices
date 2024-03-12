package kh.com.sbilhbank.cbs.controller;

import kh.com.sbilhbank.cbs.external.client.AuthenticationService;
import kh.com.sbilhbank.cbs.external.client.CardSystemService;
import kh.com.sbilhbank.cbs.external.model.CardInfo;
import kh.com.sbilhbank.cbs.model.User;
import kh.com.sbilhbank.cbs.model.UserResponse;
import kh.com.sbilhbank.cbs.service.CoreBankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/core")
public class CoreBankingController {

    @Autowired
    private CoreBankingService coreBankingService;

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private CardSystemService cardSystemService;

    @GetMapping("user/{id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable Long id,
        @RequestParam("Authorization") String accessToken) throws Exception {
        UserResponse userResponse = new UserResponse();
        try {
            authenticationService.validate(accessToken);
            CardInfo cardInfo = cardSystemService.getCardInfoByUserId(id, accessToken).getBody();
            User user = coreBankingService.getUserById(id);
            if (Objects.nonNull(cardInfo) && Objects.nonNull(user)) {
                userResponse = UserResponse.builder()
                    .id(user.getId())
                    .name(user.getName())
                    .gender(user.getGender())
                    .address(user.getAddress())
                    .cardId(cardInfo.getId())
                    .cardName(cardInfo.getName())
                    .cvv(cardInfo.getCvv())
                    .createDate(cardInfo.getCreateDate())
                    .expireDate(cardInfo.getExpireDate())
                    .build();
            }
        } catch (Exception e) {
            return new ResponseEntity<>(userResponse, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }
}
