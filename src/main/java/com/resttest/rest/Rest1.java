package com.resttest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest1 {
	
	@GetMapping("/getName")
    public String getName() {
        return "MY first spring boot azure app";
    }

}
