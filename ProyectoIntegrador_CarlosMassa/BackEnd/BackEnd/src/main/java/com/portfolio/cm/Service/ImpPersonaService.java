package com.portfolio.cm.Service;

import com.portfolio.cm.Entity.Persona;
import com.portfolio.cm.Interface.IPersonaService;
import com.portfolio.cm.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepoistory;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepoistory.findAll();
        return persona;
        
    }


    @Override
    public void savePersona(Persona persona) {
        
        ipersonaRepoistory.save(persona);
        
    }

    @Override
    public void deletePersona(Long id) {

        ipersonaRepoistory.deleteById(id);
        
    }

    @Override
    public Persona findPersona(Long id) {
        
        Persona persona = ipersonaRepoistory.findById(id).orElse(null);
        return persona;
        
    }
    
    
    
    
    
}
