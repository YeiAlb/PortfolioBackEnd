package com.miPortfolioWeb.BackEndYeimer.Controller;

import com.miPortfolioWeb.BackEndYeimer.Entity.Proyecto;
import com.miPortfolioWeb.BackEndYeimer.Service.SProyecto;
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
//Identificación del Spring ---paquete Controlador Proyecto---.
//Mapeamos con:

@RestController
@RequestMapping("/proyecto") //localhost:8080/proyecto --> Ruta de Proyectos.
@CrossOrigin(origins = "http://localhost:4200") //Se cruza con Angular, el FrontEnd.

public class CProyecto {
    @Autowired
            SProyecto proyService;
        //El Controller llama al Service.
        //Significa que está autocableado al Service, el Service con el Repository.
        //--> proyService es un alias para SProyecto.
        
    @PostMapping ("/agregar") //Para guardar o crear a una NUEVO proyecto.
    @ResponseBody //Se usa '@ResponseBody' porque el cuerpo de lo que está en este apartado, es la respuesta.
    //Con el '@RequestBody', (aliado del '@PostMapping') se envían los datos del FrontEnd al BackEnd.
    public String saveProyecto(@RequestBody Proyecto proy) {
        proyService.saveProyecto(proy);
        return "El Proyecto se ha creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}") //Para eliminar un proyecto por id.
    //Se usa el '@PathVariable' como una ruta dinámica.
    public String deleteProyecto(@PathVariable int id) {
        proyService.deleteProyecto(id);
        return "El Proyecto se ha eliminado correctamente";
    }
    
    @PutMapping ("/editar") //Para editar a un proyecto y se usa el '@RequestBody' como parámetro.
    public String updateProyecto(@RequestBody Proyecto proy) {
        proyService.updateProyecto(proy);
        return "El Proyecto se ha actualizado correctamente";
    }
    
    @GetMapping ("/encontrar/{id}") //Para ver a un solo proyecto.
    @ResponseBody
    //Se usa el '@PathVariable' como una ruta dinámica.
    public Proyecto findProyecto(@PathVariable int id) {
        return proyService.findProyecto(id);
    }
    
    @GetMapping ("/lista") //proyecto/lista --> //Para traer la lista de estudios.
    @ResponseBody
    public List<Proyecto> getProyectos() {
        return proyService.getProyectos();
    }
}
