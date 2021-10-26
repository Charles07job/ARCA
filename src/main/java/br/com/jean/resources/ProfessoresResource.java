package br.com.jean.resources;

import br.com.jean.model.Professores;
import br.com.jean.repositories.ProfessoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/professores")
public class ProfessoresResource {

    @Autowired
    ProfessoresRepository professoresRepository;

    @GetMapping(value = "{/matricula}")
    public ResponseEntity<List<Professores>> buscarTodosProfessores() {
        List<Professores> professores = professoresRepository.findAll();
        return ResponseEntity.ok().body(professores);
    }

    @GetMapping(value = "{/codigo}")
    public ResponseEntity<Professores> buscarProfessor(@PathVariable Long matricula) {
        Professores professores = this.professoresRepository.getOne(matricula);
        return professores != null ? ResponseEntity.ok(professores) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "{/cadastros}")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarProfessores(@RequestBody Professores professores) {
        professoresRepository.save(professores);
    }
}