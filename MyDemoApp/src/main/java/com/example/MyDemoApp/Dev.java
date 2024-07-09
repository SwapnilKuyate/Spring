package com.example.MyDemoApp;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Dev {

    @Autowired //field injection
    private Laptop lap;

    public void build(){
        System.out.println("I'm Working on Spring Boot Application");
        lap.compile();
    }
    
}