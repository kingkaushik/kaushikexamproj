package com.zemoso.example.kaushikexamproj.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
    public int roolno;
    public String name;
    public int marks;
    public int rank;

    public Student(int roolno, String name, int marks, int rank) {
        this.roolno = roolno;
        this.name = name;
        this.marks = marks;
        this.rank = rank;
    }

    public int getRoolno() {
        return roolno;
    }

    public void setRoolno(int roolno) {
        this.roolno = roolno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
