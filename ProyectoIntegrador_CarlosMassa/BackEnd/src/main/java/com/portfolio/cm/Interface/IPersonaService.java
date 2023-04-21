package com.portfolio.cm.Interface;

import com.portfolio.cm.Entity.Persona;
import java.util.List;



public interface IPersonaService {
  //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    
    public void savePersona(Persona persona);
    
    //Eliminar un onjeto pero lo buscamos por ID
            
    public void deletePersona(Long id);
            
    //Buscar una persona por ID
    
    public Persona findPersona(Long id);
            
}


