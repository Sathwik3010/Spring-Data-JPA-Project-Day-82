package com.codegnan.service;

import java.util.List;

import com.codegnan.entity.Student;
import com.codegnan.exceptions.InvalidStudentIdException;

public interface StudentService {
	public Student saveStudent(Student student);

	public Student findStudentById(int id) throws InvalidStudentIdException;

	public List<Student> findAllStudents();

	public Student edit(Student student) throws InvalidStudentIdException;

	public Student deleteStudent(int id) throws InvalidStudentIdException;
}
