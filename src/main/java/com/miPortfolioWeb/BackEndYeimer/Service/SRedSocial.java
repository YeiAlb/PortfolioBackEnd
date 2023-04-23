package com.miPortfolioWeb.BackEndYeimer.Service;

import com.miPortfolioWeb.BackEndYeimer.Entity.RedSocial;
import com.miPortfolioWeb.BackEndYeimer.Repository.RRedSocial;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//-------ANNOTATION-------.
//Identificación del Spring ---Servicio Red Social---.
//Mapeamos con:

@Service
@Transactional //Ayuda a mantener la PERSISTENCIA, lo que se tiene aquí junto con la Base de Datos.

public class SRedSocial {
    @Autowired
            RRedSocial redRepository;
    //El Servicio llama al Repositorio.
    //Significa que está autocableado al repositorio, inyecta dependencias dentro de otras.
    //--> redRepository es un alias para RRedSocial.

    
    //-------MÉTODOS-------.
    
    //Método para dar de alta, agregar, crear o guardar a una Red Social, ya no se estima el método editar.
    //El tipo 'void' no requiere retorno.
    public void saveRedSocial(RedSocial red) {
        redRepository.save(red);
        // Atentos para editar.
    }
    
    //Método para eliminar a una Red Social. 
    public void deleteRedSocial(int id) {
        redRepository.deleteById(id);
    }
    
    //Es igual al saveRedSocial.
    public void updateRedSocial(RedSocial red) {
        redRepository.save(red);
        // Para editar o actualizar se usa 'save'.
    }
    
    //Método para encontrar a una sola Red Social o nulo si no encuentra.
    //Requiere retorno.
    public RedSocial findRedSocial(int id) {
        return redRepository.findById(id).orElse(null);
    }
    
    //Método para traer a todas las Redes Sociales.
    public List<RedSocial> getRedesSociales() {
        return redRepository.findAll();
    }
    
}
