package de.qgct.som;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import de.qgct.som.common.manager.BlockManager;
import de.qgct.som.common.manager.ItemManager;
import de.qgct.som.common.manager.OreManager;

@Mod(modid = ShadowOfModdor.modID, useMetadata = true)
public class ShadowOfModdor {

    public static final String modID = "shadowofmoddor";
    public static final String modName = "Shadow Of Moddor";

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        BlockManager.createBlocks();
        ItemManager.createItems();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new OreManager(), 100);
    }
}
