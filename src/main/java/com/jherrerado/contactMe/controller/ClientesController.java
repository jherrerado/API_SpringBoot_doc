package com.jherrerado.contactMe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jherrerado.contactMe.model.dto.ClientesDTO;
import com.jherrerado.contactMe.model.entities.Clientes;
import com.jherrerado.contactMe.model.mapper.ClientesMapper;
import com.jherrerado.contactMe.services.IClientesServices;

@RestController
@RequestMapping("/api/v1")

/*
 * Controller lo que hace ya es llamar a services, en este caso a
 * IClientesServices
 */
public class ClientesController {

  @Autowired
  private IClientesServices clientesServices;

  @GetMapping("/clientes")
  public List<ClientesDTO> getClientes() {
    return ClientesMapper.INSTANCE.clientesToClientesDTOs(clientesServices.findClientes());
  }

  @GetMapping("/pruevas")
  public List<Clientes> getPClientes() {
    return clientesServices.findClientes();
  }

}
