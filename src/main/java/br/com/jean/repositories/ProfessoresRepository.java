package br.com.jean.repositories;

import br.com.jean.model.Professores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfessoresRepository extends JpaRepository<Professores,Long> {
    @Override
    Optional<Professores> findById(Long matricula);
}
