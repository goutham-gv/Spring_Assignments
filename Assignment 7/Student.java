package ques7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Student {
	@Value("#{mapList.map['stu1']}")
	private String stu1;	
 
	@Value("#{mapList.list[0]}")
	private String list;
 
	public String getStu1() {
		return stu1;
	}
 
	public void setStu1(String stu1) {
		this.stu1 = stu1;
	}
 
	public String getList() {
		return list;
	}
 
	public void setList(String list) {
		this.list = list;
	}
 
}
