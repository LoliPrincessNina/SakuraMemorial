package com.loliprincessnina.sakuramemorial.datagen;

import com.loliprincessnina.sakuramemorial.SakuraMemorial;
import com.loliprincessnina.sakuramemorial.block.ModBlocks;
import com.loliprincessnina.sakuramemorial.item.ModItems;
import com.loliprincessnina.sakuramemorial.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> lookupProvider,
                               CompletableFuture<TagsProvider.TagLookup<Block>> blockTagsProvider,
                               ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, SakuraMemorial.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(Tags.Items.STORAGE_BLOCKS)
                .add(ModBlocks.ASTRAL_BLOCK.asItem())
                .add(ModBlocks.SAKURA_BLOCK.asItem())
                .add(ModBlocks.SAKURA_CRYSTAL_BLOCK.asItem())
                .add(ModBlocks.SAKURA_PEARL_BLOCK.asItem())
                .add(ModBlocks.SAKURA_MEMORIAL_BLOCK.asItem());
        tag(ModTags.Items.STORAGE_BLOCKS_ASTRAL)
                .add(ModBlocks.ASTRAL_BLOCK.asItem());
        tag(ModTags.Items.STORAGE_BLOCKS_SAKURA)
                .add(ModBlocks.SAKURA_BLOCK.asItem());
        tag(ModTags.Items.STORAGE_BLOCKS_SAKURA_CRYSTAL)
                .add(ModBlocks.SAKURA_CRYSTAL_BLOCK.asItem());
        tag(ModTags.Items.STORAGE_BLOCKS_SAKURA_PEARL)
                .add(ModBlocks.SAKURA_PEARL_BLOCK.asItem());
        tag(ModTags.Items.STORAGE_BLOCKS_SAKURA_MEMORIAL)
                .add(ModBlocks.SAKURA_MEMORIAL_BLOCK.asItem());

        tag(Tags.Items.GLASS_BLOCKS)
                .add(ModBlocks.SAKURA_RIURI.asItem());
        tag(ModTags.Items.GLASS_BLOCKS_SAKURA)
                .add(ModBlocks.SAKURA_RIURI.asItem());

        tag(ModTags.Items.MOLDS)
                .add(ModItems.NUGGET_MOLD.get())
                .add(ModItems.INGOT_MOLD.get())
                .add(ModItems.GEM_MOLD.get())
                .add(ModItems.BLOCK_MOLD.get())
                .add(ModItems.ROD_MOLD.get())
                .add(ModItems.PLATE_MOLD.get())
                .add(ModItems.GEAR_MOLD.get())
                .add(ModItems.WIRE_MOLD.get())
                .add(ModItems.BALL_MOLD.get())
                .add(ModItems.COIN_MOLD.get())
                .add(ModItems.UNPACKING_MOLD.get())
                .add(ModItems.PACKING_MOLD_2X2.get())
                .add(ModItems.PACKING_MOLD_3X3.get())
                .add(ModItems.STAIR_MOLD.get())
                .add(ModItems.SLAB_MOLD.get())
                .add(ModItems.FENCE_MOLD.get())
                .add(ModItems.FENCE_GATE_MOLD.get())
                .add(ModItems.DOOR_MOLD.get())
                .add(ModItems.TRAPDOOR_MOLD.get())
                .add(ModItems.PRESSURE_PLATE_MOLD.get())
                .add(ModItems.BUTTON_MOLD.get())
                .add(ModItems.WALL_MOLD.get())
                .add(ModItems.CARPET_MOLD.get())
                .add(ModItems.PANE_MOLD.get())
                .add(ModItems.LADDER_MOLD.get())
                .add(ModItems.RAIL_MOLD.get())
                .add(ModItems.CHAIN_MOLD.get())
                .add(ModItems.LEATHER_MOLD.get())
                .add(ModItems.DROPLET_MOLD.get())
                .add(ModItems.CRAFTING_TABLE_MOLD.get())
                .add(ModItems.FURNACE_MOLD.get())
                .add(ModItems.ANVIL_MOLD.get())
                .add(ModItems.COMPOSTER_MOLD.get())
                .add(ModItems.CAULDRON_MOLD.get())
                .add(ModItems.SIGN_MOLD.get())
                .add(ModItems.CHEST_MOLD.get())
                .add(ModItems.BARREL_MOLD.get())
                .add(ModItems.CORAL_MOLD.get())
                .add(ModItems.CORAL_FAN_MOLD.get())
                .add(ModItems.MINECART_MOLD.get())
                .add(ModItems.BOAT_MOLD.get())
                .add(ModItems.HEAD_MOLD.get())
                .add(ModItems.HELMET_MOLD.get())
                .add(ModItems.CHESTPLATE_MOLD.get())
                .add(ModItems.LEGGING_MOLD.get())
                .add(ModItems.BOOT_MOLD.get())
                .add(ModItems.ELYTRA_MOLD.get())
                .add(ModItems.HORSE_ARMOR_MOLD.get())
                .add(ModItems.WOLF_ARMOR_MOLD.get())
                .add(ModItems.SWORD_MOLD.get())
                .add(ModItems.PICKAXE_MOLD.get())
                .add(ModItems.AXE_MOLD.get())
                .add(ModItems.SHOVEL_MOLD.get())
                .add(ModItems.HOE_MOLD.get())
                .add(ModItems.BOW_MOLD.get())
                .add(ModItems.CROSSBOW_MOLD.get())
                .add(ModItems.FISHING_ROD_MOLD.get())
                .add(ModItems.TRIDENT_MOLD.get())
                .add(ModItems.HAMMER_MOLD.get())
                .add(ModItems.SHEAR_MOLD.get())
                .add(ModItems.BUCKET_MOLD.get())
                .add(ModItems.ARROW_MOLD.get())
                .add(ModItems.BANNER_PATTERN_MOLD.get())
                .add(ModItems.POTTERY_SHERD_MOLD.get())
                .add(ModItems.TEMPLATE_MOLD.get())
                .add(ModItems.KEY_MOLD.get())
                .add(ModItems.HORN_MOLD.get())
                .add(ModItems.DISC_MOLD.get())
                .add(ModItems.CRYSTAL_MOLD.get())
                .add(ModItems.SHARD_MOLD.get())
                .add(ModItems.CLUMP_MOLD.get())
                .add(ModItems.CIRCUIT_MOLD.get())
                .add(ModItems.CABLE_MOLD.get())
                .add(ModItems.INSTALLER_MOLD.get())
                .add(ModItems.UPGRADE_MOLD.get());
        tag(ModTags.Items.PRESSES)
                .add(ModItems.ENLIGHTENED_ASTRAL_PRESS.get())
                .add(ModItems.SAKURA_MEMORIAL_PRESS.get())
                .add(ModItems.COSMILITE_PRESS.get());

        tag(Tags.Items.DUSTS)
                .add(ModItems.ASTRAL_DUST.get())
                .add(ModItems.SAKURA_DUST.get())
                .add(ModItems.SAKURA_CRYSTAL_DUST.get())
                .add(ModItems.SAKURA_PEARL_DUST.get())
                .add(ModItems.SAKURA_MEMORIAL_DUST.get())
                .add(ModItems.NETHER_STAR_DUST.get());
        tag(ModTags.Items.DUSTS_ASTRAL)
                .add(ModItems.ASTRAL_DUST.get());
        tag(ModTags.Items.DUSTS_SAKURA)
                .add(ModItems.SAKURA_DUST.get());
        tag(ModTags.Items.DUSTS_SAKURA_CRYSTAL)
                .add(ModItems.SAKURA_CRYSTAL_DUST.get());
        tag(ModTags.Items.DUSTS_SAKURA_PEARL)
                .add(ModItems.SAKURA_PEARL_DUST.get());
        tag(ModTags.Items.DUSTS_SAKURA_MEMORIAL)
                .add(ModItems.SAKURA_MEMORIAL_DUST.get());
        tag(ModTags.Items.DUSTS_NETHER_STAR)
                .add(ModItems.NETHER_STAR_DUST.get());

        tag(Tags.Items.NUGGETS)
                .add(ModItems.ASTRAL_NUGGET.get())
                .add(ModItems.SAKURA_NUGGET.get())
                .add(ModItems.SAKURA_MEMORIAL_NUGGET.get());
        tag(ModTags.Items.NUGGETS_ASTRAL)
                .add(ModItems.ASTRAL_NUGGET.get());
        tag(ModTags.Items.NUGGETS_SAKURA)
                .add(ModItems.SAKURA_NUGGET.get());
        tag(ModTags.Items.NUGGETS_SAKURA_MEMORIAL)
                .add(ModItems.SAKURA_MEMORIAL_NUGGET.get());

        tag(Tags.Items.INGOTS)
                .add(ModItems.ASTRAL_INGOT.get())
                .add(ModItems.ENLIGHTENED_ASTRAL_INGOT.get())
                .add(ModItems.SAKURA_INGOT.get())
                .add(ModItems.GALVANIZED_SAKURA_INGOT.get())
                .add(ModItems.SAKURA_MEMORIAL_ALLOY.get());
        tag(ModTags.Items.INGOTS_ASTRAL)
                .add(ModItems.ASTRAL_INGOT.get())
                .add(ModItems.ENLIGHTENED_ASTRAL_INGOT.get());
        tag(ModTags.Items.INGOTS_ENLIGHTENED_ASTRAL)
                .add(ModItems.ENLIGHTENED_ASTRAL_INGOT.get());
        tag(ModTags.Items.INGOTS_SAKURA)
                .add(ModItems.SAKURA_INGOT.get())
                .add(ModItems.GALVANIZED_SAKURA_INGOT.get());
        tag(ModTags.Items.INGOTS_GALVANIZED_SAKURA)
                .add(ModItems.GALVANIZED_SAKURA_INGOT.get());
        tag(ModTags.Items.INGOTS_SAKURA_MEMORIAL)
                .add(ModItems.SAKURA_MEMORIAL_ALLOY.get());

        tag(Tags.Items.GEMS)
                .add(ModItems.SAKURA_CRYSTAL.get())
                .add(ModItems.GALVANIZED_SAKURA_CRYSTAL.get())
                .add(ModItems.SAKURA_PEARL.get())
                .add(ModItems.GALVANIZED_SAKURA_PEARL.get());
        tag(ModTags.Items.GEMS_SAKURA_CRYSTAL)
                .add(ModItems.SAKURA_CRYSTAL.get())
                .add(ModItems.GALVANIZED_SAKURA_CRYSTAL.get());
        tag(ModTags.Items.GEMS_GALVANIZED_SAKURA_CRYSTAL)
                .add(ModItems.GALVANIZED_SAKURA_CRYSTAL.get());
        tag(ModTags.Items.GEMS_SAKURA_PEARL)
                .add(ModItems.SAKURA_PEARL.get())
                .add(ModItems.GALVANIZED_SAKURA_PEARL.get());
        tag(ModTags.Items.GEMS_GALVANIZED_SAKURA_PEARL)
                .add(ModItems.GALVANIZED_SAKURA_PEARL.get());

        tag(ModTags.Items.CIRCUITS)
                .add(ModItems.PRINTED_ENLIGHTENED_ASTRAL_CIRCUIT.get())
                .add(ModItems.PRINTED_SAKURA_MEMORIAL_CIRCUIT.get());
        tag(ModTags.Items.CIRCUITS_ENLIGHTENED_ASTRAL)
                .add(ModItems.PRINTED_ENLIGHTENED_ASTRAL_CIRCUIT.get());
        tag(ModTags.Items.CIRCUITS_SAKURA_MEMORIAL)
                .add(ModItems.PRINTED_SAKURA_MEMORIAL_CIRCUIT.get());
        tag(ModTags.Items.PROCESSORS)
                .add(ModItems.SAKURA_MEMORIAL_PROCESSOR.get());
        tag(ModTags.Items.PROCESSORS_SAKURA_MEMORIAL)
                .add(ModItems.SAKURA_MEMORIAL_PROCESSOR.get());
        tag(Tags.Items.DYES)
                .add(ModItems.SAKURA_DYE.get());
        tag(ModTags.Items.DYES_SAKURA)
                .add(ModItems.SAKURA_DYE.get());
    }
}