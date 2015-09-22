package com.tcs.Test;

import org.slf4j.Logger;

import com.tcs.utils.loggerutils.CustomLoggerFactory;

public class CustomLoggerTester {

	public static void main(String[] args) {

	    Logger logger = CustomLoggerFactory.getLogger(CustomLoggerTester.class);
	    System.out.println(logger.getClass().getName());
	    logger.info("Hello World");
	}
}
