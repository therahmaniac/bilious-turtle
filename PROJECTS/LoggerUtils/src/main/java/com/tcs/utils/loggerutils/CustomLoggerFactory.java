package com.tcs.utils.loggerutils;

import org.apache.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.util.ContextInitializer;

public class CustomLoggerFactory {
	// Consider statically loading Resources related to customization
	final public static String OVERRIDE_DEFAULT = "logutils.enable";

	static {
		if (System.getProperty(OVERRIDE_DEFAULT)==null ||System.getProperty(OVERRIDE_DEFAULT).equalsIgnoreCase("false")) {
			// override Default
			System.setProperty(LogManager.DEFAULT_CONFIGURATION_KEY, "log4j-custom.properties");
			System.setProperty(ContextInitializer.CONFIG_FILE_PROPERTY,"logback-custom.xml");
		}
	}

	public static Logger getLogger(Class<?> clazz) {
		return LoggerFactory.getLogger(clazz);
	}
}
