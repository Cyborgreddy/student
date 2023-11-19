package tns.student.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tns.student.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Long> {
}