package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_Demo {
	
	//Factory Design pattern
	
	static Logger log = Logger.getLogger(Logger_Demo.class);
	
	public static void main(String[] args) {
		
	//Basic configuration
		
		BasicConfigurator.configure();
		
		log.debug("debug");
		
		log.info("information");
		
		log.warn("warning");
		
		log.error("error");
		
		log.fatal("fatal");
	}

}
