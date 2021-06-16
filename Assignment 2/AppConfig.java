package ques2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="ques2")
public class AppConfig {
	
	@Bean
	public List<String> answer1(){
		List<String> list = Arrays.asList("Cat", "Elephant", "Tiger", "Lion", "Cat");
				return list;
	}
	
	@Bean
	public Set<String> answer2(){
		
		Set<String> set= new LinkedHashSet<String>();
		set.add("Bear");
		set.add("Bear");
		set.add("Lion");
		set.add("Mouse");
		set.add("Cat");
		return set;
	
	}
	
	@Bean
	public Map <Integer, String> answer3(){
		Map <Integer, String>  map=new LinkedHashMap<Integer, String>();
		map.put(110, "Cat");
		map.put(120, "Tiger");
		map.put(150, "Lion");
		map.put(170, "Cat");
		
		return map;
	}
	

}
