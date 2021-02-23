package com.gianlucazon.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.gianlucazon.dao.TestDaoInterface;
import com.gianlucazon.model.Test;

@Repository
public class TestDaoImpl extends GianlucazonDaoAbstract implements TestDaoInterface {

	private String insertSql = "insert into GIANLUCAZON_TEST (title) values (?)";
	private String readSql = "select * from GIANLUCAZON_TEST where id =?";

	@Override
	public void printTest() {
		System.out.println("Arriva al dao!");

	}

	@Override
	public void insertTest(String title) {
		int res = getJdbcTemplate().update(insertSql, title);
		System.out.println(res);
	}

	@Override
	public Test readTest(Integer id) {
		return getJdbcTemplate().queryForObject(readSql, getMapper(), new Object[] { id });
	}

	@Override
	protected RowMapper<Test> getMapper() {
		return new BeanPropertyRowMapper<Test>(Test.class);
	}

}
