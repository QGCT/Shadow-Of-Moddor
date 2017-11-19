package de.qgct.som;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.qgct.som.client.render.block.BlockRenderRegister;
import de.qgct.som.common.manager.BlockManager;

@Mod(modid = "shadowofmoddor", useMetadata = true)
public class ShadowOfModdor
{
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        BlockManager.createBlocks();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        BlockRenderRegister.registerBlockRenderer();
    }
}
