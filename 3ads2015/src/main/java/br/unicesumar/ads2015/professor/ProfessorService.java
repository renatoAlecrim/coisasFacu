
package br.unicesumar.ads2015.professor;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Transactional
public class ProfessorService {
    
    @Autowired
    private ProfessorRepository repository;
    
    public void salvar (Professor p){
        repository.save(p);
    }
    
    public List<Professor> getProfessores (){
        return repository.findAll();
    }
    
    public void editar(Professor p){
        repository.save(p);
    }
    
    public void excluir (Long id){
        repository.delete(id);
    }
    
}
