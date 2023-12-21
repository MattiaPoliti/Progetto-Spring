package com.student.service;

import java.util.Collection;

import javax.inject.Inject;

import com.student.core.Student;


public interface StudentService {
	@Inject
	Student get(long id);
	Collection<Student> getAllStudents();
	Collection<Student> getAllStudentsInDepartment(String department, String lastNamelike);
	void add(Student student);
}
