package com.miPortfolioWeb.BackEndYeimer.Service;

import com.miPortfolioWeb.BackEndYeimer.Entity.Proyecto;
import com.miPortfolioWeb.BackEndYeimer.Repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//-------ANNOTATION-------.
//Identificación del Spring ---Servicio Proyecto---.
//Mapeamos con:

@Service
@Transactional //Ayuda a mantener la PERSISTENCIA, lo que se tiene aquí junto con la Base de Datos.

public class SProyecto {
    @Autowired
            RProyecto proyRepository;
    //El Servicio llama al Repositorio.
    //Significa que está autocableado al repositorio, inyecta dependencias dentro de otras.
    //--> proyRepository es un alias para RProyecto.

    
    //-------MÉTODOS-------.
    
    //Método para dar de alta, agregar, crear o guardar a un Proyecto, ya no se estima el método editar.
    //El tipo 'void' no requiere retorno.
    public void saveProyecto(Proyecto proy) {
        proyRepository.save(proy);
        // Atentos para editar.
    }
    
    //Método para eliminar a una Proyecto. 
    public void deleteProyecto(int id) {
        proyRepository.deleteById(id);
    }
    
    //Es igual al saveProyecto.
    public void updateProyecto(Proyecto proy) {
        proyRepository.save(proy);
        // Para editar o actualizar se usa 'save'.
    }
    
    //Método para encontrar a una sola Proyecto o nulo si no encuentra.
    //Requiere retorno.
    public Proyecto findProyecto(int id) {
        return proyRepository.findById(id).orElse(null);
    }
    
    //Método para traer a todas las personas.
    public List<Proyecto> getProyectos() {
        return proyRepository.findAll();
    }
}
