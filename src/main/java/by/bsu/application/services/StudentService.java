package by.bsu.application.services;

import by.bsu.application.models.Student;

public interface StudentService {

	Iterable<Student> listAllStudents();

	Student getStudentById(Integer id);
	
	Student saveStudent(Student student);
	
	void deleteStudent(Integer id);
}
