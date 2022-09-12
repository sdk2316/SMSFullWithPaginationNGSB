package config.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import config.model.Student;
import config.repository.StudentRepo;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	StudentRepo  studentRepo ;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

	@Override
	public Student getStudentByID(Integer id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent( Student student) {
		
		
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	
}
