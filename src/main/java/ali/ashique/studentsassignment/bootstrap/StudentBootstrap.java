package ali.ashique.studentsassignment.bootstrap;

import ali.ashique.studentsassignment.model.Student;
import ali.ashique.studentsassignment.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AllArgsConstructor
public class StudentBootstrap {

    private StudentService studentService;

    @PostConstruct
    void save(){
        Student maryam = new Student("Maryam", "None");
        Student ashique = new Student("Ashique Ali", "Mahar");
        Student habibullah = new Student("Habibullah", "Mahar");

        studentService.save(maryam);
        studentService.save(ashique);
        studentService.save(habibullah);
    }
}
