package pl.plantmanagement.plantmanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plant {

    private int id;
    private String polish_name;
    private String latin_name;
    private int watering;
    private String blooming;
}
