package ques7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
		Spell obj=factory.getBean(Spell.class);
		obj.general();
		Student obj2 = (Student) factory.getBean("student");
		System.out.println("List/Map");
		System.out.println("From Map: "+obj2.getStu1()); 
		  System.out.println("From List: "+obj2.getList()); 

	}

}
