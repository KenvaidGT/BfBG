package com.ropap.tardom.item.geko.item;

import com.ropap.tardom.item.CustomArmorItem;
import com.ropap.tardom.item.ModArmorMaterial;
import com.ropap.tardom.item.ModItemGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

public class NorscaArmorTier2Item extends CustomArmorItem {
    public NorscaArmorTier2Item(EquipmentSlotType slot) {
        super(ModArmorMaterial.NORSCAT2, slot, "NorscaArmorTier2", new Item.Properties().tab(ModItemGroup.BfBG));
    }
}
