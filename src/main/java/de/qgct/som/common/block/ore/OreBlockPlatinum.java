package de.qgct.som.common.block.ore;

import de.qgct.som.ShadowOfModdor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreBlockPlatinum extends Block {

    protected String unlocalizedName = "platinum_ore";
    protected float hardness = 5.0f;
    protected float resistance = 15.0f;
    protected String toolClass = "pickaxe";
    protected int toolLevel = 3;

    public OreBlockPlatinum() {
        super(Material.rock);
        this.setBlockName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName(ShadowOfModdor.modID + ":plutonium_ore");
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(toolClass, toolLevel);
    }

}