package com.edms.backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



 @RestController
public class EdmsHealthController {

    @GetMapping("/api/health")
    public String getMethodName() {
        return new String("EDMS backend is running.");
    }
    @GetMapping("/test")
public String test() {
    return "Controller is working";
}
    

}
