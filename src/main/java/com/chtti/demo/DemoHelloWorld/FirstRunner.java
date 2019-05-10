package com.chtti.demo.DemoHelloWorld;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FirstRunner implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(FirstRunner.class);
//    @Autowired
//    private ApplicationContext context;
    @Autowired
    @Qualifier("add")
    private Calculator c1;
    @Autowired
    @Qualifier("sub")
    private Calculator c2;
    @Autowired
    @Qualifier("mul")
    private Calculator c3;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("First Runner start to run something");
//        Calculator c1 = context.getBean(Calculator.class);
//        Calculator c1 = context.getBean("add", Calculator.class);
        LOGGER.info(String.format("add c1=%d", c1.calc(50, 20)));
//        Calculator c2 = context.getBean("sub", Calculator.class);
        LOGGER.info(String.format("sub c2=%d", c2.calc(50, 20)));
        LOGGER.info(String.format("sub c3=%d", c3.calc(50, 20)));
    }
}
