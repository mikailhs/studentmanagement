package com.misal.studentmanagement.api;

import com.misal.studentmanagement.domain.Student;
import com.misal.studentmanagement.repository.StudentRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Getter
@Setter


public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<StudentDTO> getAllStudents() {
        List<Student> all = repo.findAll();
        return all.stream().map(this::buildDTO).toList();
    }

    private StudentDTO buildDTO(Student student) {
        return new StudentDTO(student.getId(), student.getName(), student.getAge(), student.getEmail());
    }

    public StudentDTO getStudentById(Long id) {
              return buildDTO(repo.findById(id).orElse(new Student()));
    }

    public void updateStudent(Long id, StudentDTO studentDTO) {
        repo.findById(id).ifPresentOrElse(student -> {
            student.setName(studentDTO.getName());
            repo.save(student);
        }, () -> {
            throw new IllegalArgumentException("Student not found with id: " + id);
        });
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }


}










