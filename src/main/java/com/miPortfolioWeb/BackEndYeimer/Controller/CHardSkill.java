package com.miPortfolioWeb.BackEndYeimer.Controller;

import com.miPortfolioWeb.BackEndYeimer.Entity.HardSkill;
import com.miPortfolioWeb.BackEndYeimer.Service.SHardSkill;
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
@RequestMapping("hardSkill") //localhost:8080/hard --> Ruta de Hard Skills.
@CrossOrigin(origins = "http://localhost:4200") //Se cruza con Angular, el FrontEnd.

public class CHardSkill {
    @Autowired
            SHardSkill hardService;
        //El Controller llama al Service.
        //Significa que está autocableado al Service, el Service con el Repository.
        //--> hardService es un alias para SHardSkill.
        
    @PostMapping ("/agregar") //Para guardar o crear a una NUEVA Hard Skill.
    @ResponseBody //Se usa '@ResponseBody' porque el cuerpo de lo que está en este apartado, es la respuesta.
    //Con el '@RequestBody', (aliado del '@PostMapping') se envían los datos del FrontEnd al BackEnd.
    public String saveHardSkill(@RequestBody HardSkill hard) {
        hardService.saveHardSkill(hard);
        return "La Hard Skill se ha creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}") //Para eliminar una Hard Skill por id.
    //Se usa el '@PathVariable' como una ruta dinámica.
    public String deleteHardSkill(@PathVariable int id) {
        hardService.deleteHardSkill(id);
        return "La Hard Skill se ha eliminado correctamente";
    }
    
    @PutMapping ("/editar") //Para editar a un Hard Skill y se usa el '@RequestBody' como parámetro.
    public String updateHardSkill(@RequestBody HardSkill hard) {
        hardService.updateHardSkill(hard);
        return "La Hard Skill se ha actualizado correctamente";
    }
    
    @GetMapping ("/encontrar/{id}") //Para ver a una sola Hard Skill.
    @ResponseBody
    //Se usa el '@PathVariable' como una ruta dinámica.
    public HardSkill findHardSkill(@PathVariable int id) {
        return hardService.findHardSkill(id);
    }
    
    @GetMapping ("/lista") //hardSkill/lista --> //Para traer la lista de Hard Skills.
    @ResponseBody
    public List<HardSkill> getHardSkills() {
        return hardService.getHardSkills();
    }
}
