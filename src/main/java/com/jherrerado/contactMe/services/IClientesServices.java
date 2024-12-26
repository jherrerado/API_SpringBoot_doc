package com.jherrerado.contactMe.services;

import java.util.List;

import com.jherrerado.contactMe.model.entities.Clientes;

/*
 * Esta tambien es parte de desacloplamiento de los repository de la logica del negocio.
 * Aqui se ma nifiestan los metodos que se deberan implementar en el service.
 */

public interface IClientesServices {
  public List<Clientes> findClientes();
}
