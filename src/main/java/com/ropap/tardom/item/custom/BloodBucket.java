package com.ropap.tardom.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class BloodBucket extends MilkBucketItem {

    public BloodBucket(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, World world, LivingEntity entity) {
        if (!world.isClientSide) {
            entity.addEffect(new EffectInstance(Effects.POISON, 600, 0));
            entity.addEffect(new EffectInstance(Effects.BLINDNESS, 300, 0));
            entity.addEffect(new EffectInstance(Effects.CONFUSION, 450, 4));// 600 тиков = 30 секунд
        }
        return super.finishUsingItem(stack, world, entity);
    }
    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(Items.BUCKET);
    }
}

