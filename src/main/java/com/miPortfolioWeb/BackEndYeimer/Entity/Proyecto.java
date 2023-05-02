package com.miPortfolioWeb.BackEndYeimer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



//-------ANNOTATION-------.
//identificación del Spring paquete Entidad: sólo contiene entidades.
//Aquí ---Entidad Estudio--- mapeamos con:

@Entity  //De la Entidad al Repositorio.

public class Proyecto {
    //-------ATRIBUTOS-------.
    //Se colocan la ANNOTATIONS, justo antes de todos los atributos.
    //Hay que repetir la ANNOTATION si se requiere.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @NotNull
    private String imagen_proyecto;
    
    @NotNull
    private String url_proyecto;
    
    @NotNull
    private String titulo_proyecto;
    
    //@Column(name = "descripcion", length = 5000)
    @Lob //Annotation para textos largos.
    @NotNull
    @Size(min = 1, max = 5000, message = "No cumple con la longitud")
    private String descripcion;
    
    //-------CONSTRUCTORES-------.
    //Contructor Vacío.
    public Proyecto() {
    }
    
    //Constructor con parámetros.
    public Proyecto(String imagen_proyecto, String url_proyecto, String titulo_proyecto, String descripcion) {
        this.imagen_proyecto = imagen_proyecto;
        this.url_proyecto = url_proyecto;
        this.titulo_proyecto = titulo_proyecto;
        this.descripcion = descripcion;
    }
    
    //-------GETTERS & SETTERS-------.
    //También se podría importar LOMBOK, si no queremos tanto código, se colocaría (@Getter @Setter) justo antes de annotation @Entity.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen_proyecto() {
        return imagen_proyecto;
    }

    public void setImagen_proyecto(String imagen_proyecto) {
        this.imagen_proyecto = imagen_proyecto;
    }

    public String getUrl_proyecto() {
        return url_proyecto;
    }

    public void setUrl_proyecto(String url_proyecto) {
        this.url_proyecto = url_proyecto;
    }

    public String getTitulo_proyecto() {
        return titulo_proyecto;
    }

    public void setTitulo_proyecto(String titulo_proyecto) {
        this.titulo_proyecto = titulo_proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
