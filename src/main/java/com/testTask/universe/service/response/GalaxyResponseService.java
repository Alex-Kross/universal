package com.testTask.universe.service.response;

import com.testTask.universe.model.Galaxy;
import com.testTask.universe.model.response.GalaxyResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GalaxyResponseService {
    public GalaxyResponse wrapGalaxy(Galaxy galaxy){
        GalaxyResponse galaxyResponse = new GalaxyResponse();
        galaxyResponse.setId(galaxy.getId());
        galaxyResponse.setName(galaxy.getName());
        galaxyResponse.setMinorAxisDiameter(galaxy.getMinorAxisDiameter());
        galaxyResponse.setMajorAxisDiameter(galaxy.getMajorAxisDiameter());
        galaxyResponse.setGalaxyType(galaxy.getGalaxyType());
        galaxyResponse.setDistanceFromEarth(galaxy.getDistanceFromEarth());
        return galaxyResponse;
    }

    public List<GalaxyResponse> wrapGalaxies(List<Galaxy> galaxies){
        List<GalaxyResponse> galaxyResponses = new ArrayList<>();
        for (Galaxy galaxy : galaxies) {
            galaxyResponses.add(wrapGalaxy(galaxy));
        }
        return galaxyResponses;
    }
}
