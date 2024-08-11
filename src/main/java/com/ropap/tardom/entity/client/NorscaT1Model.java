package com.ropap.tardom.entity.client;

import com.ropap.tardom.TCI;
import com.ropap.tardom.entity.custom.NorscaT1Entity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NorscaT1Model extends AnimatedGeoModel<NorscaT1Entity> {
    @Override
    public ResourceLocation getModelLocation(NorscaT1Entity norscaT1Entity) {
        return new ResourceLocation(TCI.MOD_ID, "geo/models/entity/norsca_t1_entity.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(NorscaT1Entity norscaT1Entity) {
        return new ResourceLocation(TCI.MOD_ID, "textures/entity/norsca_t1_entity.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(NorscaT1Entity norscaT1Entity) {
        return new ResourceLocation(TCI.MOD_ID, "animations/entity/norsca_t1_entity.animation.json");
    }
}