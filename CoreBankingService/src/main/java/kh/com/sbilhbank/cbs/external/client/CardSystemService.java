package kh.com.sbilhbank.cbs.external.client;

import kh.com.sbilhbank.cbs.external.model.CardInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "CARD-SYSTEM-SERVICE/")
public interface CardSystemService {
    @GetMapping("/card/{cardId}")

    public ResponseEntity<CardInfo> getCardInfoById(@PathVariable Long cardId,
        @RequestHeader("Authorization") String accessToken);
    @GetMapping("/user/{userId}")
    public ResponseEntity<CardInfo> getCardInfoByUserId(@PathVariable Long userId,
        @RequestHeader("Authorization") String accessToken);
}
