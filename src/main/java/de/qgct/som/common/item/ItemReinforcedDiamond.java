package de.qgct.som.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemReinforcedDiamond extends Item {

    public ItemReinforcedDiamond() {
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setMaxStackSize(64);
        this.setUnlocalizedName("itemReinforcedDiamond");
//        setTextureName("");
    }

}