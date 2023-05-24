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
    private String sex;//性别
    private String age;//年龄
    private String weight;//重量
    private String price;//价格
    protected Customer() {}
    public Customer(String name, String sex, String age, String weight, String price) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, name, sex,age,weight,price;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return name;
    }

    public String getLastName() {
        return sex;
    }
    public String getLastName() {
        return age;
    }
    public String getLastName() {
        return weight;
    }
    public String getLastName() {
        return price;
    }
}