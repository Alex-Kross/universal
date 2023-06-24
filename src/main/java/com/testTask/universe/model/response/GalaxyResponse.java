package com.testTask.universe.model.response;

import com.testTask.universe.model.enam.GalaxyType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class GalaxyResponse {
    private Long id;

    private String name;

    private Double minorAxisDiameter;

    private Double majorAxisDiameter;

    private GalaxyType galaxyType;

    private Double distanceFromEarth;
}
