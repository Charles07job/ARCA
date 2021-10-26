package br.com.jean.services;

import br.com.jean.model.Professores;
import br.com.jean.repositories.ProfessoresRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProfessoresService {

    @Autowired
    private ProfessoresRepository professoresRepository;

    public List<Professores> buscarProfessores(){
        return professoresRepository.findAll();
    }

    public Professores buscarPorMatricula(Long matricula){
        return professoresRepository.findById(matricula).get();
    }
}
