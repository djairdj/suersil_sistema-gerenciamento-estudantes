package tech.ada.gerenciamentoestudantes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioTurma extends JpaRepository<Turma, Long> {
}
