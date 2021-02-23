package com.gianlucazon.dao;

import com.gianlucazon.model.Test;

public interface TestDaoInterface {

	void printTest();

	void insertTest(String title);

	Test readTest(Integer id);

}
