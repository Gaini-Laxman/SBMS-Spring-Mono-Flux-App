package com.klinnovations.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MyRestController {

	@GetMapping("/single")
	public Mono<String> SingleResponse(){
		
		return Mono.just("This Is Mono Single Response");
		
	}
	
	@GetMapping("/multiple")
	public Flux<Integer> MultipleResponse(){
		
		return Flux.range(1, 100);
		
	}
	
}
