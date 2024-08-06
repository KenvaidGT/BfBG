package com.ropap.tardom.item.geko.renderer;

import com.ropap.tardom.item.CustomArmorItem;
import com.ropap.tardom.item.geko.model.NorscaArmorTier3;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class NorscaArmorRenderer extends GeoArmorRenderer<CustomArmorItem> {
    public NorscaArmorRenderer() {
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
