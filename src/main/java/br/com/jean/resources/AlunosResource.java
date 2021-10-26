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

    @GetMapping(value = "{/matricula}")
    public ResponseEntity<List<Alunos>> buscarAlunos() {
        List<Alunos> alunos = alunosRepository.findAll();
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping(value = "{/codigo}")
    public ResponseEntity<Alunos> buscarAluno(@PathVariable Long matricula){
        Alunos alunos =  alunosRepository.getOne(matricula);
        return alunos != null ? ResponseEntity.ok(alunos) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "{/cadastros}")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarAlunos(@RequestBody Alunos alunos) {
        alunosRepository.save(alunos);
    }



}
