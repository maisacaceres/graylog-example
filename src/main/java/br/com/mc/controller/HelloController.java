package br.com.mc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		
		log.info("Call hello");
		return "Hello from graylog example";
		
	}
	
	@RequestMapping("/hello/error")
	public String helloError() {
		
		log.info("Call hello with execption");
		throw new RuntimeException("My exception");
		
	}

}
