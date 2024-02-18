package tech.ada.gerenciamentoestudantes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ada.gerenciamentoestudantes.domain.Class;

public interface ClassRepository extends JpaRepository<Class, Long> {
}
