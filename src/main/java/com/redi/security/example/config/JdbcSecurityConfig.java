package com.redi.security.example.config;

import com.redi.security.example.repository.UserRepository;
import com.redi.security.example.service.CustomUserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class JdbcSecurityConfig {
    @Bean
    public UserDetailsService userDetailsService(UserRepository repository){
        return new CustomUserDetailService(repository);
    }
}
