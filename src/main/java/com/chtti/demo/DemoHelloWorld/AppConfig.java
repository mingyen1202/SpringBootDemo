package com.chtti.demo.DemoHelloWorld;

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

    @Bean(name = "mul")
    Calculator calculator3() {
        return new MulCalculator();
    }
}
