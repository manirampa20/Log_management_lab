package com.logmanagement.log_management_lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogManagementApplication {

	private static final Logger logger = LoggerFactory.getLogger(LogManagementApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LogManagementApplication.class, args);
		logger.info("Spring Boot Application started successfully.");
	}
}
