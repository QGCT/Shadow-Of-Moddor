package de.qgct.som;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import de.qgct.som.common.item.ItemReinforcedDiamond;

@Mod(modid = "shadowofmoddor", useMetadata = true)
public class ShadowOfModdor {


    ItemReinforcedDiamond itemReinforcedDiamond;



    @EventHandler
    public void init(FMLInitializationEvent event) {

        itemReinforcedDiamond = new ItemReinforcedDiamond();



    }
}
