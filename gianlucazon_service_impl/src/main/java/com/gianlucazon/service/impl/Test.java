package com.gianlucazon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gianlucazon.dao.TestDaoInterface;
import com.gianlucazon.service.TestInterface;

@Service
public class Test implements TestInterface {

	@Autowired
	private TestDaoInterface testDaoInterface;

	@Override
	public void printTest() {
		System.out.println("Yesssssssssssssss");
		testDaoInterface.insertTest("cazzolino");
		System.out.println("YesssssssssssssssAzzzz:  " + testDaoInterface.readTest(1).getTitle());
	}

}
