import dao.StudentDao;
import daoimpl.StudentDaoImpl;
import models.Student;
import sun.print.resources.serviceui;

public class main {
	
	public static void main(String args[]) {
		
		
		StudentDao studentDaoImpl = new StudentDaoImpl();
		
		
		Student student = new Student();
		student.setId(1);
		student.setName("Naresh");
		student.setEmail("Naresh@gmail.com");
		student.setGender("Male");
		student.setContact("1234");
		student.setCountry("Pak");
		
		//studentDaoImpl.addStudent(student);
		
		Student student2 = studentDaoImpl.getStudentById(1);
		
		student2.setCountry("UK");
		
		//studentDaoImpl.updateStudent(student2);
		
		//studentDaoImpl.deleteStudent(student);
		
		
		//System.out.println("Name : "+student2.getName());
		
		
		
		
		
		
	}
	

}
