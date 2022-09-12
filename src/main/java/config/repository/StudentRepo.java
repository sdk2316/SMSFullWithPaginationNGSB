package config.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import config.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
