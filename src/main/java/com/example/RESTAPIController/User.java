package com.example.RESTAPIController;

public class User {
    private int id;
    private String name;
    private int number;
    private String mail;

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    User(int id, String name, int number, String mail){
        this.id=id;
        this.name=name;
        this.number=number;
        this.mail=mail;
    }
}
