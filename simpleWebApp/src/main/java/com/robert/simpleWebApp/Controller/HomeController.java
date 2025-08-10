package com.robert.simpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "welcome to robert world!";
    }

    @RequestMapping("/about")
    public String about() {
        return "all related to about!";
    }
}
