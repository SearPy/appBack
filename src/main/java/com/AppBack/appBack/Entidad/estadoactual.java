package com.AppBack.appBack.Entidad;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "estadoactual")
@Getter @Setter
@ToString
@EqualsAndHashCode

public class estadoactual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idestadoactual;

    @ManyToOne
    private equipos idequipo;

    @ManyToOne
    private pings idping;
}
