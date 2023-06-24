package com.testTask.universe.controller;

import com.testTask.universe.model.Star;
import com.testTask.universe.model.response.StarResponse;
import com.testTask.universe.service.impl.StarServiceImpl;
import com.testTask.universe.service.response.StarResponseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class StarController {
    private final StarServiceImpl starService;
    private final StarResponseService starResponseService;

    @GetMapping("/stars")
    List<StarResponse> getStars() {
        return starResponseService.wrapStars(starService.getStars());
    }

    @GetMapping("/galaxies/{galaxyId}/stars")
    List<StarResponse> getStarsOfGalaxy(@PathVariable Long galaxyId) {
        return starResponseService.wrapStars(starService.getStarsOfGalaxy(galaxyId));
    }

    @PostMapping("/galaxies/{galaxyId}/stars")
    StarResponse createStar(@PathVariable Long galaxyId, @RequestBody Star newStar) {
        return starResponseService.wrapStar(starService.saveStar(galaxyId, newStar));
    }

    @GetMapping("/stars/{id}")
    StarResponse getStar(@PathVariable Long id) {
        return starResponseService.wrapStar(starService.getStarById(id));
    }

    @PutMapping("/stars/{id}")
    StarResponse updateStar(@RequestBody Star star, @PathVariable Long id) {
        return starResponseService.wrapStar(starService.updateStar(star, id));
    }

    @DeleteMapping("/stars/{id}")
    void deleteStar(@PathVariable Long id) {
        starService.deleteStar(id);
    }
}
