package tns.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="student21")
public class Student {
@Id
@GeneratedValue
long id;
String name;
String college;
int roll;
String qualification; 
String course ;
int year;
int hallticket;
public Student() {
super();
// TODO Auto-generated constructor stub
}
public Student(long id,String name,String college,int roll,String qualification,String course,int year,
int hallticket) {
super();
this.id = id;
this.name = name;
this.college = college;
this.roll = roll;
this.qualification = qualification;
this.course = course;
this.year = year;
this.hallticket = hallticket;
}
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getCollege() {
return college;
}
public void setCollege(String college) {
this.college = college;
}
public int getRoll() {
return roll;
}
public void setRoll(int roll) {
this.roll = roll;
}
public String getQualification() {
return qualification;
}
public void setQualification(String qualification) {
this.qualification = qualification;
}
public String getCourse() {
return course;
}
public void setCourse(String course) {
this.course = course;
}
public int getYear() {
return year;
}
public void setYear(int year) {
this.year = year;
}
public int getHallticket() {
return hallticket;
}
public void setHallticket(int hallticket) {
this.hallticket = hallticket;
}
}