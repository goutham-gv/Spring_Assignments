package ques4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		StudentController controller=(StudentController) context.getBean("studentController");
		Student student=controller.createNewStudent();
		System.out.println("Student Name : "+student.getStudentName());
		System.out.println("Student Age : "+student.getAge());

	}

}