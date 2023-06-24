package com.testTask.universe.model;

import com.testTask.universe.model.enam.GalaxyType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Galaxy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double minorAxisDiameter;

    private Double majorAxisDiameter;

    @Enumerated(EnumType.STRING)
    private GalaxyType galaxyType;

    private Double distanceFromEarth;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "galaxy")
    private List<Star> stars = new ArrayList<>();
}
