 package com.wujiang.entity;

public class Score {
	
	private Integer id ;//����id
	
	private User user;//�����û�
	
	private int math ;//��ѧ�ɼ�
	
	private int chinese ;//���ĳɼ�
	
	private int english ;//Ӣ��ɼ�
	
	private int computer ;//������ɼ�
	
	public Score(){
		
	}
	
	public Score(User user, int math,int chinese,int english,int computer){
		this.user = user;
		this.math = math;
		this.chinese = chinese;
		this.english = english;
		this.computer = computer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		this.chinese = chinese;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}
	
	public String toString(){
		return "id = "+ this.id+",math = "+this.math+",chinese = "+this.chinese+",english = "+this.english+",computer = "+this.computer+
				", userid = "+this.user.getId()+",username = "+this.user.getUsername()+",password = "+this.user.getPassword()+
				",address = "+this.user.getAddress();
	}

}

