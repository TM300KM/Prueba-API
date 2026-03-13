package com.chakray.usersapi.model;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class User {

    private Long id;
    private String email;
    private String name;
    private String phone;
    private String password;
    private String taxId;
    private final ZonedDateTime createdAt = ZonedDateTime.now(
        ZoneId.of("Indian/Antananarivo")
    );

    public User() {
    }

    public User(Long id, String email, String name, String phone, String password, String taxId) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.taxId = taxId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
}