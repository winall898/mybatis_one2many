package com.wujiang.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wujiang.entity.Score;
import com.wujiang.entity.User;
import com.wujiang.service.ScoreService;
import com.wujiang.service.UserService;


public class Test {

	private UserService userService = new UserService();
	
	private ScoreService scoreSerice = new ScoreService();
	
	public static void main(String[] args) throws Exception{
	    
		Test test = new Test();
		test.insertScore();
		List<Score> scoreList = test.getScore();
		Score score = null;
        for(int i=0;i<scoreList.size();i++){
        	System.out.println("第"+(i+1)+"个score对象为：");
        	score = scoreList.get(i);
        	System.out.println(score);
        }
		
	}
	
	public void insertScore() throws Exception{
		Map<String, Integer> param = new HashMap<String, Integer>() ;
		param.put("page", 0);
		param.put("size", 10);
		List<User> userList = userService.getPageUsers(param);
		User user = userList.get(0);
		
		Score score = new Score();
		score.setUser(user);
		score.setChinese(80);
		score.setComputer(90);
		score.setEnglish(91);
		score.setMath(98);
		scoreSerice.insertScore(score);
	}
	
	public List<Score> getScore() throws Exception{
		Map<String, Integer> param = new HashMap<String, Integer>() ;
		param.put("page", 0);
		param.put("size", 10);
		List<User> userList = (List<User>) userService.getPageUsers(param);
		User user = userList.get(0);
		List<Score> scoreList = scoreSerice.getScoreByUser(user);
		return scoreList;
	}
	
}

