package ques4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	public Student createNewStudent() {
		return studentDAO.createNewStudent();
	}
	
}