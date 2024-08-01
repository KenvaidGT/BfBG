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

    public static final RegistryObject<Item> KHORNE_AX_BLADE = ITEMS.register("khorne_ax_blade",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_HANDLE = ITEMS.register("khorne_ax_handle",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_SPIKE = ITEMS.register("khorne_ax_spike",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_POMMEL = ITEMS.register("khorne_ax_pommel",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_HEAD = ITEMS.register("khorne_ax_head",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));

    public static final RegistryObject<AxeItem> KHORNE_AXE = ITEMS.register("khorne_axe",
            () -> new AxeItem(ModItemTier.AXE, 18, -3.2f, new Item.Properties().tab(ModItemGroup.BfBG)));

    public static final RegistryObject<Item> KHORNE_SHIELD = ITEMS.register("khorne_shield",
            () -> new ShieldItem(new Item.Properties().tab(ModItemGroup.BfBG).durability(336)));

    public static final RegistryObject<Item> BLOOD_INGOT = ITEMS.register("blood_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(64)));

    public static final RegistryObject<Item> BLACK_STEEL_INGOT = ITEMS.register("black_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(64)));

    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(64)));


    //

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}


