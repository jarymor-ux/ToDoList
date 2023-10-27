package com.ostap.todolist.SecurityConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource dataSource;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/").hasAnyRole("ADMIN", "USER")
                    .antMatchers("/home").hasAnyRole("ADMIN","USER")
                    .antMatchers("/admin_panel").hasRole("ADMIN")
                    .and().formLogin().permitAll();
    }
}
