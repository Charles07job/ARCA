package br.com.jean.repositories;

import br.com.jean.model.Professores;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfessoresRepository extends JpaRepository<Professores,Long> {
}
