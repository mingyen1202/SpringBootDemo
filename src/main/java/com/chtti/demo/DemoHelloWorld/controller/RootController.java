package com.chtti.demo.DemoHelloWorld.controller;

import com.chtti.demo.DemoHelloWorld.bean.Lesson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

    @RequestMapping(value = "/ep1", method = RequestMethod.GET)
    public String ep1() {
        LOGGER.info("GET console");
        return "ep1";
    }

    @RequestMapping(value = "/ep2", method = RequestMethod.GET)
    public String ep2() {
        LOGGER.info("GET console");
        return "ep2";
    }

    @RequestMapping(value = "/ep3", method = RequestMethod.GET)
    public Lesson ep3() {
        Lesson lesson = new Lesson("Java", "MarkHo", 28);
        lesson.addSchedule("Ape-1");
        lesson.addSchedule("Ape-2");
        lesson.addSchedule("Ape-3");
        return lesson;
    }
}
