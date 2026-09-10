package com.loliprincessnina.sakuramemorial.util;

import com.loliprincessnina.sakuramemorial.SakuraMemorial;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
        private static TagKey<Block> tag(String namespace, String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(namespace, path));
        }

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> STORAGE_BLOCKS_ASTRAL = tag("c", "storage_blocks/astral");
        public static final TagKey<Item> STORAGE_BLOCKS_SAKURA = tag("c", "storage_blocks/sakura");
        public static final TagKey<Item> STORAGE_BLOCKS_SAKURA_CRYSTAL = tag("c", "storage_blocks/sakura_crystal");
        public static final TagKey<Item> STORAGE_BLOCKS_SAKURA_PEARL = tag("c", "storage_blocks/sakura_pearl");
        public static final TagKey<Item> STORAGE_BLOCKS_SAKURA_MEMORIAL = tag("c", "storage_blocks/sakura_memorial");
        public static final TagKey<Item> GLASS_BLOCKS_SAKURA = tag("c", "glass_blocks/sakura");

        public static final TagKey<Item> MOLDS = tag("c", "molds");
        public static final TagKey<Item> PRESSES = tag("c", "presses");

        public static final TagKey<Item> DUSTS_ASTRAL = tag("c", "dusts/astral");
        public static final TagKey<Item> DUSTS_SAKURA = tag("c", "dusts/sakura");
        public static final TagKey<Item> DUSTS_SAKURA_CRYSTAL = tag("c", "dusts/sakura_crystal");
        public static final TagKey<Item> DUSTS_SAKURA_PEARL = tag("c", "dusts/sakura_pearl");
        public static final TagKey<Item> DUSTS_SAKURA_MEMORIAL = tag("c", "dusts/sakura_memorial");
        public static final TagKey<Item> DUSTS_NETHER_STAR = tag("c", "dusts/nether_star");

        public static final TagKey<Item> NUGGETS_ASTRAL = tag("c", "nuggets/astral");
        public static final TagKey<Item> NUGGETS_SAKURA = tag("c", "nuggets/sakura");
        public static final TagKey<Item> NUGGETS_SAKURA_MEMORIAL = tag("c", "nuggets/sakura_memorial");

        public static final TagKey<Item> INGOTS_ASTRAL = tag("c", "ingots/astral");
        public static final TagKey<Item> INGOTS_ENLIGHTENED_ASTRAL = tag("c", "ingots/enlightened_astral");
        public static final TagKey<Item> INGOTS_SAKURA = tag("c", "ingots/sakura");
        public static final TagKey<Item> INGOTS_GALVANIZED_SAKURA = tag("c", "ingots/galvanized_sakura");
        public static final TagKey<Item> INGOTS_SAKURA_MEMORIAL = tag("c", "ingots/sakura_memorial");

        public static final TagKey<Item> GEMS_SAKURA_CRYSTAL = tag("c", "gems/sakura_crystal");
        public static final TagKey<Item> GEMS_GALVANIZED_SAKURA_CRYSTAL = tag("c", "gems/galvanized_sakura_crystal");
        public static final TagKey<Item> GEMS_SAKURA_PEARL = tag("c", "gems/sakura_pearl");
        public static final TagKey<Item> GEMS_GALVANIZED_SAKURA_PEARL = tag("c", "gems/galvanized_sakura_pearl");

        public static final TagKey<Item> CIRCUITS = tag("c", "circuits");
        public static final TagKey<Item> CIRCUITS_ENLIGHTENED_ASTRAL = tag("c", "circuits/enlightened_astral");
        public static final TagKey<Item> CIRCUITS_SAKURA_MEMORIAL = tag("c", "circuits/sakura_memorial");
        public static final TagKey<Item> PROCESSORS = tag("c", "processors");
        public static final TagKey<Item> PROCESSORS_SAKURA_MEMORIAL = tag("c", "processors/sakura_memorial");
        public static final TagKey<Item> DYES_SAKURA = tag("c", "dyes/sakura");

        private static TagKey<Item> tag(String namespace, String path) {
            return TagKey.create(Registries.ITEM,
                    ResourceLocation.fromNamespaceAndPath(namespace, path));
        }

        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registries.ITEM,
                    ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, name));
        }
    }
}