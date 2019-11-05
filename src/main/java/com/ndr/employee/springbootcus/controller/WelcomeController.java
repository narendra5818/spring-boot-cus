package com.ndr.employee.springbootcus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class WelcomeController {
    
    @RequestMapping("/hello")
    public Object sayHello(){
        System.out.println("Customer ------");
        return "Customer";
    }

}
