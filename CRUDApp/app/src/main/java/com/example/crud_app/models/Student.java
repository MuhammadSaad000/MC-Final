package com.example.crud_app.models;

public class Student {
    private int id ;
    private String name;
    private  String rollno;
    private Boolean isenrolled;

    public Student(){

    }


    public Student(String name, String rollno, Boolean isenrolled) {
        this.name = name;
        this.rollno = rollno;
        this.isenrolled = isenrolled;
    }

    public Student(int id, String name, String rollno, Boolean isenrolled) {

        this.name = name;
        this.rollno = rollno;
        this.isenrolled = isenrolled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public Boolean getIsenrolled() {
        return isenrolled;
    }

    public void setIsenrolled(Boolean isenrolled) {
        this.isenrolled = isenrolled;
    }
}
