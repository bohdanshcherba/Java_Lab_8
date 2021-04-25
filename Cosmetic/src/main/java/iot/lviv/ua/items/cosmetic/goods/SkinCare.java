package iot.lviv.ua.items.cosmetic.goods;

import iot.lviv.ua.items.ItemType;
import iot.lviv.ua.items.cosmetic.Cosmetic;
import iot.lviv.ua.items.cosmetic.Gender;
import iot.lviv.ua.items.cosmetic.ManufacturingProcess;
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
                    ItemType type,
                    Gender gender,
                    ManufacturingProcess manufacturingProcess,
                    String skin,
                    String attributes) {
        super(name, price, producer, type, gender, manufacturingProcess);
        this.skin = skin;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Item type: " + getType() + "\n"
                + "Name: " + getName() + "\n"
                + "Price: " + getPrice() + "$\n"
                + "Producer: " + getProducer() + "\n"
                + "professional: " + getGender() + "\n"
                + "Length mm: " + getManufacturingProcess() + "\n"
                + "Skin type: " + skin + "\n"
                + "Attributes: " + attributes + "\n";
    }
}
