package iot.lviv.ua.items.cosmetic.goods;

import iot.lviv.ua.items.ItemType;
import iot.lviv.ua.items.cosmetic.Cosmetic;
import iot.lviv.ua.items.cosmetic.Gender;
import iot.lviv.ua.items.cosmetic.ManufacturingProcess;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Makeup extends Cosmetic {
    private String makeupAttributes;

    public Makeup(String name,
                  double price,
                  String producer,
                  ItemType type,
                  Gender gender,
                  ManufacturingProcess manufacturingProcess,
                  String Attributes) {
        super(name, price, producer, type, gender, manufacturingProcess);
        this.makeupAttributes = Attributes;
    }

    @Override
    public String toString() {
        return "Item type: " + getType() + "\n"
                + "Name: " + getName() + "\n"
                + "Price: " + getPrice() + "$\n"
                + "Producer: " + getProducer() + "\n"
                + "professional: " + getGender() + "\n"
                + "Length mm: " + getManufacturingProcess() + "\n"
                + "makeup attributes: " + makeupAttributes + "\n";
    }
}