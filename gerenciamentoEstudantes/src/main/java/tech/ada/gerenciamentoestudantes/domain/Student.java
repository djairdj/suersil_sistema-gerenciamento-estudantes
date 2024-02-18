package tech.ada.gerenciamentoestudantes.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Student {
  //Matricula * Chave primária - auto-incrementado
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String nomeResponsavel;
  private String dataNascimento;
  private String contatoResponsavel;
  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private Class turma;
}