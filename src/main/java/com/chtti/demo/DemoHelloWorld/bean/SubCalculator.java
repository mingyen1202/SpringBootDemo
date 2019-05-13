package com.chtti.demo.DemoHelloWorld.bean;

import com.chtti.demo.DemoHelloWorld.Calculator;
import org.springframework.stereotype.Component;

@Component(value = "sub")
public class SubCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a - b;
    }
}
