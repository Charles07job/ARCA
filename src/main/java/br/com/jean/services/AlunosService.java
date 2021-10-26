package br.com.jean.services;

import br.com.jean.model.Alunos;
import br.com.jean.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlunosService {

    @Autowired
    private AlunosRepository alunosRepository;

    public List<Alunos> buscarAlunos() {
        return alunosRepository.findAll();
    }

    public Alunos buscarPorMatricula(Long matricula) {
        return alunosRepository.findById(matricula).get();
    }
}
