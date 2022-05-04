package com.redi.security.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        return http
            .authorizeRequests()
            .antMatchers("/register").permitAll()
            .antMatchers("/fun").hasRole("USER")//.authenticated()//denyAll()//hasIpAddress//not()
            .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/fun")
                .permitAll()
            .and()
                .logout()
                .permitAll();
    }
}
