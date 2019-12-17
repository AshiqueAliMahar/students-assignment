package ali.ashique.studentsassignment.service;

import ali.ashique.studentsassignment.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student save(Student student);
}
