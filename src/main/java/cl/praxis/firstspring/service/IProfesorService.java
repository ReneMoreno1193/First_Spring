package cl.praxis.firstspring.service;

import cl.praxis.firstspring.entity.Profesor;

import java.util.List;

public interface IProfesorService {
    Profesor getProfesor(long id);

    List<Profesor> getAllProfesor();
    Profesor savePersona(Profesor profesor);
    Profesor updateProfesor(Profesor profesor);
    void deleteProfesor(Long id);
}
