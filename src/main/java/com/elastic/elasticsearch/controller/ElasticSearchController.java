package com.elastic.elasticsearch.controller;

import com.elastic.elasticsearch.entity.Bank;
import com.elastic.elasticsearch.service.BankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/bank")
public class ElasticSearchController {

    private BankService bankService;

    public ElasticSearchController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/{id}")
    public Optional<Bank> findById(@PathVariable String id) {
        return bankService.findById(id);
    }
}
