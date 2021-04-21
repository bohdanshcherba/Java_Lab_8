package iot.lviv.ua.items.cosmeticTools.goods;

import iot.lviv.ua.items.ItemType;
import iot.lviv.ua.items.cosmeticTools.CosmeticTools;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class MakeupBrushes extends CosmeticTools {
    private Integer lengthMm;
    private Integer rigidity;

    public MakeupBrushes(String name, double price, String producer,
                         ItemType type, boolean professional,
                         Integer lengthMm, Integer rigidity) {
        super(name, price, producer, type, professional);
        this.lengthMm = lengthMm;
        this.rigidity = rigidity;
    }

    @Override
    public String toString() {
        return "Item type: " + getType() + "\n"
                + "Name: " + getName() + "\n"
                + "Price: " + getPrice() + "$\n"
                + "Producer: " + getProducer() + "\n"
                + "professional: " + isProfessional() + "\n"
                + "Length mm: " + getLengthMm() + "\n"
                + "Rigidity: " + getRigidity() + "\n";
    }
}