package pl.plantmanagement.plantmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public class PlantRepository {
    @Autowired
    JdbcTemplate jbdcTemplate;

    public List<Plant> getAll(){
        return jbdcTemplate.query("SELECT id, polish_name, latin_name, watering, blooming FROM plants",
                BeanPropertyRowMapper.newInstance(Plant.class));
    }

    public Plant getById(int id){
        return jbdcTemplate.queryForObject("SELECT id, polish_name, latin_name, watering, blooming FROM plants WHERE " +
                "id = ?", BeanPropertyRowMapper.newInstance(Plant.class), id);
    }

    public int save(List<Plant> plants) {
        plants.forEach(plant -> jbdcTemplate
                .update("INSERT INTO plants(polish_name, latin_name, watering, blooming) VALUES(?, ?, ?, ?)",
                        plant.getPolish_name(),plant.getLatin_name(),plant.getWatering(),plant.getBlooming()));
        return 1;
    }

    public int update(Plant plant){
        return jbdcTemplate.update("UPDATE plants SET polish_name=?, latin_name=?, watering=?, blooming=? WHERE id=?",
                plant.getPolish_name(),plant.getLatin_name(),plant.getWatering(),plant.getBlooming(),plant.getId());
    }

    public int delete(int id) {
       return jbdcTemplate.update("DELETE FROM plants WHERE id=?", id);
    }
}

