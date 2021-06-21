package ques3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDemoAssignm3Application {
    @Autowired
	public static void main(String[] args) {
		ApplicationContext factory =new AnnotationConfigApplicationContext(BankAccountController.class);
		BankAccountServiceImpl B1= factory.getBean(BankAccountServiceImpl.class);
		B1.deposit(0,0);
		System.out.println("Hello");
		
	}

}
