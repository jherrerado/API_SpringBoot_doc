package com.jherrerado.contactMe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jherrerado.contactMe.model.entities.*;

/*
 * Esta interfaz se encarga de realizar las operaciones de la base de datos
 * y me permite tambien agregar nuevas funcioanlidades.
 */

@Repository
public interface IClientesRepository extends JpaRepository<Clientes, Long> {
}
