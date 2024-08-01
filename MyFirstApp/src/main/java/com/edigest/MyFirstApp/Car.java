package com.edigest.MyFirstApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
class Car {

    // @Autowired
    // private Dog dog
    private Dog dog = new Dog();

    @GetMapping("/ok")
    public String ok(){
        return dog.fun();
    }
}