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
//Aquí ---Entidad ExperienciaLaboral--- mapeamos con:

@Entity  //De la Entidad al Repositorio.

public class ExperienciaLaboral {
    //-------ATRIBUTOS-------.
    //Se colocan la ANNOTATIONS, justo antes de todos los atributos.
    //Hay que repetir la ANNOTATION si se requiere.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @NotNull
    private String logo_empresarial;
    
    private String url_empresa;
    
    @NotNull
    private String cargo;
    
    @NotNull
    private String nombre_empresa;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_fin;


         
    //-------CONSTRUCTORES-------.
    //Contructor Vacío.
    public ExperienciaLaboral() {
    }
    
    //Constructor con parámetros.
    public ExperienciaLaboral(String logo_empresarial, String url_empresa, String cargo, String nombre_empresa, Date fecha_inicio, Date fecha_fin) {
        this.logo_empresarial = logo_empresarial;
        this.url_empresa = url_empresa;
        this.nombre_empresa = nombre_empresa;
        this.cargo = cargo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }
    
    //-------GETTERS & SETTERS-------.
    //Se podría importar LOMBOK (@Getter @Setter).
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo_empresarial() {
        return logo_empresarial;
    }

    public void setLogo_empresarial(String logo_empresarial) {
        this.logo_empresarial = logo_empresarial;
    }

    public String getUrl_empresa() {
        return url_empresa;
    }

    public void setUrl_empresa(String url_empresa) {
        this.url_empresa = url_empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
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