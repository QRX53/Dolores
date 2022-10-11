package com.example.dolores.bosque.data;

public class User {

    private String password;
    private String id;
    private String username;
    private String email;
    private Grades grades;
    public String tutoring;

    public User() {}

    public User(String password, String id, String username, String email, Grades grades) {
        this.password = password;
        this.id = id;
        this.username = username;
        this.email = email;
        this.grades = grades;
        this.tutoring = "No";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setTutoring() {
        this.tutoring = "Yes";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }
}
