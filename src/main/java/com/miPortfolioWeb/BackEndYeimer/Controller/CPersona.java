package com.miPortfolioWeb.BackEndYeimer.Controller;

import com.miPortfolioWeb.BackEndYeimer.Entity.Persona;
import com.miPortfolioWeb.BackEndYeimer.Service.SPersona;
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
//identificación del Spring paquete Controlador.
//Aquí ---Capa Controladora Persona---, mapeamos con:

@RestController
@RequestMapping("/persona") //localhost:8080/persona --> Ruta de persona.
@CrossOrigin(origins = "http://localhost:4200") //Se cruza con Angular, el FrontEnd.

public class CPersona {
        @Autowired
            SPersona persoService;
        //El Controller llama al Service.
        //Significa que está autocableado al Service, el Service con el Repository.
        //--> persoService es un alias para SPersona.
        
    
        
        
    @PostMapping ("/agregar") //Para guardar o crear a una NUEVA persona.
    @ResponseBody //Se usa '@ResponseBody' porque el cuerpo de lo que está en este apartado, es la respuesta.
    //Con el '@RequestBody', (aliado del '@PostMapping') se envían los datos del FrontEnd al BackEnd.
    public String savePersona(@RequestBody Persona perso) {
        persoService.savePersona(perso);
        return "La Persona se ha creado correctamente";
    }
    
    @PostMapping ("/autenticacion/login")
    public Persona loginPersona (@RequestBody Persona perso) {
        return persoService.loginPersona(perso.getCorreo(),perso.getClave());
    }
    
    
    @DeleteMapping ("/borrar/{id}") //Para eliminar una persona por id.
    //Se usa el '@PathVariable' como una ruta dinámica.
    public String deletePersona(@PathVariable int id) {
        persoService.deletePersona(id);
        return "La Persona se ha eliminado correctamente";
    }
    
    @PutMapping ("/editar") //Para editar a una persona y se usa el '@RequestBody' como parámetro.
    public String updatePersona(@RequestBody Persona perso) {
        persoService.updatePersona(perso);
        return "La Persona se ha actualizado correctamente";
    }
    
    @GetMapping ("/encontrar/{id}") //Para ver a una sola persona.
    @ResponseBody
    //Se usa el '@PathVariable' como una ruta dinámica.
    public Persona findPersona(@PathVariable int id) {
        return persoService.findPersona(id);
    }
    
    @GetMapping ("/lista") //persona/lista --> //Para traer la lista de personas.
    @ResponseBody
    public List<Persona> getPersonas() {
        return persoService.getPersonas();
    }

}
