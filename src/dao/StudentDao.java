package dao;

import java.util.List;

import models.Student;

public interface StudentDao {
	public Integer addStudent(Student student);
	public Integer updateStudent(Student student);
	public Integer deleteStudent(Student student);
	public Student getStudentById(Integer studentId);
	public Integer getStudentIdByName(String studentName);
	public List<Student> getAllStudent();

}
