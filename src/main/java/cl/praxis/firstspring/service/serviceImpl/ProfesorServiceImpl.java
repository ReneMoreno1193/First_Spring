package cl.praxis.firstspring.service.serviceImpl;

import cl.praxis.firstspring.entity.Profesor;
import cl.praxis.firstspring.repository.IProfesorRepository;
import cl.praxis.firstspring.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("profesorServiceImpl")
public class ProfesorServiceImpl implements IProfesorService {
    @Autowired
    private IProfesorRepository profesorRepository;

    @Override
    public Profesor getProfesor(long id) {
        Profesor profesor = profesorRepository.findById(id).orElse(null);
        return profesor;
    }

    @Override
    public List<Profesor> getAllProfesor() {
        return profesorRepository.findAll();
    }

    @Override
    public Profesor savePersona(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public Profesor updateProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public void deleteProfesor(Long id) {
        profesorRepository.deleteById(id);

    }
}
