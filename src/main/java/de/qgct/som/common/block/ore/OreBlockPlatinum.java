package de.qgct.som.common.block.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreBlockPlatinum extends Block {

    private String unlocalizedName = "platinum_ore";
    private float hardness = 5.0f;
    private float resistance = 15.0f;

    public OreBlockPlatinum() {
        super(Material.rock);
        this.setBlockName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

}