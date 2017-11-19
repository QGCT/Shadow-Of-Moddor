package de.qgct.som.common.manager;

import cpw.mods.fml.common.registry.GameRegistry;
import de.qgct.som.common.block.ore.OreBlockPlatinum;

public class BlockManager {

    public static void createBlocks() {
        GameRegistry.registerBlock(new OreBlockPlatinum(), "platinum_ore");
    }

}
