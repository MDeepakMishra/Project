package net.javaguides.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.service.StudentService;

@Controller
public class StudentController {
	@Autowired
   private  StudentService studentService ;

public StudentController(StudentService studentService) {
	super();
	this.studentService = studentService;
}
   //hander method to handle list student and return mode and view
   @GetMapping("/students")
   public String listStudents(Model model) {
	   
	   model.addAttribute("students", studentService.getAllStudents());
	   return "students";
   }@GetMapping
   public String createStudentForm(Model model) {
	   // create student object to hold student form data 
	   Student student = new Student();
	   model.addAttribute("student" , student);
	   return "create_student";
   }	
   @PostMapping("/students")
   public String saveStudent(@ModelAttribute("student") Student students){
	   studentService.saveStudent(students);
	   return "redirect:/students";
   }
}
