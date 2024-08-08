package com.ropap.tardom.item.geko.renderer;

import com.ropap.tardom.item.CustomArmorItem;
import com.ropap.tardom.item.geko.model.NorscaArmorTier1;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class NorscaArmorTier1Renderer extends GeoArmorRenderer<CustomArmorItem> {
    public NorscaArmorTier1Renderer() {
        super(new NorscaArmorTier1());

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
