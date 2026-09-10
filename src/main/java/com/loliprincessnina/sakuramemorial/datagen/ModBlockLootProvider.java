package com.loliprincessnina.sakuramemorial.datagen;

import com.loliprincessnina.sakuramemorial.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.Set;
import java.util.stream.Collectors;

public class ModBlockLootProvider extends BlockLootSubProvider {

    public ModBlockLootProvider(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
    }

    @Override
    protected void generate() {
        ModBlocks.ALL_BLOCKS.forEach(block -> {
            if (!isGlassBlocks(block.get())) {
                dropSelf(block.get());
            } else {
                dropWhenSilkTouch(block.get());
            }
        });
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.ALL_BLOCKS.stream()
                .map(DeferredBlock::get)
                .collect(Collectors.toList());
    }

    private static boolean isGlassBlocks(Block block) {
        return block == ModBlocks.SAKURA_RIURI.get();
    }
}