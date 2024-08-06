package com.ropap.tardom;

import com.ropap.tardom.item.CustomArmorItem;
import com.ropap.tardom.item.ModItems;
import com.ropap.tardom.item.geko.renderer.NorscaArmorRenderer;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = TCI.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        GeoArmorRenderer.registerArmorRenderer(CustomArmorItem.class, new NorscaArmorRenderer());

        ItemModelsProperties.register(ModItems.KHORNE_SHIELD.get(), new ResourceLocation("blocking"),
                (stack, world, entity) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F);
    }
}
