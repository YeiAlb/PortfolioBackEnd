package com.miPortfolioWeb.BackEndYeimer.Service;

import com.miPortfolioWeb.BackEndYeimer.Entity.SoftSkill;
import com.miPortfolioWeb.BackEndYeimer.Repository.RSoftSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//-------ANNOTATION-------.
//Identificación del Spring ---Servicio Soft Skill---.
//Mapeamos con:

@Service
@Transactional //Ayuda a mantener la PERSISTENCIA, lo que se tiene aquí junto con la Base de Datos.

public class SSoftSkill {
    @Autowired
            RSoftSkill softRepository;
    //El Servicio llama al Repositorio.
    //Significa que está autocableado al repositorio, inyecta dependencias dentro de otras.
    //--> softRepository es un alias para RSoftSkill.

    
    //-------MÉTODOS-------.
    
    //Método para dar de alta, agregar, crear o guardar a una Soft Skill, ya no se estima el método editar.
    //El tipo 'void' no requiere retorno.
    public void saveSoftSkill(SoftSkill soft) {
        softRepository.save(soft);
        // Atentos para editar.
    }
    
    //Método para eliminar a una Soft Skill. 
    public void deleteSoftSkill(int id) {
        softRepository.deleteById(id);
    }
    
    //Es igual al saveSoftSkill.
    public void updateSoftSkill(SoftSkill soft) {
        softRepository.save(soft);
        // Para editar o actualizar se usa 'save'.
    }
    
    //Método para encontrar a una sola Soft Skill o nulo si no encuentra.
    //Requiere retorno.
    public SoftSkill findSoftSkill(int id) {
        return softRepository.findById(id).orElse(null);
    }
    
    //Método para traer a todas las Redes Sociales.
    public List<SoftSkill> getSoftSkills() {
        return softRepository.findAll();
    }
}
