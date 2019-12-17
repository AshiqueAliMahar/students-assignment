package ali.ashique.studentsassignment.controller;

import ali.ashique.studentsassignment.model.Student;
import ali.ashique.studentsassignment.service.StudentService;
import ali.ashique.studentsassignment.service.StudentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    @GetMapping({"/",""})
    List<Student> getAllStudents(){
        return studentService.findAll();
    }

    @PostMapping({"/",""})
    Student save(@RequestBody Student student){
        return studentService.save(student);
    }
}
