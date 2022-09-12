package config.service;

import java.util.List;

import config.model.Student;

public interface IStudentService {
	
	public Student saveStudent(Student student);
	public List<Student> getStudents();
	public void deleteStudent(Integer id);
	public Student getStudentByID(Integer id);
	public Student updateStudent(Student student);

}
