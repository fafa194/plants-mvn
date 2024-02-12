package pl.plantmanagement.plantmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plants")
public class PlantController {

    @Autowired
    PlantRepository plantRepository;


    @GetMapping("")
    public List<Plant> getAll(){
        return plantRepository.getAll();
    }
    @GetMapping("/{id}")
    public Plant getById(@PathVariable("id") int id){
        return plantRepository.getById(id);
    }
    @PostMapping("")
    public int add(@RequestBody List<Plant> plants) {
        return plantRepository.save(plants);
    }
    @PutMapping("/{id}")
    public int update(@PathVariable("id") int id, @RequestBody Plant updatedPlant){
        Plant plant = plantRepository.getById(id);

        if (plant != null){
            plant.setPolish_name(updatedPlant.getPolish_name());
            plant.setLatin_name(updatedPlant.getLatin_name());
            plant.setWatering(updatedPlant.getWatering());
            plant.setBlooming(updatedPlant.getBlooming());

            plantRepository.update(plant);
            return 1;
        } else {
            return -1;
        }
    }

    @PatchMapping("/{id}")
    public int partiallyupdated(@PathVariable("id") int id, @RequestBody Plant updatedPlant) {
        Plant plant = plantRepository.getById(id);

        if (plant != null){
            if (updatedPlant.getPolish_name() != null) plant.setPolish_name(updatedPlant.getPolish_name());
            if (updatedPlant.getLatin_name() != null) plant.setLatin_name(updatedPlant.getLatin_name());
            if (updatedPlant.getWatering() > 0) plant.setWatering(updatedPlant.getWatering());
            if (updatedPlant.getBlooming() != null) plant.setBlooming(updatedPlant.getBlooming());
            plantRepository.update(plant);
            return 1;
        } else {
            return -1;
        }
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable("id") int id){
        return plantRepository.delete(id);
    }



}
