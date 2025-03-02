package com.misal.studentmanagement.response;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentResponseDTO {
    private Long id;
    private String name;
    private String email;

    public StudentResponseDTO() {

    }
}
