package com.ropap.tardom.item.geko.item;

import com.ropap.tardom.item.CustomArmorItem;
import com.ropap.tardom.item.ModArmorMaterial;
import com.ropap.tardom.item.ModItemGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

public class NorscaArmorTier3Item extends CustomArmorItem {
    public NorscaArmorTier3Item(EquipmentSlotType slot) {
        super(ModArmorMaterial.NORSCAT3, slot, "NorscaArmorTier3", new Item.Properties().tab(ModItemGroup.BfBG));
    }
}
