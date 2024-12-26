package com.jherrerado.contactMe.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.jherrerado.contactMe.model.dto.ClientesDTO;
import com.jherrerado.contactMe.model.mapper.ClientesMapper;
import com.jherrerado.contactMe.services.IClientesServices;

@RestController
@RequestMapping("/api/v1")

public class ClientesController {

  private IClientesServices clientesServices;

  @GetMapping("/clientes")
  public List<ClientesDTO> getClientes() {
    List<ClientesDTO> costumers = ClientesMapper.INSTANCE.clientesToClientesDTOs(clientesServices.findClientes());
    return costumers;
  }

}
