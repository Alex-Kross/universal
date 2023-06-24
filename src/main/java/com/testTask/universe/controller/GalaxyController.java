package com.testTask.universe.controller;

import com.testTask.universe.model.Galaxy;
import com.testTask.universe.model.response.GalaxyResponse;
import com.testTask.universe.service.impl.GalaxyServiceImpl;
import com.testTask.universe.service.response.GalaxyResponseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class GalaxyController {
    private final GalaxyServiceImpl galaxyService;
    private final GalaxyResponseService galaxyResponseService;

    @GetMapping("/galaxies")
    List<GalaxyResponse> getGalaxies() {
        return galaxyResponseService.wrapGalaxies(galaxyService.getGalaxies());
    }

    @PostMapping("/galaxies")
    GalaxyResponse createGalaxy(@RequestBody Galaxy newGalaxy) {
        return galaxyResponseService.wrapGalaxy(galaxyService.saveGalaxy(newGalaxy));
    }
    @GetMapping("/galaxies/{id}")
    GalaxyResponse getGalaxy(@PathVariable Long id) {
        return galaxyResponseService.wrapGalaxy(galaxyService.getGalaxyById(id));
    }

    @PutMapping("/galaxies/{id}")
    GalaxyResponse updateGalaxy(@RequestBody Galaxy galaxy, @PathVariable Long id) {
        return galaxyResponseService.wrapGalaxy(galaxyService.updateGalaxy(galaxy, id));
    }

    @DeleteMapping("/galaxies/{id}")
    void deleteGalaxy(@PathVariable Long id) {
        galaxyService.deleteGalaxy(id);
    }
}
