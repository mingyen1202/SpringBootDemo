package com.chtti.demo.DemoHelloWorld.configs;

import com.chtti.demo.DemoHelloWorld.Calculator;
import com.chtti.demo.DemoHelloWorld.bean.AddCalculator;
import com.chtti.demo.DemoHelloWorld.bean.SubCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "add")
//    @Bean
    Calculator calculator1() {
        return new AddCalculator();
    }

    @Bean(name = "sub")
//    @Bean
    Calculator calculator2() {
        return new SubCalculator();
    }
}
