package br.com.jean.resources;

import br.com.jean.model.Professores;
import br.com.jean.repositories.ProfessoresRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/professores")
public class ProfessoresResource {

    @Autowired
    ProfessoresRepository professoresRepository;

    @GetMapping
    public ResponseEntity<List<Professores>> buscarTodosProfessores() {
        List<Professores> professores = professoresRepository.findAll();
        return ResponseEntity.ok().body(professores);
    }

    @GetMapping(value = "/{matricula}")
    public Professores buscarProfessor(@PathVariable Long matricula) {
        return this.professoresRepository.findById(matricula).orElse(null);
    }

    @PostMapping(value = "/{cadastros}")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarProfessores(@RequestBody Professores professores) {
        professoresRepository.save(professores);
    }

    @DeleteMapping(value = "/{matricula}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long matricula){
        professoresRepository.deleteById(matricula);
    }

    @PutMapping(value = "/{matricula}")
    public Professores atualizarProfessores(@PathVariable Long matricula, @RequestBody Professores professores) {
        Professores professoresSalva = this.professoresRepository.findById(matricula)
                .orElseThrow(() -> new EmptyResultDataAccessException(1));
        BeanUtils.copyProperties(professores, professoresSalva, "matricula");
        return this.professoresRepository.save(professoresSalva);
    }
}