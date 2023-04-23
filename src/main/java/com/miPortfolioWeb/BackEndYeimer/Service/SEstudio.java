package com.miPortfolioWeb.BackEndYeimer.Service;

import com.miPortfolioWeb.BackEndYeimer.Entity.Estudio;
import com.miPortfolioWeb.BackEndYeimer.Repository.REstudio;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//-------ANNOTATION-------.
//Identificación del Spring ---Servicio Estudio---.
//Mapeamos con:

@Service
@Transactional //Ayuda a mantener la PERSISTENCIA, lo que se tiene aquí junto con la Base de Datos.

public class SEstudio {
    @Autowired
            REstudio estRepository;
    //El Servicio llama al Repositorio.
    //Significa que está autocableado al repositorio, inyecta dependencias dentro de otras.
    //--> estRepository es un alias para REstudio.

    
    //-------MÉTODOS-------.
    
    //Método para dar de alta, agregar, crear o guardar a un Estudio, ya no se estima el método editar.
    //El tipo 'void' no requiere retorno.
    public void saveEstudio(Estudio est) {
        estRepository.save(est);
        // Atentos para editar.
    }
    
    //Método para eliminar a una Estudio. 
    public void deleteEstudio(int id) {
        estRepository.deleteById(id);
    }
    
    //Es igual al saveEstudio.
    public void updateEstudio(Estudio est) {
        estRepository.save(est);
        // Para editar o actualizar se usa 'save'.
    }
    
    //Método para encontrar a una sola Estudio o nulo si no encuentra.
    //Requiere retorno.
    public Estudio findEstudio(int id) {
        return estRepository.findById(id).orElse(null);
    }
    
    //Método para traer a todas las personas.
    public List<Estudio> getEstudios() {
        return estRepository.findAll();
    }
    
}
