package com.rimjhim.subsidytracker.subsidy_disbursement_tracker;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    @GetMapping("/Hello")
    public String sayHello() {
        return "Hello from Rimjhim! ";
    }
    
}
