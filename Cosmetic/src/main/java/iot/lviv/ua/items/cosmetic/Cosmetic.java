package iot.lviv.ua.items.cosmetic;

import iot.lviv.ua.items.ItemType;
import iot.lviv.ua.items.Items;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cosmetic extends Items {

    private Gender gender;
    private ManufacturingProcess manufacturingProcess;

    public Cosmetic(String name,
                    double price,
                    String producer,
                    ItemType type,
                    Gender gender,
                    ManufacturingProcess manufacturingProcess) {
        super(name, price, producer, type);
        this.gender = gender;
        this.manufacturingProcess = manufacturingProcess;
    }
}
