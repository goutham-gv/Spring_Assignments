package ques9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SprinMain {
	
	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		helloworld obj=(helloworld)context.getBean("helloworld");
		((AbstractApplicationContext) context).close();
		
	}

}
