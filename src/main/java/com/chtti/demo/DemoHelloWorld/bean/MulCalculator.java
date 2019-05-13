package com.chtti.demo.DemoHelloWorld.bean;

import com.chtti.demo.DemoHelloWorld.Calculator;

public class MulCalculator implements Calculator {

    @Override
    public int calc(int a, int b) {
        return a * b;
    }
}
