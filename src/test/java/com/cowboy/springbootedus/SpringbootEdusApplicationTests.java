package com.cowboy.springbootedus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEdusApplicationTests {
	@Autowired
	private DataSource dataSource;
	@Autowired
	private SqlSessionFactoryBean sqlSessionFactoryBean;
	@Test
	public void test1(){
		System.out.println(sqlSessionFactoryBean);
	}

	@Test
	public void contextLoads() throws SQLException {
		System.out.println("=========================");
		System.out.println(dataSource.getConnection());

		Connection connection = dataSource.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from t_edu_user");
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			System.out.println(resultSet.getObject("name"));
		}

		preparedStatement.close();
		connection.close();
	}

}
