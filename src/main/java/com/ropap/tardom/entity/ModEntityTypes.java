package com.ropap.tardom.entity;

import com.ropap.tardom.TCI;
import com.ropap.tardom.entity.custom.NorscaT1Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE =
            DeferredRegister.create(ForgeRegistries.ENTITIES, TCI.MOD_ID);

    public static final RegistryObject<EntityType<NorscaT1Entity>> NORSCA_T1 =
            ENTITY_TYPE.register("norsca_t1",
                    ()-> EntityType.Builder.of(NorscaT1Entity::new,
                            EntityClassification.MONSTER)
                            .sized(0.6f,1.95f)
                    .build(new ResourceLocation(TCI.MOD_ID, "norsca_t1").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPE.register(eventBus);
    }
}
