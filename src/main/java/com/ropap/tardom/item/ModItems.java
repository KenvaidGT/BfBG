package com.ropap.tardom.item;

import com.ropap.tardom.item.custom.BloodBucket;
import com.ropap.tardom.item.geko.item.NorscaArmorTier1Item;
import com.ropap.tardom.item.geko.item.NorscaArmorTier2Item;
import com.ropap.tardom.item.geko.item.NorscaArmorTier3Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShieldItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.ropap.tardom.TCI;
import com.ropap.tardom.block.ModBlocks;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TCI.MOD_ID);

    //
    // Craft parts:
    public static final RegistryObject<Item> KHORNE_AX_BLADE = ITEMS.register("craft_parts/khorne_ax_blade",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_HANDLE = ITEMS.register("craft_parts/khorne_ax_handle",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_SPIKE = ITEMS.register("craft_parts/khorne_ax_spike",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_POMMEL = ITEMS.register("craft_parts/khorne_ax_pommel",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));

    public static final RegistryObject<Item> KHORNE_AX_HEAD = ITEMS.register("craft_parts/khorne_ax_head",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));

    //Materials:

    public static final RegistryObject<Item> BLOOD_INGOT = ITEMS.register("materials/blood_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(64)));

    public static final RegistryObject<Item> BLACK_STEEL_INGOT = ITEMS.register("materials/black_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(64)));

    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("materials/brass_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(64)));

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("materials/copper_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(64)));

    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("materials/zinc_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(64)));

    public static final RegistryObject<Item> BLOODY_SCRAPS = ITEMS.register("materials/bloody_scraps",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(64)));

    public static final RegistryObject<Item> BLOOD_GOD_RUNE = ITEMS.register("materials/blood_god_rune",
            () -> new Item(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));



    //Other

    public static final RegistryObject<Item> BLOOD_BUCKET = ITEMS.register("other/blood_bucket",
            () -> new BloodBucket(new Item.Properties().tab(ModItemGroup.BfBG).stacksTo(1)));




    // Instruments:

    public static final RegistryObject<AxeItem> KHORNE_AXE = ITEMS.register("instruments/khorne_axe",
            () -> new AxeItem(ModItemTier.AXE, 18, -3.2f, new Item.Properties().tab(ModItemGroup.BfBG)));

    public static final RegistryObject<Item> KHORNE_SHIELD = ITEMS.register("instruments/khorne_shield",
            () -> new ShieldItem(new Item.Properties().tab(ModItemGroup.BfBG).durability(888)));

    //armor:

    public static final RegistryObject<Item> NORSCA_ARMOR_TIER3_HELMET = ITEMS.register("armor/norsca_armor_tier3/norsca_armor_tier3_helmet",
            () -> new NorscaArmorTier3Item(EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> NORSCA_ARMOR_TIER3_CHESTPLATE = ITEMS.register("armor/norsca_armor_tier3/norsca_armor_tier3_chestplate",
            () -> new NorscaArmorTier3Item(EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> NORSCA_ARMOR_TIER3_LEGGINGS = ITEMS.register("armor/norsca_armor_tier3/norsca_armor_tier3_leggings",
            () -> new NorscaArmorTier3Item(EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> NORSCA_ARMOR_TIER3_BOOTS = ITEMS.register("armor/norsca_armor_tier3/norsca_armor_tier3_boots",
            () -> new NorscaArmorTier3Item(EquipmentSlotType.FEET));

    public static final RegistryObject<Item> NORSCA_ARMOR_TIER1_HELMET = ITEMS.register("armor/norsca_armor_tier1/norsca_armor_tier1_helmet",
            () -> new NorscaArmorTier1Item(EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> NORSCA_ARMOR_TIER1_CHESTPLATE = ITEMS.register("armor/norsca_armor_tier1/norsca_armor_tier1_chestplate",
            () -> new NorscaArmorTier1Item(EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> NORSCA_ARMOR_TIER1_LEGGINGS = ITEMS.register("armor/norsca_armor_tier1/norsca_armor_tier1_leggings",
            () -> new NorscaArmorTier1Item(EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> NORSCA_ARMOR_TIER1_BOOTS = ITEMS.register("armor/norsca_armor_tier1/norsca_armor_tier1_boots",
            () -> new NorscaArmorTier1Item(EquipmentSlotType.FEET));

    public static final RegistryObject<Item> NORSCA_ARMOR_TIER2_HELMET = ITEMS.register("armor/norsca_armor_tier2/norsca_armor_tier2_helmet",
            () -> new NorscaArmorTier2Item(EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> NORSCA_ARMOR_TIER2_CHESTPLATE = ITEMS.register("armor/norsca_armor_tier2/norsca_armor_tier2_chestplate",
            () -> new NorscaArmorTier2Item(EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> NORSCA_ARMOR_TIER2_LEGGINGS = ITEMS.register("armor/norsca_armor_tier2/norsca_armor_tier2_leggings",
            () -> new NorscaArmorTier2Item(EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> NORSCA_ARMOR_TIER2_BOOTS = ITEMS.register("armor/norsca_armor_tier2/norsca_armor_tier2_boots",
            () -> new NorscaArmorTier2Item(EquipmentSlotType.FEET));





    //

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}


