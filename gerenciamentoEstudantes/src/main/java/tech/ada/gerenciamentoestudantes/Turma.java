package tech.ada.gerenciamentoestudantes;

import jakarta.persistence.*;

@Entity
@Table(name = "turmas")
public class Turma {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  //Chave primária - auto-incrementar
  private Long id;
  private String idTurma;
  private String listaIdEstudantes;

  // Getters and setters
}
