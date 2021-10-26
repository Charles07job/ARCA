package br.com.jean.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "professores")
@Entity
public class Professores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricula;
    private String nome;
    private int idade;
    private Long contato;
    private String responsavelLegal;
    private String endereco;
    private String grauInstrucao;
    private Long identidade;
    private Long cpf;
}
