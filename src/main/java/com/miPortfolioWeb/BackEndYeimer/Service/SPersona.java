package com.miPortfolioWeb.BackEndYeimer.Service;

import com.miPortfolioWeb.BackEndYeimer.Entity.Persona;
import com.miPortfolioWeb.BackEndYeimer.Repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//-------ANNOTATION-------.
//identificación del Spring paquete Servicio.
//Aquí ---Servicio Persona--- mapeamos con:

@Service
@Transactional //Ayuda a mantener la PERSISTENCIA, lo que se tiene aquí junto con la Base de Datos.

public class SPersona {
    @Autowired
            RPersona persoRepository;
    //El Servicio llama al Repositorio.
    //Significa que está autocableado al repositorio, inyecta dependencias dentro de otras.
    //--> persoRepository es un alias para RPersona.

    
    //-------MÉTODOS-------.
    
    //Método para dar de alta, agregar, crear o guardar a una persona, ya no se estima el método editar.
    //El tipo 'void' no requiere retorno.
    public void savePersona(Persona perso) {
        persoRepository.save(perso);
        // Atentos para editar.
    }
    
    //Método para eliminar a una persona. 
    public void deletePersona(int id) {
        persoRepository.deleteById(id);
    }
    
    //Es igual al savePersona.
    public void updatePersona(Persona perso) {
        persoRepository.save(perso);
        // Para editar o actualizar se usa 'save'.
    }
    
    //Método para encontrar a una sola persona o nulo si no encuentra.
    //Requiere retorno.
    public Persona findPersona(int id) {
        return persoRepository.findById(id).orElse(null);
    }
    
    //Método para traer a todas las personas.
    public List<Persona> getPersonas() {
        return persoRepository.findAll();
    }
    
    public PersonaDTO loginPersona(String correo, String clave){
	Persona persona = persoRepository.findByCorreoAndClave(correo, clave);
	PersonaDTO personaDTO = new PersonaDTO(persona.getId(),
                                            persona.getNombre(), 
                                           persona.getApellido(), 
                                          persona.getOcupacion(), 
                                           persona.getSobre_mi(), 
                                         persona.getImg_perfil());
	return personaDTO;
    }
    
    //public PersonaDTO loginPersona(String correo, String clave) {
    //    List <Persona> personas = persoRepository.findByCorreoAndClave(correo, clave);
        
    //    if(!personas.isEmpty()){
    //        return personas.get(0);                        
    //    }
    //    return null;
    //}
    
}