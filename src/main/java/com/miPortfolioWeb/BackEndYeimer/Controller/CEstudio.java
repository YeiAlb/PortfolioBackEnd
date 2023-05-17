package com.miPortfolioWeb.BackEndYeimer.Controller;

import com.miPortfolioWeb.BackEndYeimer.Entity.Estudio;
import com.miPortfolioWeb.BackEndYeimer.Service.SEstudio;
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
//Identificación del Spring ---paquete Controlador Estudio---.
//Mapeamos con:

@RestController
@RequestMapping("estudio") //localhost:8080/estudio --> Ruta de estudio.
@CrossOrigin(origins = {"https://portfolio-frontend-yeimer.web.app"}) //Se cruza con Angular, el FrontEnd.

public class CEstudio {
        @Autowired
            SEstudio estService;
        //El Controller llama al Service.
        //Significa que está autocableado al Service, el Service con el Repository.
        //--> estService es un alias para SEstudio.
        
    @PostMapping ("/agregar") //Para guardar o crear a una NUEVO estudio.
    @ResponseBody //Se usa '@ResponseBody' porque el cuerpo de lo que está en este apartado, es la respuesta.
    //Con el '@RequestBody', (aliado del '@PostMapping') se envían los datos del FrontEnd al BackEnd.
    public String saveEstudio(@RequestBody Estudio est) {
        estService.saveEstudio(est);
        return "El Estudio se ha creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}") //Para eliminar un estudio por id.
    //Se usa el '@PathVariable' como una ruta dinámica.
    public String deleteEstudio(@PathVariable int id) {
        estService.deleteEstudio(id);
        return "El Estudio se ha eliminado correctamente";
    }
    
    @PutMapping ("/editar/{id}") //Para editar a un estudio y se usa el '@RequestBody' como parámetro.
    public String updateEstudio(@RequestBody Estudio est) {
        estService.updateEstudio(est);
        return "El Estudio se ha actualizado correctamente";
    }
    
    @GetMapping ("/encontrar/{id}") //Para ver a un solo estudio.
    @ResponseBody
    //Se usa el '@PathVariable' como una ruta dinámica.
    public Estudio findEstudio(@PathVariable int id) {
        return estService.findEstudio(id);
    }
    
    @GetMapping ("/lista") //estudio/lista --> //Para traer la lista de estudios.
    @ResponseBody
    public List<Estudio> getEstudios() {
        return estService.getEstudios();
    }
    
}
