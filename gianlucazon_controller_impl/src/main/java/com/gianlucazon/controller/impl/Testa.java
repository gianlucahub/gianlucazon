package com.gianlucazon.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gianlucazon.service.TestInterface;


@RestController
@RequestMapping("restweb")
public class Testa {

	@Autowired
	private TestInterface service;
	
	@GetMapping("ping")
	public void get() {
		System.out.println("fsddddddddddds");
		service.printTest();
	}
}
