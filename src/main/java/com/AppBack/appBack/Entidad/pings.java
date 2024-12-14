package com.AppBack.appBack.Entidad;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "pings")
@Getter @Setter
@ToString
@EqualsAndHashCode

public class pings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idping;

    @ManyToOne
    private equipos idequipo;

    private String respuesta;

}
