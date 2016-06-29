package com.wujiang.service;

import java.io.IOException;
import java.util.List;

import com.wujiang.dao.ScoreDao;
import com.wujiang.entity.Score;
import com.wujiang.entity.User;


public class ScoreService {

	private ScoreDao scoreDao = new ScoreDao();

	public ScoreDao getScoreDao() {
		return scoreDao;
	}

	public void setScoreDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	public List<Score> getScoreByUser(User user) throws IOException{
		return scoreDao.selectScoreByUser(user);
	}
	
	public void insertScore(Score score) throws IOException{
		scoreDao.insertScore(score);
	}
}

