package com.ropap.tardom.item.geko.item;

import com.ropap.tardom.item.CustomArmorItem;
import com.ropap.tardom.item.ModArmorMaterial;
import com.ropap.tardom.item.ModItemGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

public class NorscaArmorTier1Item extends CustomArmorItem {
    public NorscaArmorTier1Item(EquipmentSlotType slot) {
        super(ModArmorMaterial.NORSCAT1, slot, "NorscaArmorTier1", new Item.Properties().tab(ModItemGroup.BfBG));
    }
}
