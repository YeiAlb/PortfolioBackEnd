package com.miPortfolioWeb.BackEndYeimer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;



//-------ANNOTATION-------.
//identificación del Spring paquete Entidad: sólo contiene entidades.
//Aquí ---Entidad SoftSkill--- mapeamos con:

@Entity  //De la Entidad al Repositorio.

public class SoftSkill {
    //-------ATRIBUTOS-------.
    //Se colocan la ANNOTATIONS, justo antes de todos los atributos.
    //Hay que repetir la ANNOTATION si se requiere.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @NotNull
    private String nombre;
    
    @NotNull
    @Min(0)
    @Max(100)
    private int porcentaje;
    
    //-------CONSTRUCTORES-------.
    //Contructor Vacío.
    public SoftSkill() {
    }
    
    //Constructor con parámetros.
    public SoftSkill(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
    
    //-------GETTERS & SETTERS-------.
    //Se podría importar LOMBOK (@Getter @Setter).
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
        
}
