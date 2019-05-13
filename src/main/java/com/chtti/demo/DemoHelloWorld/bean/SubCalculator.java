package com.chtti.demo.DemoHelloWorld.bean;

import com.chtti.demo.DemoHelloWorld.Calculator;

public class SubCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a - b;
    }
}
