package by.bsu.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.bsu.application.models.Student;
import by.bsu.application.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	 private StudentRepository studentRepository;

	
	


	public Iterable<Student> listAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}



	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.findOne(id);
	}



	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}



	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepository.delete(id);
	}

}
