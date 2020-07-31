package com.doop.mybatisproject;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/*.xml" })
public class MyBatisTest {
	
	@Inject
	private SqlSessionFactory sqlsessionfactory;
	
	@Test
	public void SqlSessionFactoryTest() throws Exception {
		System.out.println("SqlSessionFactory: "+sqlsessionfactory);
	}
	
	
	@Test
	public void SqlSessionTest() throws Exception {
		try (SqlSession session = sqlsessionfactory.openSession()){
			System.out.println("session: "+session);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
