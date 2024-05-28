package com.juno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTeste {
	
	@GetMapping
	public String teste() {
		return "<h1>teste</h1>";
	}

}
