package com.ropap.tardom.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    EXAMPLE("example", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.of(Items.DIAMOND);
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] armorValues;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairMaterial;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] armorValues, int enchantability, SoundEvent equipSound,
                     float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.armorValues = armorValues;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = Lazy.of(repairMaterial);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return BASE_DURABILITY[slot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.armorValues[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
