package br.unicesumar.ads2015.professor;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Professores")
public class ProfessorController {
    
    @Autowired
    private ProfessorService service;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Professor> getProfessores (){
        return service.getProfessores();
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void postProfessor (@RequestBody Professor p){
        service.salvar(p);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public void putProfessor (@RequestBody Professor p){
        service.editar(p);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProfessor (@PathVariable Long id){
        service.excluir(id);
    }
    
}
