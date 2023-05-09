package com.miPortfolioWeb.BackEndYeimer.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



//-------ANNOTATION-------.
//identificación del Spring paquete Entidad: sólo contiene entidades.
//Aquí ---Entidad Persona--- mapeamos con:

@Entity  //De la Entidad al Repositorio.

public class Persona {
    //-------ATRIBUTOS-------.
    //Se colocan la ANNOTATIONS, justo antes de todos los atributos.
    //Hay que repetir la ANNOTATION si se requiere.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String ocupacion;
        
    //@Lob //Annotation para textos largos.
    @Column(name = "sobre_mi", length = 5000)
    @NotNull
    @Size(min = 1, max = 5000, message = "No cumple con la longitud")
    private String sobre_mi;
    
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud")//Al menos una letra es obligatoria
    private String img_perfil;
    
    @NotNull
    private String correo;
    
    @NotNull
    private String clave;
     
    
    //-------CONSTRUCTORES-------.
    //Contructor Vacío. (alt + insert)
    public Persona() {
    }
    
    //Constructor con parámetros.
    public Persona(int id, String nombre, String apellido, String ocupacion, String sobre_mi, String img_perfil, String correo, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.sobre_mi = sobre_mi;
        this.img_perfil = img_perfil;
        this.correo = correo;
        this.clave = clave;
    }
    
    //-------GETTERS & SETTERS-------.
    //También se podría importar LOMBOK, si no queremos tanto código, se colocaría (@Getter @Setter) justo antes de annotation @Entity.
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getSobre_mi() {
        return sobre_mi;
    }

    public void setSobre_mi(String sobre_mi) {
        this.sobre_mi = sobre_mi;
    }

    public String getImg_perfil() {
        return img_perfil;
    }

    public void setImg_perfil(String img_perfil) {
        this.img_perfil = img_perfil;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}