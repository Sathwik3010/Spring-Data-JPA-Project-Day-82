package com.codegnan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codegnan.entity.Student;
import com.codegnan.exceptions.InvalidStudentIdException;
import com.codegnan.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student findStudentById(int id) throws InvalidStudentIdException {
		Optional<Student> optStudent = studentRepository.findById(id);
		if(!optStudent.isPresent()) {
			throw new InvalidStudentIdException("Student Id: "+id+ " Not Available");
			
		}
		return optStudent.get();
	}

	@Override
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student edit(Student student) throws InvalidStudentIdException {
		findStudentById(student.getId());
		return studentRepository.save(student);
	}

	@Override
	public Student deleteStudent(int id) throws InvalidStudentIdException {
		Student student = findStudentById(id);
		studentRepository.deleteById(id);
		return student;
	}

}
