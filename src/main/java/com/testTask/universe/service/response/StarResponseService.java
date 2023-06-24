package com.testTask.universe.service.response;

import com.testTask.universe.model.Star;
import com.testTask.universe.model.response.StarResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StarResponseService {
    private final GalaxyResponseService galaxyResponseService;
    public StarResponse wrapStar(Star star){
        StarResponse starResponse = new StarResponse();
        starResponse.setId(star.getId());
        starResponse.setName(star.getName());
        starResponse.setTemperature(star.getTemperature());
        starResponse.setSolarRadius(star.getSolarRadius());
        starResponse.setSolarLuminosity(star.getSolarLuminosity());
        starResponse.setSolarMass(star.getSolarMass());
        starResponse.setGalaxyResponse(galaxyResponseService.wrapGalaxy(star.getGalaxy()));
        return starResponse;
    }

    public List<StarResponse> wrapStars(List<Star> stars){
        List<StarResponse> starResponses = new ArrayList<>();
        for (Star star : stars) {
            starResponses.add(wrapStar(star));
        }
        return starResponses;
    }
}
