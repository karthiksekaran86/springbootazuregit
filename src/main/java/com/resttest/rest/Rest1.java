package com.resttest.rest;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest1 {
	
	private Logger log = org.slf4j.LoggerFactory.getLogger(Rest1.class);
	
	@GetMapping("/getName")
    public String getName() {
		String session_key = UUID.randomUUID().toString();
		MDC.put("user_session_key", session_key);
		log.warn("Warn statement");
		log.error("Error statement");
		log.debug("Debug statement");
		log.info("Info statement");
		log.trace("Trace statement");
		 
        return "MY first spring boot azure app";
    }

}
