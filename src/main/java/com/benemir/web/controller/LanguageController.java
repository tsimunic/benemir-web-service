package com.benemir.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {
	
	private static final Logger logger = LogManager.getLogger(LanguageController.class);
	
	@GetMapping(value = "/language")
    public void getLanguage(String language) {
		logger.info(language);
    }


}
