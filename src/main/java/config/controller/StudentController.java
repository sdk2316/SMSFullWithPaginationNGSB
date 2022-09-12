package config.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import config.model.Student;
import config.service.IStudentService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class StudentController {
	
	@Autowired
	private IStudentService studentservice;
	
	@PostMapping("save-student")
	public Student saveStudent(@RequestBody Student student) {
		 return studentservice.saveStudent(student);
		
	}
	
	@GetMapping("students-list")
	public List<Student> allstudents() {
		 return studentservice.getStudents();
	}
	
	
	@DeleteMapping("delete-student/{student_id}")
	public void deleteStudent(@PathVariable("student_id") int student_id) {
	
	 studentservice.deleteStudent(student_id);
	}

	@GetMapping("student/{student_id}")
	public Student allstudentByID(@PathVariable("student_id") int student_id) {
		
		 return studentservice.getStudentByID(student_id);
		
	}
	
	@PostMapping("update-student/{student_id}")
	public Student updateStudent(@RequestBody Student student) {
		
		return studentservice.updateStudent(student);
	}
}

