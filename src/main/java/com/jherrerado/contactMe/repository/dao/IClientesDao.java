package com.jherrerado.contactMe.repository.dao;

import java.util.List;

import com.jherrerado.contactMe.model.entities.*;

/*
 * Con el Dao iniciamo con el desacoplamiento que permitira
 * realizar un codigo mas escalable e independient del framework.
 * Esta interfaz permite realizar el contrato con la implementacion del crud o funcionalidades.
 */
public interface IClientesDao {
  public List<Clientes> findClientes();
}
