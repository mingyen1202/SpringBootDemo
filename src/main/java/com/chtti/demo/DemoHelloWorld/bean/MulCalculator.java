package com.chtti.demo.DemoHelloWorld.bean;

import com.chtti.demo.DemoHelloWorld.Calculator;
import org.springframework.stereotype.Component;

@Component(value = "mul")
public class MulCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a * b;
    }
}
