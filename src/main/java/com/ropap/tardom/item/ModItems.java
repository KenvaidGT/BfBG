package com.ropap.tardom.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShieldItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.ropap.tardom.TCI;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TCI.MOD_ID);

    //

    public static final RegistryObject<Item> TUTORIAL_ITEM = ITEMS.register("tutorial_item",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CARROT)));

    public static final RegistryObject<Item> KHORNE_AX_BLADE = ITEMS.register("khorne_ax_blade",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CARROT).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_HANDLE = ITEMS.register("khorne_ax_handle",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CARROT).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_SPIKE = ITEMS.register("khorne_ax_spike",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CARROT).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_POMMEL = ITEMS.register("khorne_ax_pommel",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CARROT).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_HEAD = ITEMS.register("khorne_ax_head",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CARROT).stacksTo(1)));

    public static final RegistryObject<AxeItem> KHORNE_AXE = ITEMS.register("khorne_axe",
            () -> new AxeItem(ModItemTier.AXE, 18, -3.2f, new Item.Properties().tab(ModItemGroup.CARROT)));

    public static final RegistryObject<Item> KHORNE_SHIELD = ITEMS.register("khorne_shield",
            () -> new ShieldItem(new Item.Properties().tab(ModItemGroup.CARROT).durability(336)));

    //

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}


