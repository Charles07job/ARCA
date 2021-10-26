package br.com.jean.resources;

import br.com.jean.model.Alunos;
import br.com.jean.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunosResource {

    @Autowired
    private AlunosRepository alunosRepository;

    @GetMapping
    public ResponseEntity<List<Alunos>> buscarAlunos() {
        List<Alunos> alunos = alunosRepository.findAll();
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping(value = "/{matricula}")
    public Alunos buscarAluno(@PathVariable Long matricula){
        return this.alunosRepository.findById(matricula).orElse(null);
    }

    @PostMapping(value = "/{cadastros}")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarAlunos(@RequestBody Alunos alunos) {
        alunosRepository.save(alunos);
    }
}
