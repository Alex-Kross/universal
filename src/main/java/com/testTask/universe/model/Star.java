package com.testTask.universe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Star {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double temperature;
    private Double solarRadius;
    private Double solarLuminosity;
    private Double solarMass;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER )
    private Galaxy galaxy;
}
