package com.AppBack.appBack.Entidad;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "equipos")
@Getter @Setter
@ToString
@EqualsAndHashCode

public class equipos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idequipo;
    private String nombreequipo;
    private String direccionip;

}
