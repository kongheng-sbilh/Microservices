package kh.com.sbilhbank.cbs.service;

import kh.com.sbilhbank.cbs.model.User;

public interface CoreBankingService {
    User getUserById(Long id) throws Exception;
}
