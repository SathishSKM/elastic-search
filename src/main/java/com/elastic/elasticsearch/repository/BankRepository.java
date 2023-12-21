package com.elastic.elasticsearch.repository;

import com.elastic.elasticsearch.entity.Bank;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends ElasticsearchRepository<Bank, String> {

}
