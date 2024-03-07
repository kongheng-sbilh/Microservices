package kh.com.sbilhbank.cms.service;

import kh.com.sbilhbank.cms.model.CardInfo;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CardSystemServiceImpl implements CardSystemService {

    @Override
    public CardInfo getCardInfoById(Long cardId) throws Exception {
        return CardInfo.cards.get().stream()
            .filter(cardInfo -> Objects.equals(cardInfo.getId(), cardId))
            .findFirst()
            .orElseThrow(() -> new Exception("Card Not Found !!!"));
    }

    @Override
    public CardInfo getCardInfoByUserId(Long userId) throws Exception {
        return CardInfo.cards.get().stream()
            .filter(cardInfo -> Objects.equals(cardInfo.getUserId(), userId))
            .findFirst()
            .orElseThrow(() -> new Exception("Card Not Found !!!"));
    }
}
