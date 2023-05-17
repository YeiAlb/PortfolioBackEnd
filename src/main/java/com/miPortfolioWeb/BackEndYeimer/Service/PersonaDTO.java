package com.miPortfolioWeb.BackEndYeimer.Service;

//DATA TRASNFER OBJECT = DTO = Patron de Transferencia de Datos.

import lombok.Getter;
import lombok.Setter;

//Se crea el objeto Persona, con atributos, que van a ser enviados y recuperados por el Servidor.
//Con DTO se evita el error de mapear directamente con la tabla de la Base de Datos para transferir, nos adaptamos al FrontEnd y no se envían datos innecesarios.
//Para que los datos como Correo y Clave no se muestren, igualmente en la base de datos (MySQL) deben estar encriptados.
//Esta clase NO VA A ESTAR MAPEADA a la Base de Datos.

@Getter @Setter
//La nomenclatura tanto para CLASES como para INTERFACES es PascalCase.
public class PersonaDTO {
    private int id;
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String sobre_mi;
    private String img_perfil;

    
    //-------CONSTRUCTORES-------.
    //Contructor Vacío. (alt + insert)
    public PersonaDTO() {
    }

    //Constructor con parámetros.  
    public PersonaDTO(int id, String nombre, String apellido,
                                String ocupacion, String sobre_mi,
                                    String img_perfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.sobre_mi = sobre_mi;
        this.img_perfil = img_perfil;
    }
    
    
}


