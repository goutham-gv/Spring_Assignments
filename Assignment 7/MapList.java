package ques7;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MapList {
	private Map<String, String> map;
	private List<String> list;
 
	public MapList() {
		map = new HashMap<String, String>();
		map.put("stu1", "Mahesh");
		map.put("stu2", "Vivek");
		map.put("stu3", "Bharat");
 
		list = new ArrayList<String>();
		list.add("Nidhi");
		list.add("Prabhjot");
		list.add("Amani");
 
	}
 
	public Map<String, String> getMap() {
		return map;
	}
 
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
 
	public List<String> getList() {
		return list;
	}
 
	public void setList(List<String> list) {
		this.list = list;
	}
}