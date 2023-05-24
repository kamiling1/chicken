package com.example.accessingdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String mp;

    protected Customer() {}

    public Customer(String name, String mp) {
        this.name = name;
        this.mp = mp;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, name, mp);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return name;
    }

    public String getLastName() {
        return mp;
    }
}