package ua.lviv.iot.models.cosmeticTools.goods;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MakeupBrushes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double price;
    private String producer;
    private boolean professional;
    private Integer lengthMm;
    private Integer rigidity;


}
