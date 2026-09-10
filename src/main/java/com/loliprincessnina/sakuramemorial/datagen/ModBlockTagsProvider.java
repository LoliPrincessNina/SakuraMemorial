package com.loliprincessnina.sakuramemorial.datagen;

import com.loliprincessnina.sakuramemorial.SakuraMemorial;
import com.loliprincessnina.sakuramemorial.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output,
                                CompletableFuture<HolderLookup.Provider> lookupProvider,
                                ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SakuraMemorial.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ASTRAL_BLOCK.get())
                .add(ModBlocks.SAKURA_BLOCK.get())
                .add(ModBlocks.SAKURA_CRYSTAL_BLOCK.get())
                .add(ModBlocks.SAKURA_PEARL_BLOCK.get())
                .add(ModBlocks.SAKURA_MEMORIAL_BLOCK.get());

        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.ASTRAL_BLOCK.get())
                .add(ModBlocks.SAKURA_MEMORIAL_BLOCK.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SAKURA_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAKURA_CRYSTAL_BLOCK.get())
                .add(ModBlocks.SAKURA_PEARL_BLOCK.get());
    }
}