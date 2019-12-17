package ali.ashique.studentsassignment.repo;

import ali.ashique.studentsassignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
