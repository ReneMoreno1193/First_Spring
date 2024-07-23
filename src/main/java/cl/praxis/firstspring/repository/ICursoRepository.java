package cl.praxis.firstspring.repository;

import cl.praxis.firstspring.entity.Curso;
import cl.praxis.firstspring.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
