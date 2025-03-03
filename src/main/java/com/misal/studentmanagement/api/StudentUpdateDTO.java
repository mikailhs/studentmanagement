package com.misal.studentmanagement.api;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentUpdateDTO {

    private String name;


    public StudentUpdateDTO(String name) {
        this.name = name;
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return name;
    }

}
