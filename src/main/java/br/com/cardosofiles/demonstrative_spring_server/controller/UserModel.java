package br.com.cardosofiles.demonstrative_spring_server.controller;

import jakarta.validation.constraints.NotBlank;

public class UserModel {
    @NotBlank
    private Long id;

    @NotBlank
    private String user;

    @NotBlank
    private String telephone;

    public Long getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getTelephone() {
        return telephone;
    }
}
