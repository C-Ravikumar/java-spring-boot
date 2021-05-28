package com.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class SpringRest {

	@RequestMapping("/")
	public String Home() {
		return "Welcome to this site !";
	}

	@RequestMapping("/{name}")
	public String Name(@PathVariable String name) {
		return "Welcome " + name;
	}
}
