package com.tenpo.assessment.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ApplicationUser {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;

    public ApplicationUser() {
    }

    public ApplicationUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public ApplicationUser setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public ApplicationUser setUserName(String email) {
        this.userName = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ApplicationUser setPassword(String password) {
        this.password = password;
        return this;
    }
}
