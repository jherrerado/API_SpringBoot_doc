package com.jherrerado.contactMe.services.implementServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jherrerado.contactMe.model.entities.*;
import com.jherrerado.contactMe.repository.dao.IClientesDao;
import com.jherrerado.contactMe.services.IClientesServices;

/*
 * Aqui se implementa la logica de negocio de los metodos que se van a utilizar en los endpoints.
 * Prinicipalmente las restrinciiones de los datos.
 */
@Service
public class ClientesimplementService implements IClientesServices {

  @Autowired
  private IClientesDao dao;

  @Override
  public List<Clientes> findClientes() {
    return dao.findClientes();
  }

}
