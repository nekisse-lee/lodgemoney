package com.project.lodgemoney.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
public class
User {
    @Id
    @GeneratedValue
    int seq;

    String name;

    int userTotalDeposit;

    public User() {
    }


}
