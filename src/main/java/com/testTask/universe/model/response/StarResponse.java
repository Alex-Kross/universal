package com.testTask.universe.model.response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor

public class StarResponse {
    private Long id;
    private String name;
    private Double temperature;
    private Double solarRadius;
    private Double solarLuminosity;
    private Double solarMass;
    private GalaxyResponse galaxyResponse;
}
