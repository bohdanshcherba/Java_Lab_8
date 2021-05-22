package ua.lviv.iot.models.cosmetic.goods;

import ua.lviv.iot.models.ItemType;
import ua.lviv.iot.models.cosmetic.Gender;
import ua.lviv.iot.models.cosmetic.Cosmetic;
import ua.lviv.iot.models.cosmetic.ManufacturingProcess;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SkinCare extends Cosmetic {
    private String skin;
    private String attributes;

    public SkinCare(String name,
                    double price,
                    String producer,
                    Gender gender,
                    ManufacturingProcess manufacturingProcess,
                    String skin,
                    String attributes) {
        super(name, price, producer,  gender, manufacturingProcess);
        this.skin = skin;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Price: " + getPrice() + "$\n"
                + "Producer: " + getProducer() + "\n"
                + "professional: " + getGender() + "\n"
                + "Length mm: " + getManufacturingProcess() + "\n"
                + "Skin type: " + skin + "\n"
                + "Attributes: " + attributes + "\n";
    }
}
