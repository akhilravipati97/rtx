package com.reddit.top.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RtxController {
	
	@GetMapping
	public String hello(@RequestParam(value="name", defaultValue="Stranger") String name) {
		return String.format("{\"message\": \"%s\"}", name);
	}
}
