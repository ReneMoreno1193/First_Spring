package cl.praxis.firstspring.service;

import cl.praxis.firstspring.entity.Curso;

import java.util.List;

public interface ICurso {
    Curso getCurso(long id);
    List<Curso> getAllCurso();
    Curso saveCurso(Curso curso);
    Curso updateCrurso(Curso curso);
    void deleteCurso(Long id);


}

