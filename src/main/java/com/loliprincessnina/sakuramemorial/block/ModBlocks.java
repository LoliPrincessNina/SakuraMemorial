package com.loliprincessnina.sakuramemorial.block;

import com.loliprincessnina.sakuramemorial.SakuraMemorial;
import com.loliprincessnina.sakuramemorial.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SakuraMemorial.MOD_ID);
    public static final List<DeferredBlock<? extends Block>> ALL_BLOCKS = new ArrayList<>();

    public static final DeferredBlock<Block> ASTRAL_BLOCK = registerBlock("astral_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(10f, 1200f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)
                    .lightLevel(state -> 15)
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .hasPostProcess((state, getter, pos) -> true)
                    .emissiveRendering((state, getter, pos) -> true)
            ));

    public static final DeferredBlock<Block> SAKURA_BLOCK = registerBlock("sakura_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_PINK)
            ));

    public static final DeferredBlock<Block> SAKURA_CRYSTAL_BLOCK = registerBlock("sakura_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f, 4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
                    .mapColor(MapColor.COLOR_PINK)
            ));

    public static final DeferredBlock<Block> SAKURA_PEARL_BLOCK = registerBlock("sakura_pearl_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f, 4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
                    .mapColor(MapColor.COLOR_PINK)
            ));

    public static final DeferredBlock<Block> SAKURA_MEMORIAL_BLOCK = registerBlock("sakura_memorial_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(25f, 1800f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .lightLevel(state -> 15)
                    .mapColor(MapColor.COLOR_PINK)
                    .hasPostProcess((state, getter, pos) -> true)
                    .emissiveRendering((state, getter, pos) -> true)
            ));

    public static final DeferredBlock<Block> SAKURA_RIURI = registerBlock("sakura_riuri",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
                    .sound(SoundType.GLASS)
                    .mapColor(MapColor.COLOR_PINK)
                    .isValidSpawn((state, getter, pos, type) -> false)
                    .isViewBlocking((state, getter, pos) -> false)
                    .isSuffocating((state, getter, pos) -> false)
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        ALL_BLOCKS.add(toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
