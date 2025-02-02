package com.kamathad.AspectPlay;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    private final TestService testService;

    public TestRunner(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void run(String... args) throws Exception {
        testService.testMethod();
    }
}
