package ch07.Domain;

import java.util.ArrayList;

public class Student{
    int studentId;
    String name;
    ArrayList<Subject> subjects;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        subjects = new ArrayList<Subject>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSubject(String name , int score) {
        Subject subject = new Subject();
        subject.setSubject_name(name);
        subject.setScore(score);
        this.subjects.add(subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
