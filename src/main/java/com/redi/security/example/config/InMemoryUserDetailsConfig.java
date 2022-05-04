/*package com.redi.security.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InMemoryUserDetailsConfig {

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        List<UserDetails> userDetailsList = new ArrayList<>();
        userDetailsList.add(
                User.builder()
                        .passwordEncoder(encoder::encode)
                        .username("varsha")
                        .password("varsha")
                        .roles("USER")
                        .build()
        );

        userDetailsList.add(
                User.builder()
                        .passwordEncoder(encoder::encode)
                        .username("prajwal")
                        .password("prajwal")
                        .roles("USER")
                        .build()
        );

        return new InMemoryUserDetailsManager(userDetailsList);
    }
}*/
