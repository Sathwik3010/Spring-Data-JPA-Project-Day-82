package com.codegnan;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegnan.entity.Student;
import com.codegnan.exceptions.InvalidStudentIdException;
import com.codegnan.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("spring.xml");
        StudentService studentService = context.getBean(StudentService.class);
        
//        Student student1 = new Student("Dev","Dev@gmail.com");
//        Student student2 = new Student("arjun","arjun@gmail.com");
//        Student student3 = new Student("Sudheer","sudheer@gmail.com");
//        studentService.saveStudent(student1);
//        studentService.saveStudent(student2);
//        studentService.saveStudent(student3);
//        System.out.println("Students are saved successfully");
        
//        List<Student> students = studentService.findAllStudents();
//        for(Student s : students) {
//        	System.out.println(s);
//        }
        
        // find student by id 2
//        try {
//			Student student = studentService.findStudentById(2);
//			System.out.println(student);
//		} catch (InvalidStudentIdException e) {
//			e.printStackTrace();
//		}
        
        // update student id 1
//        try {
//        Student student = studentService.findStudentById(2);
//        student.setName("Dev");
//        student.setEmail("psde@");
//			studentService.edit(student);
//      System.out.println("Student updated successfully");
//		} catch (InvalidStudentIdException e) {
//			e.printStackTrace();
//		}
        
        try {
			Student deletedStudent=studentService.deleteStudent(3);
			System.out.println("Deleted Student: "+deletedStudent);
		} catch (InvalidStudentIdException e) {
			e.printStackTrace();
		}
    }
}
