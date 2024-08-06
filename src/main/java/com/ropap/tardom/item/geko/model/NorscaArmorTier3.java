package com.ropap.tardom.item.geko.model;

import com.ropap.tardom.TCI;
import com.ropap.tardom.item.CustomArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NorscaArmorTier3 extends AnimatedGeoModel<CustomArmorItem> {

    @Override
    public ResourceLocation getModelLocation(CustomArmorItem object) {
        return new ResourceLocation("bfbg", "geo/models/norsca_armor_tier3.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CustomArmorItem object) {
        return new ResourceLocation("bfbg", "textures/item/armor/norsca_armor_tier3.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CustomArmorItem animatable) {
        return new ResourceLocation("bfbg", "animations/armor/norsca_armor_tier3.animation.json");
    }
}
