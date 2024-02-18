package tech.ada.gerenciamentoestudantes.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "professores")

public class Teacher {
  //Chave Primária
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String disciplinaLecionada;
}
