package com.ropap.tardom.item.geko.renderer;

import com.ropap.tardom.item.CustomArmorItem;
import com.ropap.tardom.item.geko.model.NorscaArmorTier2;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class NorscaArmorTier2Renderer extends GeoArmorRenderer<CustomArmorItem> {
    public NorscaArmorTier2Renderer() {
        super(new NorscaArmorTier2());

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
