package com.lc.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
	
	private int id;
	
	private String name;
	
	private Set<String> sets;
	private List<String> lists;
	private String[] strs;
	private Map<String,String> maps;
	
	//依赖注入
	private Desk desk;
	
	
	

	
	
	
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", sets=" + sets + ", lists=" + lists + ", strs="
				+ Arrays.toString(strs) + ", maps=" + maps + ", desk=" + desk + "]";
	}


	
	

	public Desk getDesk() {
		return desk;
	}





	public void setDesk(Desk desk) {
		this.desk = desk;
	}





	public Set<String> getSets() {
		return sets;
	}



	public void setSets(Set<String> sets) {
		this.sets = sets;
	}



	public List<String> getLists() {
		return lists;
	}



	public void setLists(List<String> lists) {
		this.lists = lists;
	}



	public String[] getStrs() {
		return strs;
	}



	public void setStrs(String[] strs) {
		this.strs = strs;
	}



	public Map<String, String> getMaps() {
		return maps;
	}



	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("注入id");
		this.id = id;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		System.out.println("注入name");
		this.name = name;
	}
	
	public People() {
		System.out.println("执行无参构造");
	}

	public People(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("执行有参构造");
	}
	
	
	
	
	

}
