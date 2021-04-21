package iot.lviv.ua.items;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {
    private String name;
    private double price;
    private String producer;
    private ItemType type;
}