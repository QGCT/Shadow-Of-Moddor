package de.qgct.som;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import de.qgct.som.common.manager.BlockManager;
import de.qgct.som.common.manager.OreManager;

@Mod(modid = "shadowofmoddor", useMetadata = true)
public class ShadowOfModdor {

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        BlockManager.createBlocks();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new OreManager(), 100);
    }
}
