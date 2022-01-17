package ch07;

import ch07.Domain.Student;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.setSubject("국어", 100);
        studentLee.setSubject("수학", 50);

        Student studentKim = new Student(1002, "Kim");
        studentKim.setSubject("국어", 70);
        studentKim.setSubject("수학", 85);
        studentKim.setSubject("영어", 100);

        System.out.println("studentKim.toString() = " + studentKim.toString());
        System.out.println("studentLee.toString() = " + studentLee.toString());
    }
}
