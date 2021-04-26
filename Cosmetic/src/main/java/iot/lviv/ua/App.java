package iot.lviv.ua;

import iot.lviv.ua.items.ItemType;
import iot.lviv.ua.items.Items;
import iot.lviv.ua.items.cosmetic.Gender;
import iot.lviv.ua.items.cosmetic.ManufacturingProcess;
import iot.lviv.ua.items.cosmetic.goods.Makeup;
import iot.lviv.ua.items.cosmetic.goods.SkinCare;
import iot.lviv.ua.items.cosmeticTools.goods.MakeupBrushes;
import iot.lviv.ua.manager.CosmeticManager;
import iot.lviv.ua.manager.SortOrder;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Makeup makeup = new Makeup("Rainbow Colors", (double) 9.98,
                "BestLand", ItemType.COSMETIC,
                Gender.FEMALE, ManufacturingProcess.HandMade, "some");
        SkinCare skinCare = new SkinCare("Rainbow Colors", (double) 9.12,
                "maven", ItemType.COSMETIC,
                Gender.FEMALE, ManufacturingProcess.MachineMade,
                "white", "plastic");
        MakeupBrushes makeupBrushes = new MakeupBrushes("Collection brushes",
                (double) 22.2, "Cheburechna",
                ItemType.COSMETIC_TOOLS, true, (int)22, (int)120);


        List<Items> arrayOfItems = new ArrayList<Items>();
        arrayOfItems.add(skinCare);
        arrayOfItems.add(makeup);
        arrayOfItems.add(makeupBrushes);

        CosmeticManager cosmeticManager = new CosmeticManager(arrayOfItems);


        System.out.println("All");
        cosmeticManager.printAllItems();
        System.out.println("Sorted");
        cosmeticManager.sortByPrice(SortOrder.DESC);

        System.out.println("Search Cosmetic tools");
        cosmeticManager.searchByType(ItemType.COSMETIC_TOOLS);
    }
}
