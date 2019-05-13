package com.chtti.demo.DemoHelloWorld.controller;

import com.chtti.demo.DemoHelloWorld.bean.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    private Message msg;

    @RequestMapping(value = {"/welcome"}, method = RequestMethod.GET)
    Message index() {
        msg.setId(msg.getId() + 2);
        msg.setName("welcome back");
        return msg;
    }
}
