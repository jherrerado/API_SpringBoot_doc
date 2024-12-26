package com.jherrerado.contactMe.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.jherrerado.contactMe.model.dto.ClientesDTO;
import com.jherrerado.contactMe.model.entities.*;

@Mapper(componentModel = "spring")
public interface ClientesMapper {
  ClientesMapper INSTANCE = Mappers.getMapper(ClientesMapper.class);

  ClientesDTO clientesToClientesDTO(Clientes clientes);

  List<ClientesDTO> clientesToClientesDTOs(List<Clientes> clientes);
}