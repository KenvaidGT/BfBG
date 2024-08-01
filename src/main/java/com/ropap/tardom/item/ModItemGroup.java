package com.ropap.tardom.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModItemGroup {

    public static final ItemGroup BfBG = new ItemGroup("bfbg") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.SKELETON_SKULL);
        }
    };

}