package com.rashed.dao;

import java.util.List;

import com.rashed.model.Student;

public interface StudentDAO {

	public int save(Student st) throws Exception;

	public boolean update(Student st) throws Exception;

	public boolean delete(Student st) throws Exception;

	public Student findById(int studentId) throws Exception;

	public List<Student> findByName(String name) throws Exception;

	public Student findByEmail(String email) throws Exception;

	public List<Student> findAll() throws Exception;

}
