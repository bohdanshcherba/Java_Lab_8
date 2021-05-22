package ua.lviv.iot.models.cosmeticTools;

import ua.lviv.iot.models.ItemType;
import ua.lviv.iot.models.Items;
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

                         boolean professional) {
        super(name,
                price,
                producer);
        this.professional = professional;
    }
}
