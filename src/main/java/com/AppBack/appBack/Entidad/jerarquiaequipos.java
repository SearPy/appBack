package com.AppBack.appBack.Entidad;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "jerarquiaequipos")
@Getter @Setter
@ToString
@EqualsAndHashCode

public class jerarquiaequipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idjerarquiaequipos;

    @ManyToOne
    private equipos idequipopadre;

    @ManyToOne
    private equipos idequipohijo;
}
