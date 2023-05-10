package com.miPortfolioWeb.BackEndYeimer.Controller;

import com.miPortfolioWeb.BackEndYeimer.Entity.RedSocial;
import com.miPortfolioWeb.BackEndYeimer.Service.SRedSocial;
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
@RequestMapping("red") //localhost:8080/red --> Ruta para las Redes Sociales.
@CrossOrigin(origins = {"https://portfolio-frontend-yeimer.web.app"}) //Se cruza con Angular, el FrontEnd.

public class CRedSocial {
    @Autowired
            SRedSocial redService;
        //El Controller llama al Service.
        //Significa que está autocableado al Service, el Service con el Repository.
        //--> redService es un alias para SRedSocial.
        
    @PostMapping ("/agregar") //Para guardar o crear a una NUEVA red.
    @ResponseBody //Se usa '@ResponseBody' porque el cuerpo de lo que está en este apartado, es la respuesta.
    //Con el '@RequestBody', (aliado del '@PostMapping') se envían los datos del FrontEnd al BackEnd.
    public String saveRedSocial(@RequestBody RedSocial red) {
        redService.saveRedSocial(red);
        return "La Red Social se ha creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}") //Para eliminar una red social por id.
    //Se usa el '@PathVariable' como una ruta dinámica.
    public String deleteRedSocial(@PathVariable int id) {
        redService.deleteRedSocial(id);
        return "La Red Social se ha eliminado correctamente";
    }
    
    @PutMapping ("/editar") //Para editar a una red social y se usa el '@RequestBody' como parámetro.
    public String updateRedSocial(@RequestBody RedSocial red) {
        redService.updateRedSocial(red);
        return "La Red Social se ha actualizado correctamente";
    }
    
    @GetMapping ("/encontrar/{id}") //Para ver a una sola red social.
    @ResponseBody
    //Se usa el '@PathVariable' como una ruta dinámica.
    public RedSocial findRedSocial(@PathVariable int id) {
        return redService.findRedSocial(id);
    }
    
    @GetMapping ("/lista") //red/lista --> //Para traer la lista de redes sociales.
    @ResponseBody
    public List<RedSocial> getRedesSociales() {
        return redService.getRedesSociales();
    }
}
