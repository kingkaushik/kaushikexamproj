package com.zemoso.example.kaushikexamproj.students;

import java.util.Arrays;
import java.util.List;

public class StudentService {
    private List<Student> details= Arrays.asList(
            new Student(101,"John",75,3),
            new Student(102,"Henry",99,1),
            new Student(103,"Charles",93,1));
    public List<Student> getStudents() {
        return details;
    }

    public Student getStudentByIdid(int id) {
        return details.stream().filter(i->i.getRoolno()==id).findFirst().get();
    }
}
