package com.ropap.tardom.item.geko.model;


import com.ropap.tardom.item.CustomArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NorscaArmorTier2 extends AnimatedGeoModel<CustomArmorItem> {

    @Override
    public ResourceLocation getModelLocation(CustomArmorItem object) {
        return new ResourceLocation("bfbg", "geo/models/norsca_armor_tier2.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CustomArmorItem object) {
        return new ResourceLocation("bfbg", "textures/item/armor/norsca_armor_tier2.png");    }

    @Override
    public ResourceLocation getAnimationFileLocation(CustomArmorItem animatable) {
        return new ResourceLocation("bfbg", "animations/armor/norsca_armor_tier2.animation.json");
    }
}
