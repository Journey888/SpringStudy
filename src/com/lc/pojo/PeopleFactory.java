package com.lc.pojo;

public class PeopleFactory {

	//变为静态工厂
	public static People newInstance1() {
		return new People(6,"enen");
	}
	
	//实例工厂
	public People newInstance() {
		return new People(5,"haha");
	}
}
