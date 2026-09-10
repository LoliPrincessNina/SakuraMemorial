package com.loliprincessnina.sakuramemorial.datagen;

import com.loliprincessnina.sakuramemorial.SakuraMemorial;
import com.loliprincessnina.sakuramemorial.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SakuraMemorial.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        ModBlocks.ALL_BLOCKS.forEach(block -> {
//            String path = block.getId().getPath();
//
//            // 使用模组自己的纹理（如果存在的话会自动用，不存在会报错
//            // 作為保留注釋，等待未來有材質時使用
//            // simpleBlock(block.get(),
//            //     models().cubeAll(path, modLoc("block/" + path))
//            // );
//
//            // 使用原版石头纹理作为占位
//            // 作為保留注釋，報錯時使用
//            // simpleBlockWithItem(block.get(),
//            //         models().cubeAll(path, ResourceLocation.withDefaultNamespace("block/stone"))
//            // );
//
//            // 星宇塊: 鐵塊改顏色 淺灰
//            // 繁櫻塊: 鐵塊改顏色 #ffffd9e7
//            // 繁櫻水晶塊: 石英塊改顏色 #ffffd9e7
//            // 繁櫻珍珠塊: 細雪改顏色 #ffffd9e7
//            // 繁櫻幻憶合金: 珠光蛙明灯改顏色 #ffffd9e7
//            // 繁櫻琉璃: 普通玻璃改顏色 #55ffd9e7
//        });

        simpleBlockWithItem(
                ModBlocks.ASTRAL_BLOCK.get(), models().cubeAll(
                        ModBlocks.ASTRAL_BLOCK.getId().getPath(),
                        ResourceLocation.withDefaultNamespace("block/quartz_block_bottom"))
        );
        simpleBlockWithItem(
                ModBlocks.SAKURA_BLOCK.get(), models().cubeAll(
                        ModBlocks.SAKURA_BLOCK.getId().getPath(),
                        ResourceLocation.withDefaultNamespace("block/stripped_cherry_log"))
        );
        simpleBlockWithItem(
                ModBlocks.SAKURA_CRYSTAL_BLOCK.get(), models().cubeAll(
                        ModBlocks.SAKURA_CRYSTAL_BLOCK.getId().getPath(),
                        ResourceLocation.withDefaultNamespace("block/pink_concrete_powder"))
        );
        simpleBlockWithItem(
                ModBlocks.SAKURA_PEARL_BLOCK.get(), models().cubeAll(
                        ModBlocks.SAKURA_PEARL_BLOCK.getId().getPath(),
                        ResourceLocation.withDefaultNamespace("block/pearlescent_froglight_top"))
        );
        simpleBlockWithItem(
                ModBlocks.SAKURA_MEMORIAL_BLOCK.get(), models().cubeAll(
                        ModBlocks.SAKURA_MEMORIAL_BLOCK.getId().getPath(),
                        ResourceLocation.withDefaultNamespace("block/pink_glazed_terracotta"))
        );
        simpleBlockWithItem(
                ModBlocks.SAKURA_RIURI.get(), models().cubeAll(
                        ModBlocks.SAKURA_RIURI.getId().getPath(),
                        ResourceLocation.withDefaultNamespace("block/pink_stained_glass")).renderType("translucent")
        );
    }
}