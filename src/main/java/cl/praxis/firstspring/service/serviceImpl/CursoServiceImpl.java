package cl.praxis.firstspring.service.serviceImpl;

import cl.praxis.firstspring.entity.Curso;
import cl.praxis.firstspring.repository.ICursoRepository;
import cl.praxis.firstspring.service.ICurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cursoServiceImpl")
public class CursoServiceImpl implements ICurso {
    @Autowired
    public ICursoRepository cursoRepository;

    @Override
    public Curso getCurso(long id) {
        Curso curso = cursoRepository.findById(id).orElse(null);
        return curso;
    }

    @Override
    public List<Curso> getAllCurso(){
        return cursoRepository.findAll();
    }

    @Override
    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso updateCrurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);

    }
}
