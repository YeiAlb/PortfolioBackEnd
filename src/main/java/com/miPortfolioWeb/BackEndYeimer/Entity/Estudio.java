package com.miPortfolioWeb.BackEndYeimer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import java.util.Date;



//-------ANNOTATION-------.
//identificación del Spring paquete Entidad: sólo contiene entidades.
//Aquí ---Entidad Estudio--- mapeamos con:

@Entity  //De la Entidad al Repositorio.

public class Estudio {
    
    //-------ATRIBUTOS-------.
    //Se colocan la ANNOTATIONS, justo antes de todos los atributos.
    //Hay que repetir la ANNOTATION si se requiere.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @NotNull
    private String logo_institucion;
    
    private String url_institucion;
    
    @NotNull
    private String nombre_institucion;
    
    @NotNull
    private String titulo_academico;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_fin;

         
    //-------CONSTRUCTORES-------.
    //Contructor Vacío.
    public Estudio() {
    }
    
    //Constructor con parámetros.
    public Estudio(String logo_institucion, String url_institucion, String nombre_institucion, String titulo_academico, Date fecha_inicio, Date fecha_fin) {
        this.logo_institucion = logo_institucion;
        this.url_institucion = url_institucion;
        this.nombre_institucion = nombre_institucion;
        this.titulo_academico = titulo_academico;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }
    
    //-------GETTERS & SETTERS-------.
    //También se podría importar LOMBOK, si no queremos tanto código, se colocaría (@Getter @Setter) justo antes de annotation @Entity.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo_institucion() {
        return logo_institucion;
    }

    public void setLogo_institucion(String logo_institucion) {
        this.logo_institucion = logo_institucion;
    }

    public String getUrl_institucion() {
        return url_institucion;
    }

    public void setUrl_institucion(String url_institucion) {
        this.url_institucion = url_institucion;
    }

    public String getNombre_institucion() {
        return nombre_institucion;
    }

    public void setNombre_institucion(String nombre_institucion) {
        this.nombre_institucion = nombre_institucion;
    }

    public String getTitulo_academico() {
        return titulo_academico;
    }

    public void setTitulo_academico(String titulo_academico) {
        this.titulo_academico = titulo_academico;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
}
