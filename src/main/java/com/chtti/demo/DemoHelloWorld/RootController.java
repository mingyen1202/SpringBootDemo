package com.chtti.demo.DemoHelloWorld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RootController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String bar() {
        LOGGER.info("GET console");
        return "[GET] Hi Marcus from Spring boot";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String foo() {
        LOGGER.info("POST console");
        return "[POST] Hi Marcus from Spring boot";
    }

}
