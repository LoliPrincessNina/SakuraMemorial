package com.loliprincessnina.sakuramemorial.item;

import com.loliprincessnina.sakuramemorial.SakuraMemorial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SakuraMemorial.MOD_ID);
    public static final List<DeferredItem<? extends Item>> ALL_ITEMS = new ArrayList<>();

    public static final DeferredItem<Item> NUGGET_MOLD = registerItem("nugget_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> INGOT_MOLD = registerItem("ingot_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> GEM_MOLD = registerItem("gem_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> BLOCK_MOLD = registerItem("block_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> ROD_MOLD = registerItem("rod_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> PLATE_MOLD = registerItem("plate_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> GEAR_MOLD = registerItem("gear_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> WIRE_MOLD = registerItem("wire_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> BALL_MOLD = registerItem("ball_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> COIN_MOLD = registerItem("coin_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> UNPACKING_MOLD = registerItem("unpacking_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> PACKING_MOLD_2X2 = registerItem("packing_mold_2x2",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> PACKING_MOLD_3X3 = registerItem("packing_mold_3x3",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> STAIR_MOLD = registerItem("stair_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SLAB_MOLD = registerItem("slab_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> FENCE_MOLD = registerItem("fence_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> FENCE_GATE_MOLD = registerItem("fence_gate_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> DOOR_MOLD = registerItem("door_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> TRAPDOOR_MOLD = registerItem("trapdoor_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> PRESSURE_PLATE_MOLD = registerItem("pressure_plate_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> BUTTON_MOLD = registerItem("button_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> WALL_MOLD = registerItem("wall_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CARPET_MOLD = registerItem("carpet_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> PANE_MOLD = registerItem("pane_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> LADDER_MOLD = registerItem("ladder_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> RAIL_MOLD = registerItem("rail_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CHAIN_MOLD = registerItem("chain_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> LEATHER_MOLD = registerItem("leather_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> DROPLET_MOLD = registerItem("droplet_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CRAFTING_TABLE_MOLD = registerItem("crafting_table_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> FURNACE_MOLD = registerItem("furnace_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> ANVIL_MOLD = registerItem("anvil_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> COMPOSTER_MOLD = registerItem("composter_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CAULDRON_MOLD = registerItem("cauldron_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SIGN_MOLD = registerItem("sign_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CHEST_MOLD = registerItem("chest_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> BARREL_MOLD = registerItem("barrel_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CORAL_MOLD = registerItem("coral_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CORAL_FAN_MOLD = registerItem("coral_fan_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> MINECART_MOLD = registerItem("minecart_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> BOAT_MOLD = registerItem("boat_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> HEAD_MOLD = registerItem("head_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> HELMET_MOLD = registerItem("helmet_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CHESTPLATE_MOLD = registerItem("chestplate_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> LEGGING_MOLD = registerItem("legging_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> BOOT_MOLD = registerItem("boot_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> ELYTRA_MOLD = registerItem("elytra_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> HORSE_ARMOR_MOLD = registerItem("horse_armor_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> WOLF_ARMOR_MOLD = registerItem("wolf_armor_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SWORD_MOLD = registerItem("sword_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> PICKAXE_MOLD = registerItem("pickaxe_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> AXE_MOLD = registerItem("axe_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SHOVEL_MOLD = registerItem("shovel_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> HOE_MOLD = registerItem("hoe_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> BOW_MOLD = registerItem("bow_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CROSSBOW_MOLD = registerItem("crossbow_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> FISHING_ROD_MOLD = registerItem("fishing_rod_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> TRIDENT_MOLD = registerItem("trident_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> HAMMER_MOLD = registerItem("hammer_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SHEAR_MOLD = registerItem("shear_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> BUCKET_MOLD = registerItem("bucket_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> ARROW_MOLD = registerItem("arrow_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> BANNER_PATTERN_MOLD = registerItem("banner_pattern_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> POTTERY_SHERD_MOLD = registerItem("pottery_sherd_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> TEMPLATE_MOLD = registerItem("template_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> KEY_MOLD = registerItem("key_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> HORN_MOLD = registerItem("horn_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> DISC_MOLD = registerItem("disc_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CRYSTAL_MOLD = registerItem("crystal_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SHARD_MOLD = registerItem("shard_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CLUMP_MOLD = registerItem("clump_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CIRCUIT_MOLD = registerItem("circuit_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CABLE_MOLD = registerItem("cable_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> INSTALLER_MOLD = registerItem("installer_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> UPGRADE_MOLD = registerItem("upgrade_mold",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> ENLIGHTENED_ASTRAL_PRESS = registerItem("enlightened_astral_press",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SAKURA_MEMORIAL_PRESS = registerItem("sakura_memorial_press",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> COSMILITE_PRESS = registerItem("cosmilite_press",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> ASTRAL_DUST = registerItem("astral_dust",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SAKURA_DUST = registerItem("sakura_dust",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SAKURA_CRYSTAL_DUST = registerItem("sakura_crystal_dust",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SAKURA_PEARL_DUST = registerItem("sakura_pearl_dust",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SAKURA_MEMORIAL_DUST = registerItem("sakura_memorial_dust",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> NETHER_STAR_DUST = registerItem("nether_star_dust",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> ASTRAL_NUGGET = registerItem("astral_nugget",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SAKURA_NUGGET = registerItem("sakura_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAKURA_MEMORIAL_NUGGET = registerItem("sakura_memorial_nugget",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> ASTRAL_INGOT = registerItem("astral_ingot",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> ENLIGHTENED_ASTRAL_INGOT = registerItem("enlightened_astral_ingot",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SAKURA_INGOT = registerItem("sakura_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> GALVANIZED_SAKURA_INGOT = registerItem("galvanized_sakura_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SAKURA_CRYSTAL = registerItem("sakura_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> GALVANIZED_SAKURA_CRYSTAL = registerItem("galvanized_sakura_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SAKURA_PEARL = registerItem("sakura_pearl",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> GALVANIZED_SAKURA_PEARL = registerItem("galvanized_sakura_pearl",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SAKURA_MEMORIAL_ALLOY = registerItem("sakura_memorial_alloy",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> PRINTED_SAKURA_MEMORIAL_CIRCUIT = registerItem("printed_sakura_memorial_circuit",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> PRINTED_ENLIGHTENED_ASTRAL_CIRCUIT = registerItem("printed_enlightened_astral_circuit",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SAKURA_MEMORIAL_PROCESSOR = registerItem("sakura_memorial_processor",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SAKURA_DYE = registerItem("sakura_dye",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));

    private static <T extends Item> DeferredItem<T> registerItem(String name, Supplier<T> sup) {
        DeferredItem<T> toReturn = ITEMS.register(name, sup);
        ALL_ITEMS.add(toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
