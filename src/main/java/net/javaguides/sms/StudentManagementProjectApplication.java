package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagementProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementProjectApplication.class, args);
	}
	  @Autowired
	  private StudentRepository studentRepository;
	  
      @Override
      public void run(String...args) throws Exception{
    	  
       /* Student student1 = new Student("Ramesh" , "Kumar","deepak123@gmail.com");
        studentRepository.save(student1);
        
        Student student2= new Student("Deepak", "Mishra", "Roshan123@gmail.com");
        studentRepository.save(student2);
        
        Student student3= new Student("Mohan", "Singh", "Mohan123@gmail.com");
        studentRepository.save(student3);ssssss
        */
        
        
      }
}
