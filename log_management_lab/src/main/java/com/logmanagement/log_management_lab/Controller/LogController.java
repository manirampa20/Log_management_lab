package com.logmanagement.log_management_lab.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String logSomething() {
        logger.info("Log request received.");
        logger.warn("This is a WARN log message.");
        logger.error("This is an ERROR log message.");
        return "Log messages have been generated!";
    }
}
