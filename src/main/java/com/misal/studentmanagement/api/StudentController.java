package com.misal.studentmanagement.api;

import com.misal.studentmanagement.domain.Student;
import com.misal.studentmanagement.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class StudentController {
 private final StudentService studentService;
 public StudentController(StudentService studentService) {
     this.studentService = studentService;
 }

    @GetMapping("/students")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/student/{id}")
    public void  updateStudent(@PathVariable Long id, @RequestBody StudentDTO studentDTO) {
        studentService.updateStudent(id, studentDTO);
    }


    }
