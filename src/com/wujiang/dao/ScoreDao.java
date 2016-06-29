package com.wujiang.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wujiang.entity.Score;
import com.wujiang.entity.User;

public class ScoreDao {
	private  String resource = "com/wujiang/configuration/mybatis.xml";
	public List<Score> selectScoreByUser(User user) throws IOException{
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = ssf.openSession();
		reader.close();
		Map<String,Integer> params = new HashMap<String,Integer>();
		params.put("userid", user.getId());
		List<Score> scoreList = session.selectList("ScoreDaoMapping.findScoreByUser", params);
		session.commit();
		session.close();
		return scoreList;
	}
	
	public void insertScore(Score score) throws IOException{
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = ssf.openSession();
		reader.close();
		session.insert("ScoreDaoMapping.insertScore", score);
		session.commit();
		session.close();
	}

}
