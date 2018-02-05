package com.poran.gsonpractise;

/**
 * Created by poran on 06-Feb-18.
 */

public class Student {
    String studentName;
    String studentId;
    String department;
    String studentMail;
    double studentCgpa;
    boolean isRetake;

    public Student(String studentName, String studentId, String department, String studentMail, double studentCgpa, boolean isRetake) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.department = department;
        this.studentMail = studentMail;
        this.studentCgpa = studentCgpa;
        this.isRetake = isRetake;
    }
}
