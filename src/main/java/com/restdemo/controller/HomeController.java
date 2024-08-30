package com.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.dto.Users;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class HomeController {
	@GetMapping("/users")
	public String getUser(@RequestParam("Enter name")String name) {
		return name;
	}
	@GetMapping("/add")
	public int addValue(@RequestParam("a")int num1,@RequestParam("b") int num2) {
		return num1+num2;
	}
	@GetMapping("/sub")
	public int subValue(@RequestParam("a")int num1,@RequestParam("b") int num2) {
		return num1-num2;
	}
	@GetMapping("/mul/{a}/{b}")
	public int mulValue(@PathVariable("a")int num1,@PathVariable("b") int num2) {
		return num1*num2;
	}
//	@PostMapping("/save")
//	public String saveUserData(@RequestBody Users users) {
//		if (users.getUserName().equals("kumara")) {
//			return "valid UserName";
//		}
//		return "Invalid UserName";
//
//	}


}
