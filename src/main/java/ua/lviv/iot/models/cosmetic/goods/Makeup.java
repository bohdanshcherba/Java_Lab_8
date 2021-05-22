package ua.lviv.iot.models.cosmetic.goods;

import ua.lviv.iot.models.ItemType;
import ua.lviv.iot.models.cosmetic.Cosmetic;
import ua.lviv.iot.models.cosmetic.Gender;
import ua.lviv.iot.models.cosmetic.ManufacturingProcess;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Makeup extends Cosmetic {
    private String makeupAttributes;

    public Makeup(String name,
                  double price,
                  String producer,

                  Gender gender,
                  ManufacturingProcess manufacturingProcess,
                  String attributes) {
        super(name, price, producer,  gender, manufacturingProcess);
        this.makeupAttributes = attributes;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Price: " + getPrice() + "$\n"
                + "Producer: " + getProducer() + "\n"
                + "professional: " + getGender() + "\n"
                + "Length mm: " + getManufacturingProcess() + "\n"
                + "makeup attributes: " + makeupAttributes + "\n";
    }
}
