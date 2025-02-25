package com.misal.studentmanagement.domain;

import jakarta.persistence.*;  // Импорт всех нужных аннотаций

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String email;

}
