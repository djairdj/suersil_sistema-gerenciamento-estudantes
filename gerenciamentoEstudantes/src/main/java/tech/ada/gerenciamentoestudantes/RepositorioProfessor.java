package tech.ada.gerenciamentoestudantes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProfessor extends JpaRepository<Professor, Long> {
}
