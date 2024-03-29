package br.com.jean.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name = "alunos")
@Entity
public class Alunos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricula;
    private String nome;
    private int idade;
    private Long contato;
    private String responsavelLegal;
    private String endereco;
    private String serieAtual;
    private Long identidade;
    private Long cpf;
    private float nota;
    private float media;
}
