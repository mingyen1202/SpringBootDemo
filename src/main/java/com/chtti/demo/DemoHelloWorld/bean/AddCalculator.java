package com.chtti.demo.DemoHelloWorld.bean;

import com.chtti.demo.DemoHelloWorld.Calculator;
import org.springframework.stereotype.Component;

@Component(value = "add")
public class AddCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
