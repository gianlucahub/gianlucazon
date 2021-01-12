package com.gianlucazon.service.impl;

import org.springframework.stereotype.Service;

import com.gianlucazon.service.TestInterface;

@Service
public class Test implements TestInterface {

	@Override
	public void printTest() {
		System.out.println("Yesssssssssssssss");
		
	}

}
