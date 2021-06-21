package ques4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller("studentController")
public class StudentController {
	
	@Autowired	
	StudentService studentService;
	
	public Student createNewStudent() {
		return studentService.createNewStudent();
	}

}