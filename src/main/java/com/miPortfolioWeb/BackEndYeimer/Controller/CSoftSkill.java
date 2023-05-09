package com.miPortfolioWeb.BackEndYeimer.Controller;

import com.miPortfolioWeb.BackEndYeimer.Entity.SoftSkill;
import com.miPortfolioWeb.BackEndYeimer.Service.SSoftSkill;
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
//Identificación del Spring ---paquete Controladora Red Social---.
//Mapeamos con:

@RestController
@RequestMapping("softSkill") //localhost:8080/soft --> Ruta de Soft Skills.
@CrossOrigin(origins = "http://localhost:4200") //Se cruza con Angular, el FrontEnd.


public class CSoftSkill {
    @Autowired
            SSoftSkill softService;
        //El Controller llama al Service.
        //Significa que está autocableado al Service, el Service con el Repository.
        //--> softService es un alias para SSoftSkill.
        
    @PostMapping ("/agregar") //Para guardar o crear a una NUEVA soft.
    @ResponseBody //Se usa '@ResponseBody' porque el cuerpo de lo que está en este apartado, es la respuesta.
    //Con el '@RequestBody', (aliado del '@PostMapping') se envían los datos del FrontEnd al BackEnd.
    public String saveSoftSkill(@RequestBody SoftSkill soft) {
        softService.saveSoftSkill(soft);
        return "La Soft Skill se ha creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}") //Para eliminar una Soft Skill por id.
    //Se usa el '@PathVariable' como una ruta dinámica.
    public String deleteSoftSkill(@PathVariable int id) {
        softService.deleteSoftSkill(id);
        return "La Soft Skill se ha eliminado correctamente";
    }
    
    @PutMapping ("/editar") //Para editar a una Soft Skills y se usa el '@RequestBody' como parámetro.
    public String updateSoftSkill(@RequestBody SoftSkill soft) {
        softService.updateSoftSkill(soft);
        return "La Soft Skill se ha actualizado correctamente";
    }
    
    @GetMapping ("/encontrar/{id}") //Para ver a una sola Soft Skill.
    @ResponseBody
    //Se usa el '@PathVariable' como una ruta dinámica.
    public SoftSkill findSoftSkill(@PathVariable int id) {
        return softService.findSoftSkill(id);
    }
    
    @GetMapping ("/lista") //softSkill/lista --> //Para traer la lista de soft Skills.
    @ResponseBody
    public List<SoftSkill> getSoftSkills() {
        return softService.getSoftSkills();
    }
}
