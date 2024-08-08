package com.ropap.tardom.item.geko.renderer;

import com.ropap.tardom.item.CustomArmorItem;
import com.ropap.tardom.item.geko.model.NorscaArmorTier3;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class NorscaArmorTier3Renderer extends GeoArmorRenderer<CustomArmorItem> {
    public NorscaArmorTier3Renderer() {
        super(new NorscaArmorTier3());

        // Эти методы связывают части брони с определенными частями модели
        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
