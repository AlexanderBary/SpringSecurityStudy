package com.baryshnikov.SpringSecurityStudy.rest;

import lombok.Data;

@Data
public class AuthenticationRequestDTO {

    private String email;
    private String password;


}
