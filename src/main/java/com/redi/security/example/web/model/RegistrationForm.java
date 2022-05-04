package com.redi.security.example.web.model;

import com.redi.security.example.model.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
@RequiredArgsConstructor
public class RegistrationForm {
    private final String username;
    private final String password;
    private final String fullname;

    public User toUser(PasswordEncoder encoder){
        return User.builder().username(username).password(encoder.encode(password)).fullName(fullname).build();
    }
}
