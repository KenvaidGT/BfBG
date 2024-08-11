package com.ropap.tardom.entity.client;

import com.ropap.tardom.TCI;
import com.ropap.tardom.entity.custom.NorscaT1Entity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import com.mojang.blaze3d.vertex.IVertexBuilder; // Импортируем правильный класс

public class NorscaT1Renderer extends GeoEntityRenderer<NorscaT1Entity> {
    public NorscaT1Renderer(EntityRendererManager renderManager) {
        super(renderManager, new NorscaT1Model());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(NorscaT1Entity instance) {
        return new ResourceLocation(TCI.MOD_ID, "textures/entity/norsca_t1_entity.png");
    }

    @Override
    public RenderType getRenderType(NorscaT1Entity animatable, float partialTicks, MatrixStack stack,
                                    IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
