package com.lc.entity;

public class Person {
    private Integer id;

    private String personName;

    private String personPwd;

    public Person(Integer id, String personName, String personPwd) {
        this.id = id;
        this.personName = personName;
        this.personPwd = personPwd;
    }

    public Person() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonPwd() {
        return personPwd;
    }

    public void setPersonPwd(String personPwd) {
        this.personPwd = personPwd == null ? null : personPwd.trim();
    }
}