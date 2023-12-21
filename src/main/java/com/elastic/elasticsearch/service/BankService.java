package com.elastic.elasticsearch.service;

import com.elastic.elasticsearch.entity.Bank;
import com.elastic.elasticsearch.repository.BankRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankService {

    private BankRepository bankRepository;

    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public Optional<Bank> findById(String id) {
        return bankRepository.findById(id);
    }
}
