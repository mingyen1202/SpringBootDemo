package com.chtti.demo.DemoHelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping(value = "/")
    public String foo() {
        return "Hi Marcus from Spring boot";
    }

}
