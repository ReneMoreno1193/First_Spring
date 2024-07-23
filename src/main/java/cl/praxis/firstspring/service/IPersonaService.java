package cl.praxis.firstspring.service;

import cl.praxis.firstspring.entity.Persona;

import java.util.List;

public interface IPersonaService {// Implementar un CRUD
    Persona getPersona(long id);
    List<Persona> getAllPersona();
    Persona savePersona(Persona persona);
    Persona updatePersona(Persona persona);
    void deletePersona(Long id);
}
