package com.miPortfolioWeb.BackEndYeimer.Repository;

import com.miPortfolioWeb.BackEndYeimer.Entity.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



//-------ANNOTATION-------.
//Identificación del paquete ---Repositorio Experiencia Laboral---.
//Mapeamos con:

@Repository //Del INTERFACE Repositorio al Servicio.
//La interface extiende de JPA, que tiene sus propios métodos.
//Parámetros<clase (se importa), tipo de dato>

public interface RExperienciaLaboral extends JpaRepository<ExperienciaLaboral, Integer> {
    
}
