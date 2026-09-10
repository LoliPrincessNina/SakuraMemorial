package com.loliprincessnina.sakuramemorial.datagen;

import com.loliprincessnina.sakuramemorial.block.ModBlocks;
import com.loliprincessnina.sakuramemorial.item.ModItems;
import com.loliprincessnina.sakuramemorial.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;

import java.util.concurrent.CompletableFuture;

import static com.loliprincessnina.sakuramemorial.datagen.ModRecipeHelper.*;

public class ModRecipeProvider extends RecipeProvider {

    public static final ModLoadedCondition MEK_LOADED = new ModLoadedCondition("mekanism");
    public static final ModLoadedCondition MEKMM_LOADED = new ModLoadedCondition("mekmm");

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        buildModSpecificRecipes(output);
        buildWoodRecipes(output);
    }

    private void buildModSpecificRecipes(RecipeOutput output) {
        // 繁樱水晶 ⇄ 繁樱水晶块
        packing2x2(ModBlocks.SAKURA_CRYSTAL_BLOCK.get(), ModTags.Items.GEMS_SAKURA_CRYSTAL, output);
        unpacking2x2(ModItems.SAKURA_CRYSTAL.get(), ModTags.Items.STORAGE_BLOCKS_SAKURA_CRYSTAL, output);
        // 繁樱水晶粉 ⇄ 繁樱水晶
        crushing(ModItems.SAKURA_CRYSTAL_DUST.get(), 1, ModTags.Items.GEMS_SAKURA_CRYSTAL, 1, output, MEK_LOADED);
        enriching(ModItems.SAKURA_CRYSTAL.get(), 1, ModTags.Items.DUSTS_SAKURA_CRYSTAL, 1, output, MEK_LOADED);

        // 繁樱珍珠 ⇄ 繁樱珍珠块
        packing3x3(ModBlocks.SAKURA_PEARL_BLOCK.get(), ModTags.Items.GEMS_SAKURA_PEARL, output);
        unpacking3x3(ModItems.SAKURA_PEARL.get(), ModTags.Items.STORAGE_BLOCKS_SAKURA_PEARL, output);
        // 繁樱珍珠粉 ⇄ 繁樱珍珠
        crushing(ModItems.SAKURA_PEARL_DUST.get(), 1, ModTags.Items.GEMS_SAKURA_PEARL, 1, output, MEK_LOADED);
        enriching(ModItems.SAKURA_PEARL.get(), 1, ModTags.Items.DUSTS_SAKURA_PEARL, 1, output, MEK_LOADED);

        // 星能粒 ⇄ 星能锭
        packing3x3(ModItems.ASTRAL_INGOT.get(), ModTags.Items.NUGGETS_ASTRAL, output);
        unpacking3x3(ModItems.ASTRAL_NUGGET.get(), ModTags.Items.INGOTS_ASTRAL, output);
        // 星能锭 ⇄ 星能块
        packing3x3(ModBlocks.ASTRAL_BLOCK.get(), ModTags.Items.INGOTS_ASTRAL, output);
        unpacking3x3(ModItems.ASTRAL_INGOT.get(), ModTags.Items.STORAGE_BLOCKS_ASTRAL, output);
        // 星能粉
        crushing(ModItems.ASTRAL_DUST.get(), 1, ModTags.Items.INGOTS_ASTRAL, 1, output, MEK_LOADED);

        // 繁樱粒 ⇄ 繁樱锭
        packing3x3(ModItems.SAKURA_INGOT.get(), ModTags.Items.NUGGETS_SAKURA, output);
        unpacking3x3(ModItems.SAKURA_NUGGET.get(), ModTags.Items.INGOTS_SAKURA, output);
        // 繁樱锭 ⇄ 繁樱块
        packing3x3(ModBlocks.SAKURA_BLOCK.get(), ModTags.Items.INGOTS_SAKURA, output);
        unpacking3x3(ModItems.SAKURA_INGOT.get(), ModTags.Items.STORAGE_BLOCKS_SAKURA, output);
        // 繁樱粉 ⇄ 繁樱锭
        smelting(ModItems.SAKURA_INGOT.get(), ModTags.Items.DUSTS_SAKURA, output, 0.7f, 200);
        blasting(ModItems.SAKURA_INGOT.get(), ModTags.Items.DUSTS_SAKURA, output, 0.7f, 100);
        crushing(ModItems.SAKURA_DUST.get(), 1, ModTags.Items.INGOTS_SAKURA, 1, output, MEK_LOADED);

        // 繁樱幻忆合金粒 ⇄ 繁樱幻忆合金
        packing3x3(ModItems.SAKURA_MEMORIAL_ALLOY.get(), ModTags.Items.NUGGETS_SAKURA_MEMORIAL, output);
        unpacking3x3(ModItems.SAKURA_MEMORIAL_NUGGET.get(), ModTags.Items.INGOTS_SAKURA_MEMORIAL, output);
        // 繁樱幻忆合金 ⇄ 繁樱幻忆合金块
        packing3x3(ModBlocks.SAKURA_MEMORIAL_BLOCK.get(), ModTags.Items.INGOTS_SAKURA_MEMORIAL, output);
        unpacking3x3(ModItems.SAKURA_MEMORIAL_ALLOY.get(), ModTags.Items.STORAGE_BLOCKS_SAKURA_MEMORIAL, output);
        // 繁樱幻忆合金粉 ⇄ 繁樱幻忆合金
        smelting(ModItems.SAKURA_MEMORIAL_ALLOY.get(), ModTags.Items.DUSTS_SAKURA_MEMORIAL, output, 0.7f, 200);
        blasting(ModItems.SAKURA_MEMORIAL_ALLOY.get(), ModTags.Items.DUSTS_SAKURA_MEMORIAL, output, 0.7f, 100);
        crushing(ModItems.SAKURA_MEMORIAL_DUST.get(), 1, ModTags.Items.INGOTS_SAKURA_MEMORIAL, 1, output, MEK_LOADED);
        // 合金
        alloying(
                ModItems.SAKURA_MEMORIAL_ALLOY.get(), 1,
                ModTags.Items.GEMS_GALVANIZED_SAKURA_CRYSTAL, 4,
                ModTags.Items.INGOTS_GALVANIZED_SAKURA, 4,
                ModTags.Items.GEMS_GALVANIZED_SAKURA_PEARL, 4,
                "ingot", output, MEKMM_LOADED
        );

        // 下界之星粉 ⇄ 下界之星
        crushing(ModItems.NETHER_STAR_DUST.get(), 1, Tags.Items.NETHER_STARS, 1, output, MEK_LOADED);
        enriching(Items.NETHER_STAR, 1, ModTags.Items.DUSTS_NETHER_STAR, 1, output, MEK_LOADED);
    }

    private void buildWoodRecipes(RecipeOutput output) {
        // 橡木
        woodSet(
                Items.OAK_LOG, Items.STRIPPED_OAK_LOG,
                Items.OAK_WOOD, Items.STRIPPED_OAK_WOOD,
                Items.OAK_PLANKS,
                Items.OAK_STAIRS, Items.OAK_SLAB,
                Items.OAK_DOOR, Items.OAK_TRAPDOOR,
                Items.OAK_PRESSURE_PLATE, Items.OAK_BOAT,
                output, MEK_LOADED
        );

        // 杉木
        woodSet(
                Items.SPRUCE_LOG, Items.STRIPPED_SPRUCE_LOG,
                Items.SPRUCE_WOOD, Items.STRIPPED_SPRUCE_WOOD,
                Items.SPRUCE_PLANKS,
                Items.SPRUCE_STAIRS, Items.SPRUCE_SLAB,
                Items.SPRUCE_DOOR, Items.SPRUCE_TRAPDOOR,
                Items.SPRUCE_PRESSURE_PLATE, Items.SPRUCE_BOAT,
                output, MEK_LOADED
        );

        // 樺木
        woodSet(
                Items.BIRCH_LOG, Items.STRIPPED_BIRCH_LOG,
                Items.BIRCH_WOOD, Items.STRIPPED_BIRCH_WOOD,
                Items.BIRCH_PLANKS,
                Items.BIRCH_STAIRS, Items.BIRCH_SLAB,
                Items.BIRCH_DOOR, Items.BIRCH_TRAPDOOR,
                Items.BIRCH_PRESSURE_PLATE, Items.BIRCH_BOAT,
                output, MEK_LOADED
        );

        // 叢林木
        woodSet(
                Items.JUNGLE_LOG, Items.STRIPPED_JUNGLE_LOG,
                Items.JUNGLE_WOOD, Items.STRIPPED_JUNGLE_WOOD,
                Items.JUNGLE_PLANKS,
                Items.JUNGLE_STAIRS, Items.JUNGLE_SLAB,
                Items.JUNGLE_DOOR, Items.JUNGLE_TRAPDOOR,
                Items.JUNGLE_PRESSURE_PLATE, Items.JUNGLE_BOAT,
                output, MEK_LOADED
        );

        // 金合歡木
        woodSet(
                Items.ACACIA_LOG, Items.STRIPPED_ACACIA_LOG,
                Items.ACACIA_WOOD, Items.STRIPPED_ACACIA_WOOD,
                Items.ACACIA_PLANKS,
                Items.ACACIA_STAIRS, Items.ACACIA_SLAB,
                Items.ACACIA_DOOR, Items.ACACIA_TRAPDOOR,
                Items.ACACIA_PRESSURE_PLATE, Items.ACACIA_BOAT,
                output, MEK_LOADED
        );

        // 黑橡木
        woodSet(
                Items.DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_LOG,
                Items.DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_WOOD,
                Items.DARK_OAK_PLANKS,
                Items.DARK_OAK_STAIRS, Items.DARK_OAK_SLAB,
                Items.DARK_OAK_DOOR, Items.DARK_OAK_TRAPDOOR,
                Items.DARK_OAK_PRESSURE_PLATE, Items.DARK_OAK_BOAT,
                output, MEK_LOADED
        );

        // 紅樹林木
        woodSet(
                Items.MANGROVE_LOG, Items.STRIPPED_MANGROVE_LOG,
                Items.MANGROVE_WOOD, Items.STRIPPED_MANGROVE_WOOD,
                Items.MANGROVE_PLANKS,
                Items.MANGROVE_STAIRS, Items.MANGROVE_SLAB,
                Items.MANGROVE_DOOR, Items.MANGROVE_TRAPDOOR,
                Items.MANGROVE_PRESSURE_PLATE, Items.MANGROVE_BOAT,
                output, MEK_LOADED
        );

        // 櫻花木
        woodSet(
                Items.CHERRY_LOG, Items.STRIPPED_CHERRY_LOG,
                Items.CHERRY_WOOD, Items.STRIPPED_CHERRY_WOOD,
                Items.CHERRY_PLANKS,
                Items.CHERRY_STAIRS, Items.CHERRY_SLAB,
                Items.CHERRY_DOOR, Items.CHERRY_TRAPDOOR,
                Items.CHERRY_PRESSURE_PLATE, Items.CHERRY_BOAT,
                output, MEK_LOADED
        );

        // 竹
//        woodSet(
//                Items.BAMBOO_BLOCK, Items.STRIPPED_BAMBOO_BLOCK,
//                Items.BAMBOO_BLOCK, Items.STRIPPED_BAMBOO_BLOCK,
//                Items.BAMBOO_PLANKS,
//                Items.BAMBOO_STAIRS, Items.BAMBOO_SLAB,
//                Items.BAMBOO_DOOR, Items.BAMBOO_TRAPDOOR,
//                Items.BAMBOO_PRESSURE_PLATE, Items.BAMBOO_RAFT,
//                output, MEK_LOADED
//        );

        // 緋紅菌 (沒有船)
        woodSet(
                Items.CRIMSON_STEM, Items.STRIPPED_CRIMSON_STEM,
                Items.CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_HYPHAE,
                Items.CRIMSON_PLANKS,
                Items.CRIMSON_STAIRS, Items.CRIMSON_SLAB,
                Items.CRIMSON_DOOR, Items.CRIMSON_TRAPDOOR,
                Items.CRIMSON_PRESSURE_PLATE, null,
                output, MEK_LOADED
        );

        // 扭曲菌 (沒有船)
        woodSet(
                Items.WARPED_STEM, Items.STRIPPED_WARPED_STEM,
                Items.WARPED_HYPHAE, Items.STRIPPED_WARPED_HYPHAE,
                Items.WARPED_PLANKS,
                Items.WARPED_STAIRS, Items.WARPED_SLAB,
                Items.WARPED_DOOR, Items.WARPED_TRAPDOOR,
                Items.WARPED_PRESSURE_PLATE, null,
                output, MEK_LOADED
        );
    }
}