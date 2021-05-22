package ua.lviv.iot.models.cosmetic;

import ua.lviv.iot.models.ItemType;
import ua.lviv.iot.models.Items;
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
                    Gender gender,
                    ManufacturingProcess manufacturingProcess) {
        super(name, price, producer);
        this.gender = gender;
        this.manufacturingProcess = manufacturingProcess;
    }
}
