package com.wujiang.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wujiang.entity.User;

public class UserDao {
	private  String resource = "com/wujiang/configuration/mybatis.xml";
	public List<User> getPageUsers(Map<String, Integer> param) throws IOException{
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = ssf.openSession();
		reader.close();
		List<User> userList = session.selectList("UserDaoMapping.getPageUsers", param);
		session.commit();
		session.close();
		return userList;
	}

}
