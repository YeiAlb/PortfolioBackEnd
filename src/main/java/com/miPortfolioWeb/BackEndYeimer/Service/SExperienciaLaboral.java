package com.miPortfolioWeb.BackEndYeimer.Service;

import com.miPortfolioWeb.BackEndYeimer.Entity.ExperienciaLaboral;
import com.miPortfolioWeb.BackEndYeimer.Repository.RExperienciaLaboral;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//-------ANNOTATION-------.
//Identificación del Spring ---Servicio Experiencia Laboral---.
//Mapeamos con:

@Service
@Transactional //Para la PERSISTENCIA DE LOS DATOS.
public class SExperienciaLaboral {
    @Autowired //Conectado al repositorio de Experiencia Laboral.
            RExperienciaLaboral expeRepository;
    //El Servicio llama al Repositorio.
    //--> expeRepository, alias para RExperienciaLaboral.

    
    //-------MÉTODOS-------.
    
    //Para crear o guardar.
    //El tipo 'void' no requiere retorno.
    public void saveExperienciaLaboral(ExperienciaLaboral expelab) {
        expeRepository.save(expelab);
        // Atentos para editar.
    }
    
    //Para eliminar a una Experiencia Laboral. 
    public void deleteExperienciaLaboral(int id) {
        expeRepository.deleteById(id);
    }
    
    //Es igual al saveExperienciaLaboral.
    public void updateExperienciaLaboral(ExperienciaLaboral expelab) {
        expeRepository.save(expelab);
        // Para editar o actualizar se usa 'save'.
    }
    
    //Para encontrar a una sola Experiencia Laboral o nulo.
    //Requiere retorno.
    public ExperienciaLaboral findExperienciaLaboral(int id) {
        return expeRepository.findById(id).orElse(null);
    }
    
    //Método para traer a todas las Experiencias Laborales.
    public List<ExperienciaLaboral> getExperienciasLaborales() {
        return expeRepository.findAll();
    }
    
    
}
