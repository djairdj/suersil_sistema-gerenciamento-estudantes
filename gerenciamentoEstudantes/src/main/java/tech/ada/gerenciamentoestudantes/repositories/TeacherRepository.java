package tech.ada.gerenciamentoestudantes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ada.gerenciamentoestudantes.domain.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
