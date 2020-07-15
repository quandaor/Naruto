package com.naruto.dao;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DemoDao {

    public String getDemo(String param){
        return Optional.ofNullable(param).orElse("hello world");
    }
}
