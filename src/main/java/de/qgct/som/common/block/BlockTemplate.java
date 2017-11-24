package de.qgct.som.common.block;

import de.qgct.som.ShadowOfModdor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTemplate extends Block {

    protected String unlocalizedName;
    protected float hardness;
    protected float resistance;
    protected String toolClass;
    protected int toolLevel;

    public BlockTemplate(Material material, String textureName) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName(ShadowOfModdor.modID + ":" + textureName);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(toolClass, toolLevel);
    }

    public BlockTemplate(Material material) {
        this(material, "placeholder");
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }

}
