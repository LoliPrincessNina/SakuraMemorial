package com.loliprincessnina.sakuramemorial.datagen;

import com.loliprincessnina.sakuramemorial.SakuraMemorial;
import com.loliprincessnina.sakuramemorial.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SakuraMemorial.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        ModItems.ALL_ITEMS.forEach(item -> {
//            String path = item.getId().getPath();
//
//            // 方法1：使用 item/generated 需要纹理存在
//            // withExistingParent(path, "item/generated")
//            //         .texture("layer0", "item/" + path);
//
//            // 方法2：使用内置的 item/handheld 作为占位（不需要额外纹理）
//            // withExistingParent(path, "item/handheld");
//
//            // 方法3：使用 Minecraft 自带的纹理作为占位
//            withExistingParent(path, "item/generated")
//                    .texture("layer0", "minecraft:item/paper");
//        });

        // Mold/Press => 使用白色染色玻璃片
        moldModel(ModItems.NUGGET_MOLD.getId().getPath());
        moldModel(ModItems.INGOT_MOLD.getId().getPath());
        moldModel(ModItems.GEM_MOLD.getId().getPath());
        moldModel(ModItems.BLOCK_MOLD.getId().getPath());
        moldModel(ModItems.ROD_MOLD.getId().getPath());
        moldModel(ModItems.PLATE_MOLD.getId().getPath());
        moldModel(ModItems.GEAR_MOLD.getId().getPath());
        moldModel(ModItems.WIRE_MOLD.getId().getPath());
        moldModel(ModItems.BALL_MOLD.getId().getPath());
        moldModel(ModItems.COIN_MOLD.getId().getPath());
        moldModel(ModItems.UNPACKING_MOLD.getId().getPath());
        moldModel(ModItems.PACKING_MOLD_2X2.getId().getPath());
        moldModel(ModItems.PACKING_MOLD_3X3.getId().getPath());
        moldModel(ModItems.STAIR_MOLD.getId().getPath());
        moldModel(ModItems.SLAB_MOLD.getId().getPath());
        moldModel(ModItems.FENCE_MOLD.getId().getPath());
        moldModel(ModItems.FENCE_GATE_MOLD.getId().getPath());
        moldModel(ModItems.DOOR_MOLD.getId().getPath());
        moldModel(ModItems.TRAPDOOR_MOLD.getId().getPath());
        moldModel(ModItems.PRESSURE_PLATE_MOLD.getId().getPath());
        moldModel(ModItems.BUTTON_MOLD.getId().getPath());
        moldModel(ModItems.WALL_MOLD.getId().getPath());
        moldModel(ModItems.CARPET_MOLD.getId().getPath());
        moldModel(ModItems.PANE_MOLD.getId().getPath());
        moldModel(ModItems.LADDER_MOLD.getId().getPath());
        moldModel(ModItems.RAIL_MOLD.getId().getPath());
        moldModel(ModItems.CHAIN_MOLD.getId().getPath());
        moldModel(ModItems.LEATHER_MOLD.getId().getPath());
        moldModel(ModItems.DROPLET_MOLD.getId().getPath());
        moldModel(ModItems.CRAFTING_TABLE_MOLD.getId().getPath());
        moldModel(ModItems.FURNACE_MOLD.getId().getPath());
        moldModel(ModItems.ANVIL_MOLD.getId().getPath());
        moldModel(ModItems.COMPOSTER_MOLD.getId().getPath());
        moldModel(ModItems.CAULDRON_MOLD.getId().getPath());
        moldModel(ModItems.SIGN_MOLD.getId().getPath());
        moldModel(ModItems.CHEST_MOLD.getId().getPath());
        moldModel(ModItems.BARREL_MOLD.getId().getPath());
        moldModel(ModItems.CORAL_MOLD.getId().getPath());
        moldModel(ModItems.CORAL_FAN_MOLD.getId().getPath());
        moldModel(ModItems.MINECART_MOLD.getId().getPath());
        moldModel(ModItems.BOAT_MOLD.getId().getPath());
        moldModel(ModItems.HEAD_MOLD.getId().getPath());
        moldModel(ModItems.HELMET_MOLD.getId().getPath());
        moldModel(ModItems.CHESTPLATE_MOLD.getId().getPath());
        moldModel(ModItems.LEGGING_MOLD.getId().getPath());
        moldModel(ModItems.BOOT_MOLD.getId().getPath());
        moldModel(ModItems.ELYTRA_MOLD.getId().getPath());
        moldModel(ModItems.HORSE_ARMOR_MOLD.getId().getPath());
        moldModel(ModItems.WOLF_ARMOR_MOLD.getId().getPath());
        moldModel(ModItems.SWORD_MOLD.getId().getPath());
        moldModel(ModItems.PICKAXE_MOLD.getId().getPath());
        moldModel(ModItems.AXE_MOLD.getId().getPath());
        moldModel(ModItems.SHOVEL_MOLD.getId().getPath());
        moldModel(ModItems.HOE_MOLD.getId().getPath());
        moldModel(ModItems.BOW_MOLD.getId().getPath());
        moldModel(ModItems.CROSSBOW_MOLD.getId().getPath());
        moldModel(ModItems.FISHING_ROD_MOLD.getId().getPath());
        moldModel(ModItems.TRIDENT_MOLD.getId().getPath());
        moldModel(ModItems.HAMMER_MOLD.getId().getPath());
        moldModel(ModItems.SHEAR_MOLD.getId().getPath());
        moldModel(ModItems.BUCKET_MOLD.getId().getPath());
        moldModel(ModItems.ARROW_MOLD.getId().getPath());
        moldModel(ModItems.BANNER_PATTERN_MOLD.getId().getPath());
        moldModel(ModItems.POTTERY_SHERD_MOLD.getId().getPath());
        moldModel(ModItems.TEMPLATE_MOLD.getId().getPath());
        moldModel(ModItems.KEY_MOLD.getId().getPath());
        moldModel(ModItems.HORN_MOLD.getId().getPath());
        moldModel(ModItems.DISC_MOLD.getId().getPath());
        moldModel(ModItems.CRYSTAL_MOLD.getId().getPath());
        moldModel(ModItems.SHARD_MOLD.getId().getPath());
        moldModel(ModItems.CLUMP_MOLD.getId().getPath());
        moldModel(ModItems.CIRCUIT_MOLD.getId().getPath());
        moldModel(ModItems.CABLE_MOLD.getId().getPath());
        moldModel(ModItems.INSTALLER_MOLD.getId().getPath());
        moldModel(ModItems.UPGRADE_MOLD.getId().getPath());
        moldModel(ModItems.ENLIGHTENED_ASTRAL_PRESS.getId().getPath());
        moldModel(ModItems.SAKURA_MEMORIAL_PRESS.getId().getPath());
        moldModel(ModItems.COSMILITE_PRESS.getId().getPath());

        // INGOT/ALLOY => 鐵錠
        ingotModel(ModItems.ASTRAL_INGOT.getId().getPath());
        ingotModel(ModItems.ENLIGHTENED_ASTRAL_INGOT.getId().getPath());
        ingotModel(ModItems.SAKURA_INGOT.getId().getPath());
        ingotModel(ModItems.GALVANIZED_SAKURA_INGOT.getId().getPath());
        ingotModel(ModItems.SAKURA_MEMORIAL_ALLOY.getId().getPath());

        // PEARL => 末影珍珠
        pearlModel(ModItems.SAKURA_PEARL.getId().getPath());
        pearlModel(ModItems.GALVANIZED_SAKURA_PEARL.getId().getPath());

        // CRYSTAL => 石英
        crystalModel(ModItems.SAKURA_CRYSTAL.getId().getPath());
        crystalModel(ModItems.GALVANIZED_SAKURA_CRYSTAL.getId().getPath());

        // 粉塵 => 糖
        dustModel(ModItems.ASTRAL_DUST.getId().getPath());
        dustModel(ModItems.SAKURA_DUST.getId().getPath());
        dustModel(ModItems.SAKURA_CRYSTAL_DUST.getId().getPath());
        dustModel(ModItems.SAKURA_PEARL_DUST.getId().getPath());
        dustModel(ModItems.SAKURA_MEMORIAL_DUST.getId().getPath());
        dustModel(ModItems.NETHER_STAR_DUST.getId().getPath());

        // 粒 => 鐵粒
        nuggetModel(ModItems.ASTRAL_NUGGET.getId().getPath());
        nuggetModel(ModItems.SAKURA_NUGGET.getId().getPath());
        nuggetModel(ModItems.SAKURA_MEMORIAL_NUGGET.getId().getPath());

        // 輝光星宇電路:淺灰玻璃片
        withExistingParent(ModItems.PRINTED_ENLIGHTENED_ASTRAL_CIRCUIT.getId().getPath(), "item/generated")
                .texture("layer0", "minecraft:block/light_gray_stained_glass");
        // 繁櫻幻憶電路:粉色玻璃片
        withExistingParent(ModItems.PRINTED_SAKURA_MEMORIAL_CIRCUIT.getId().getPath(), "item/generated")
                .texture("layer0", "minecraft:block/pink_stained_glass");
        // 繁櫻幻憶處理器: 紙
        withExistingParent(ModItems.SAKURA_MEMORIAL_PROCESSOR.getId().getPath(), "item/generated")
                .texture("layer0", "minecraft:item/paper");
        // 繁櫻染料: 粉色染料
        withExistingParent(ModItems.SAKURA_DYE.getId().getPath(), "item/generated")
                .texture("layer0", "minecraft:item/pink_dye");
    }

    private void moldModel(String path) {
        withExistingParent(path, "item/generated")
                .texture("layer0", "minecraft:block/white_stained_glass");
    }

    private void dustModel(String path) {
        withExistingParent(path, "item/generated")
                .texture("layer0", "minecraft:item/sugar");
    }

    private void nuggetModel(String path) {
        withExistingParent(path, "item/generated")
                .texture("layer0", "minecraft:item/iron_nugget");
    }

    private void ingotModel(String path) {
        withExistingParent(path, "item/generated")
                .texture("layer0", "minecraft:item/iron_ingot");
    }

    private void crystalModel(String path) {
        withExistingParent(path, "item/generated")
                .texture("layer0", "minecraft:item/quartz");
    }

    private void pearlModel(String path) {
        withExistingParent(path, "item/generated")
                .texture("layer0", "minecraft:item/ender_pearl");
    }
}