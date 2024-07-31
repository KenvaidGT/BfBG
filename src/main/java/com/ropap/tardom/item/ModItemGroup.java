package com.ropap.tardom.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModItemGroup {

    public static final ItemGroup CARROT = new ItemGroup("carrot") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.CARROT);
        }
    };

}
