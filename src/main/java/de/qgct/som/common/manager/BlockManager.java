package de.qgct.som.common.manager;

import cpw.mods.fml.common.registry.GameRegistry;
import de.qgct.som.common.block.ore.OreBlockPlatinum;
import net.minecraft.block.Block;

public class BlockManager {

    private static Block oreBlockPlatinum;

    public static void createBlocks() {
        GameRegistry.registerBlock(oreBlockPlatinum = new OreBlockPlatinum(), oreBlockPlatinum.getUnlocalizedName());
    }

}
