package com.misal.studentmanagement.controller;

import com.misal.studentmanagement.model.Student;
import com.misal.studentmanagement.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor  // Lombok автоматически создаст конструктор с final полями
public class StudentController {

    private final StudentRepository studentRepository;

    // Получить всех студентов
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Получить студента по ID
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    // Добавить нового студента
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // Удалить студента по ID
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }


}
