package kh.com.sbilhbank.cms.service;

import kh.com.sbilhbank.cms.model.CardInfo;

public interface CardSystemService {
    CardInfo getCardInfoById(Long cardId) throws Exception;
    CardInfo getCardInfoByUserId(Long userId) throws Exception;
}
