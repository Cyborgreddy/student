package tns.student.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tns.student.entity.Student;
import tns.student.service.StudentService;
/**
* @Rest controller : EmployeeController : Acts as Rest Controler
* "/employees" - All the end points should be prepended with employees
* (@RequestBody Employee employee) annotation known as request body it takes the json and it converts 
* the json to the employee so we* are going to pass the json from our postman and that json will be
* converted to the employee object
* @PostMapping : signifies that we want to create a new entity in our database
* @PathVariable : Get the value from URL
*/
@RestController
public class StudentController {
@Autowired
StudentService studentService;
// http://localhost:8071/student - Post
@RequestMapping("/student")
public String student() {
	return "welcome";
}
@PostMapping("/add")
public Student addStudent(@RequestBody Student student)
{
return studentService.save(student);
}
// http://localhost:8071/student/2 - Get
@GetMapping(path="/get/{id}")
public Student getStudent(@PathVariable long id)
{
return studentService.getStudent(id);
}
// http://localhost:8071/student/2 - Put
@PutMapping(path="/update/{id}")
public Student updateStudent(@RequestBody Student student, @PathVariable long id)
{
return studentService.update(id,student);
}
// http://localhost:8071/student/2 - Delete
@DeleteMapping(path="/delete/{id}")
public String deleteStudent(@PathVariable int id)
{
return studentService.delete(id); 
}
// http://localhost:8071/student Get
@GetMapping("/record")
public List<Student> getAllStudents()
{
return studentService.getStudlist();
}
}
