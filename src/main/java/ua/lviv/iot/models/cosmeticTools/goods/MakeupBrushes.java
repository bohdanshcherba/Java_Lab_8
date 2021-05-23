package ua.lviv.iot.models.cosmeticTools.goods;

import lombok.*;
import ua.lviv.iot.models.ItemType;
import ua.lviv.iot.models.cosmeticTools.CosmeticTools;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MakeupBrushes extends CosmeticTools {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    private String name;
    private double price;
    private String producer;
    private boolean professional;
    private Integer lengthMm;
    private Integer rigidity;




//
//    public MakeupBrushes(String name, double price, String producer,
//                          boolean professional,
//                         Integer lengthMm, Integer rigidity) {
//        super(name, price, producer,  professional);
//        this.lengthMm = lengthMm;
//        this.rigidity = rigidity;
//    }
//
//    @Override
//    public String toString() {
//        return "Name: " + getName() + "\n"
//                + "Price: " + getPrice() + "$\n"
//                + "Producer: " + getProducer() + "\n"
//                + "professional: " + isProfessional() + "\n"
//                + "Length mm: " + getLengthMm() + "\n"
//                + "Rigidity: " + getRigidity() + "\n";
//    }


}
