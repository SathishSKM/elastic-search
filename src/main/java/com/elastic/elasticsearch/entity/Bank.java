package com.elastic.elasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "bank")
public class Bank {

    @Id
    private String id;

    private Integer account_number;

    private String firstname;

    private String lastname;

    private Integer balance;

    private Integer age;

    private String gender;

    private String address;

    private String employer;

    private String email;

    private String city;

    private String state;
}
