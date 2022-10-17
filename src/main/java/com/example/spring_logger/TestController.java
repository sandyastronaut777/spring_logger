package com.example.spring_logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class TestController {
    private static final Logger logger = LogManager.getLogger(TestController.class);

    public void testExample(){
        logger.info("inside the testexample method");
    }
}
