package de.qgct.som.common.manager;

import cpw.mods.fml.common.registry.GameRegistry;
import de.qgct.som.common.item.ItemReinforcedDiamond;

public class ItemManager {

private static ItemReinforcedDiamond itemReinforcedDiamond;

public static void createItems(){

    itemReinforcedDiamond = new ItemReinforcedDiamond();
    GameRegistry.registerItem(itemReinforcedDiamond,"ReinforcedDiamond");


}
}
