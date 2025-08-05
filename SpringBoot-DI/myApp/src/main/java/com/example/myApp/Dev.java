package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Laptop laptop = new Laptop();

    // this called field injection | Need to use @Autowired bcz it's mandatory
    @Autowired
    @Qualifier("desktop")  // You need to give here instance name not class name | desktop not Desktop
    private Computer computer;

    // Construction injection | No Need to use @Autowired bcz it's default autowired, and it's optional
    /**
    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }
     **/

    // Setter Injection | Need to use @Autowired bcz it's mandatory
    /**
    @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    **/

    public void build() {
        computer.compile();
        System.out.println("Understanding the IOC & Dependency injection");
    }
}
