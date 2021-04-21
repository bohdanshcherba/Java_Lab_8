package iot.lviv.ua.items.cosmeticTools;

import iot.lviv.ua.items.ItemType;
import iot.lviv.ua.items.Items;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CosmeticTools extends Items {

    private boolean professional;

    public CosmeticTools(String name,
                         double price,
                         String producer,
                         ItemType type,
                         boolean professional) {
        super(name,
                price,
                producer,
                ItemType.COSMETIC_TOOLS);
        this.professional = professional;
    }
}
