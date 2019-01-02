package com.zemoso.example.kaushikexamproj.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/Students")
    public List<Student> details(){
        return studentService.getStudents();}
    @RequestMapping("/Students/{id}")
    public Student get(@PathVariable int id)
    {
        return studentService.getStudentByIdid(id);
    }

}
