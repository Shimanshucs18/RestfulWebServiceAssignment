package com.shimanshu.RestfulWebServiceAssignment.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessage {
    @GetMapping(path = "/welcome")
    public String printMessage(){
        return "Hi,.....";
    }
}
