package com.jherrerado.contactMe.model.dto;

import lombok.*;

/*
 * Informacion que sera presentada al cliente
 */

// lombook
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ClientesDTO {
  private long clientId;
  private String clientName;
  private String clientEmail;
  private String clientCellphone;
  private String clientTelephone;
  private String clientAddress;
  private String clientCaractristics;
}
