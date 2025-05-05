package br.com.fiap.checkpoint2.repository;

import org.springframework.stereotype.Repository;
import com.github.samucafialho.study_apir.model.Profissional;

@Repository
public interface PacienteRepository extends JpaRepository<Profissional, Long>{

}
