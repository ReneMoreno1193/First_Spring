package cl.praxis.firstspring.service.serviceImpl;

import cl.praxis.firstspring.entity.Persona;
import cl.praxis.firstspring.repository.IPersonaRepository;
import cl.praxis.firstspring.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personaServiceImpl")//nombre de ruta
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaRepository personaRepository; //acá va la variable con la instancia de la clase del repositorio que está conectada con la base de datos

    @Override
    public Persona getPersona(long id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        return persona;
    }

    @Override
    public List<Persona> getAllPersona() {
        return personaRepository.findAll();
    }

    @Override
    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona updatePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);

    }
}
