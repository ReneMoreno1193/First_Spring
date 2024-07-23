package cl.praxis.firstspring.repository;

import cl.praxis.firstspring.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {


}
