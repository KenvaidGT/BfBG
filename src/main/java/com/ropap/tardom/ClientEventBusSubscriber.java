package com.ropap.tardom;

import com.ropap.tardom.entity.ModEntityTypes;
import com.ropap.tardom.entity.custom.NorscaT1Entity;
import com.ropap.tardom.item.CustomArmorItem;
import com.ropap.tardom.item.ModItems;
import com.ropap.tardom.item.geko.item.NorscaArmorTier1Item;
import com.ropap.tardom.item.geko.item.NorscaArmorTier2Item;
import com.ropap.tardom.item.geko.item.NorscaArmorTier3Item;
import com.ropap.tardom.item.geko.renderer.NorscaArmorTier1Renderer;
import com.ropap.tardom.item.geko.renderer.NorscaArmorTier2Renderer;
import com.ropap.tardom.item.geko.renderer.NorscaArmorTier3Renderer;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = TCI.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        GeoArmorRenderer.registerArmorRenderer(NorscaArmorTier1Item.class, new NorscaArmorTier1Renderer());
        GeoArmorRenderer.registerArmorRenderer(NorscaArmorTier2Item.class, new NorscaArmorTier2Renderer());
        GeoArmorRenderer.registerArmorRenderer(NorscaArmorTier3Item.class, new NorscaArmorTier3Renderer());

        ItemModelsProperties.register(ModItems.KHORNE_SHIELD.get(), new ResourceLocation("blocking"),
                (stack, world, entity) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F);
    }

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.NORSCA_T1.get(), NorscaT1Entity.createAttributes());
    }

}
