package com.example.chapone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/hello/testy?lastName=test

@SpringBootApplication /* entry point for the Spring Boot service */
@RestController /* route maps to a method in a Spring RestController class */
@RequestMapping(value = "hello") /* Prefaces all URLs exposed in this application with a /hello prefix */
public class Chapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}

	/**
	 * Exposes an endpoint as a GET-based REST that takes two parameters in its
	 * firstName (via @PathVariable) and lastName (via @RequestParam)
	 */
	@GetMapping(value = "/{firstName}")
	public String helloGET(@PathVariable("firstName") String firstName, @RequestParam("lastName") String lastName) {
		return String.format("{\"message\":\"Hello %s %s\"}", firstName, lastName);
	}

	@PostMapping
	public String helloPOST(@RequestBody HelloRequest request) {
		return String.format("{\"message\":\"Hello %s %s\"}", request.getFirstName(), request.getLastName());
	}

}

class HelloRequest {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
