package com.qubora.auth.dto;

import lombok.Data;

@Data
public class RegisterUserDto {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

}
