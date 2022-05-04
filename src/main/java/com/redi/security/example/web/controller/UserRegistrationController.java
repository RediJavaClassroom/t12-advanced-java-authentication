package com.redi.security.example.web.controller;

import com.redi.security.example.model.User;
import com.redi.security.example.repository.UserRepository;
import com.redi.security.example.web.model.RegistrationForm;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
@AllArgsConstructor
public class UserRegistrationController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity<Long> processRegistration(@RequestBody final RegistrationForm form){
       User user = userRepository.save(form.toUser(passwordEncoder));
       return ResponseEntity.status(200).body(user.getId());
    }
}
