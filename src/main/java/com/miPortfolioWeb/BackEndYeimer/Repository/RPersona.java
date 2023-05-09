package com.miPortfolioWeb.BackEndYeimer.Repository;

import com.miPortfolioWeb.BackEndYeimer.Entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//-------ANNOTATION-------.
//identificación del Spring paquete Repositorio.
//Es nuestra conexión con la base de Datos, incorporando JPA.
//Aquí ---Repositorio Persona--- mapeamos con:

@Repository //Del Repositorio al Servicio.
//El repositorio es el único que es INTERFACE.
//La interface RPersona extiende de quien maneja los repositorios JPA.
//JpaRepositorio tiene sus propios métodos para usar.
//Parámetros<clase (se importa), tipo de dato>

public interface RPersona extends JpaRepository<Persona, Integer> {
   public List<Persona> findByCorreoAndClave(String correo, String clave); 
}
