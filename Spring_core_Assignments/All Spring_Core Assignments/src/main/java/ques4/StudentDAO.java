package ques4;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

	public Student createNewStudent() {
		Student student=new Student("Ashutosh",22);
		return student;
	}
}