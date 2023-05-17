package com.miPortfolioWeb.BackEndYeimer.Controller;

import com.miPortfolioWeb.BackEndYeimer.Entity.ExperienciaLaboral;
import com.miPortfolioWeb.BackEndYeimer.Service.SExperienciaLaboral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//-------ANNOTATION-------.
//Identificación del Spring ---paquete Controlador Experiencia Laboral---.
//Mapeamos con:

@RestController
@RequestMapping("experiencia") //localhost:8080/experiencia --> Ruta de experiencia laboral.
@CrossOrigin(origins = {"https://portfolio-frontend-yeimer.web.app"}) //Se cruza con Angular, el FrontEnd.
public class CExperienciaLaboral {
    @Autowired
            SExperienciaLaboral expeService;
        //El Controller llama al Service.
        //Significa que está autocableado al Service, el Service con el Repository.
        //--> expeService es un alias para SExperienciaLaboral.
        
    @PostMapping ("/agregar") //Para guardar o crear a una NUEVA experiencia laboral.
    @ResponseBody //Se usa '@ResponseBody' porque el cuerpo de lo que está en este apartado, es la respuesta.
    //Con el '@RequestBody', (aliado del '@PostMapping') se envían los datos del FrontEnd al BackEnd.
    public String saveExperienciaLaboral(@RequestBody ExperienciaLaboral expelab) {
        expeService.saveExperienciaLaboral(expelab);
        return "La Experiencia Laboral se ha creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}") //Para eliminar una experiencia laboral por id.
    //Se usa el '@PathVariable' como una ruta dinámica.
    public String deleteExperienciaLaboral(@PathVariable int id) {
        expeService.deleteExperienciaLaboral(id);
        return "La Experiencia Laboral se ha eliminado correctamente";
    }
    
    @PutMapping ("/editar/{id}") //Para editar a una experiencia laboral y se usa el '@RequestBody' como parámetro.
    public String updateExperienciaLaboral(@RequestBody ExperienciaLaboral expelab) {
        expeService.updateExperienciaLaboral(expelab);
        return "La Experiencia Laboral se ha actualizado correctamente";
    }
    
    @GetMapping ("/encontrar/{id}") //Para ver a una sola experiencia laboral.
    @ResponseBody
    //Se usa el '@PathVariable' como una ruta dinámica.
    public ExperienciaLaboral findExperienciaLaboral(@PathVariable int id) {
        return expeService.findExperienciaLaboral(id);
    }
    
    @GetMapping ("/lista") //experiencia/lista --> //Para traer la lista de experiencias laborales.
    @ResponseBody
    public List<ExperienciaLaboral> getExperienciasLaborales() {
        return expeService.getExperienciasLaborales();
    }    
    
}
