package com.helpp.Flow.Domain.Entity;

import javax.persistence.*;

@Entity
@Table(name="pessoa_juridica")
public class PessoaJuridica {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     Long id;
     String nome;

     public Long getId() {
          return id;
     }
     public void setId(Long id) {
          this.id = id;
     }
     public String getNome() {
          return nome;
     }
     public void setNome(String nome) {
          this.nome = nome;
     }
}
