package ua.lviv.iot.models.cosmeticTools.goods;

import lombok.*;
import ua.lviv.iot.models.ItemType;
import ua.lviv.iot.models.cosmeticTools.CosmeticTools;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Getter
@Setter
public class MakeupBrushes extends CosmeticTools {
    private Integer lengthMm;
    private Integer rigidity;
    public int id;

    public MakeupBrushes(String name, double price, String producer,
                          boolean professional,
                         Integer lengthMm, Integer rigidity) {
        super(name, price, producer,  professional);
        this.lengthMm = lengthMm;
        this.rigidity = rigidity;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Price: " + getPrice() + "$\n"
                + "Producer: " + getProducer() + "\n"
                + "professional: " + isProfessional() + "\n"
                + "Length mm: " + getLengthMm() + "\n"
                + "Rigidity: " + getRigidity() + "\n";
    }


}
