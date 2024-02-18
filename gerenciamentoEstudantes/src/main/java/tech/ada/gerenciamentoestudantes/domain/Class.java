package tech.ada.gerenciamentoestudantes.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "turmas")
public class Class {
  //Chave primária - auto-incrementar
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String idTurma;
  @OneToMany(mappedBy = "turma")
  @JsonBackReference
  private List<Student> listaIdEstudantes;
}
