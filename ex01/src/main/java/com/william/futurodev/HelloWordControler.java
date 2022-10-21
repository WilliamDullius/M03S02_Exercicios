package com.william.futurodev;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWordControler {
	
	@GetMapping("/nome")
	public String getHelloWord () {
		return "Hello Word";
	}

}
