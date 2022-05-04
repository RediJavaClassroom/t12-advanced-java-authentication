package com.redi.security.example.web.controller;

import lombok.AllArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/fun")
@AllArgsConstructor
public class FunController {

    @GetMapping
    public String doFunThings() {
        return "fun";
    }

    @DeleteMapping
    @PreAuthorize("#{hasRole('ADMIN')}")
    public String dangerous(Principal principal, Authentication authentication){
        return "deleted everything";
    }
}
