package tech.ada.gerenciamentoestudantes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ada.gerenciamentoestudantes.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
