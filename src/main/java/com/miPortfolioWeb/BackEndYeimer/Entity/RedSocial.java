package com.miPortfolioWeb.BackEndYeimer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;



//-------ANNOTATION-------.
//identificación del Spring paquete Entidad: sólo contiene entidades.
//Aquí ---Entidad RedSocial--- mapeamos con:

@Entity  //De la Entidad al Repositorio.

public class RedSocial {
    //-------ATRIBUTOS-------.
    //Se colocan la ANNOTATIONS, justo antes de todos los atributos.
    //Hay que repetir la ANNOTATION si se requiere.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @NotNull
    private String icono;
    
    @NotNull
    private String url_red_social;
    
    private String nombre_red_social;
 
    
    //-------CONSTRUCTORES-------.
    //Contructor Vacío.
    public RedSocial() {
    }
    
    //Constructor con parámetros.
    public RedSocial(String icono, String url_red_social, String nombre_red_social) {
        this.icono = icono;
        this.url_red_social = url_red_social;
        this.nombre_red_social = nombre_red_social;
    }
    
    //-------GETTERS & SETTERS-------.
    //Se podría importar LOMBOK (@Getter @Setter).
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getUrl_red_social() {
        return url_red_social;
    }

    public void setUrl_red_social(String url_red_social) {
        this.url_red_social = url_red_social;
    }

    public String getNombre_red_social() {
        return nombre_red_social;
    }

    public void setNombre_red_social(String nombre_red_social) {
        this.nombre_red_social = nombre_red_social;
    }
       
}
