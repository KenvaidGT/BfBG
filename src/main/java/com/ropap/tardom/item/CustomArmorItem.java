package com.ropap.tardom.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;
import software.bernie.geckolib3.core.IAnimatable;

public class CustomArmorItem extends GeoArmorItem implements IAnimatable {

    private final String armorType;
    private final AnimationFactory factory = new AnimationFactory(this);

    public CustomArmorItem(IArmorMaterial material, EquipmentSlotType slot, String armorType, Item.Properties properties) {
        super(material, slot, properties);
        this.armorType = armorType;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this, "controller", 20, this::predicate));
    }

    private <P extends Item & IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    public String getArmorType() {
        return armorType;
    }
}
