package com.vidyesh.gsonexample2;

import com.google.gson.annotations.Expose;

public class Employee {
    @Expose
    private String firstName;
    @Expose(serialize = false)
    private int age;
    @Expose(deserialize = false)
    private String mail;
    /*private transient String password;*/
    private String password;

    public Employee(String firstName, int age, String mail, String password) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        this.password = password;
    }
}
