package com.misal.studentmanagement.api;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDTO {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String email;

    public StudentDTO(Long id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }


    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
