package net.javaguides.sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="Students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
	
	@Column(name= "first_name" , nullable=false)
	private String firstname;
	
	@Column(name= "last_name")
	private String lastname;
	
	@Column(name="email")
	private String email;
  
  public Student() {
	  
  }
  public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLstname() {
	return lastname;
}
public void setLstname(String lstname) {
	this.lastname = lstname;
}
public String getEmail() {
	return email;
}
public Student(String firstname, String lstname, String email) {
	super();
	this.firstname = firstname;
	this.lastname = lstname;
	this.email = email;
}
public void setEmail(String email) {
	this.email = email;
}

}
