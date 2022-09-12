package com.example.crud_app;

public class Student {
    private int Id;
    private String Name ;
    private String Rollno;
    private Boolean isEnrolled;

    public Student() {
    }

    public Student(int id, String name, String rollno, Boolean isEnrolled) {
        Id = id;
        Name = name;
        Rollno = rollno;
        this.isEnrolled = isEnrolled;
    }

    //to print object


    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Rollno='" + Rollno + '\'' +
                ", isEnrolled=" + isEnrolled +
                '}';
    }

    //getters and setters
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollno() {
        return Rollno;
    }

    public void setRollno(String rollno) {
        Rollno = rollno;
    }

    public Boolean getEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(Boolean enrolled) {
        isEnrolled = enrolled;
    }
}
