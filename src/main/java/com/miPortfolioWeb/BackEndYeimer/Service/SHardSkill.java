package com.miPortfolioWeb.BackEndYeimer.Service;

import com.miPortfolioWeb.BackEndYeimer.Entity.HardSkill;
import com.miPortfolioWeb.BackEndYeimer.Repository.RHardSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//-------ANNOTATION-------.
//Identificación del Spring ---Servicio Hard Skill---.
//Mapeamos con:

@Service
@Transactional //Ayuda a mantener la PERSISTENCIA, lo que se tiene aquí junto con la Base de Datos.

public class SHardSkill {
    @Autowired
            RHardSkill hardRepository;
    //El Servicio llama al Repositorio.
    //Significa que está autocableado al repositorio, inyecta dependencias dentro de otras.
    //--> hardRepository es un alias para RHardSkill.

    
    //-------MÉTODOS-------.
    
    //Método para dar de alta, agregar, crear o guardar a una Hard Skill, ya no se estima el método editar.
    //El tipo 'void' no requiere retorno.
    public void saveHardSkill(HardSkill hard) {
        hardRepository.save(hard);
        // Atentos para editar.
    }
    
    //Método para eliminar a una Hard Skill. 
    public void deleteHardSkill(int id) {
        hardRepository.deleteById(id);
    }
    
    //Es igual al saveHardSkill.
    public void updateHardSkill(HardSkill hard) {
        hardRepository.save(hard);
        // Para editar o actualizar se usa 'save'.
    }
    
    //Método para encontrar a una sola Hard Skill o nulo si no encuentra.
    //Requiere retorno.
    public HardSkill findHardSkill(int id) {
        return hardRepository.findById(id).orElse(null);
    }
    
    //Método para traer a todas las Redes Sociales.
    public List<HardSkill> getHardSkills() {
        return hardRepository.findAll();
    }
    
}
