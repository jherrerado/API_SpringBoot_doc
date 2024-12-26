package com.jherrerado.contactMe.model.entities;

import jakarta.persistence.*;
import lombok.*;

/* Esta entidad se conecta directamente con la base de datos
  solo el DAO tiene acceso a esta entidad
*/

// Lombok
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "clientes")
public class Clientes {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cod_cli")
  private long clientId;

  @Column(name = "nom_cli") // nombre dentro de la base de datos
  private String clientName;

  @Column(name = "ema_cli")
  private String clientEmail;

  @Column(name = "cel_cli")
  private String clientCellphone;

  @Column(name = "tel_cli")
  private String clientTelephone;

  @Column(name = "dir_cli")
  private String clientAddress;

  @Column(name = "car_cli")
  private String clientCaractristics;
}
