package com.jherrerado.contactMe.repository.implementDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jherrerado.contactMe.model.entities.Clientes;
import com.jherrerado.contactMe.repository.IClientesRepository;
import com.jherrerado.contactMe.repository.dao.IClientesDao;

/*
 * Aqui se desarrolla la funcionalidad de cada metodo o lo que van a hacer los endpoints.
 * Todavia en esta posicion se trabaja con los entities directamente.
 */
@Component
public class ClientesImplementDao implements IClientesDao {

  @Autowired
  private IClientesRepository repository;

  @Override
  public List<Clientes> findClientes() {
    return repository.findAll();
  }

}
