package com.loliprincessnina.sakuramemorial.item;

import com.loliprincessnina.sakuramemorial.SakuraMemorial;
import com.loliprincessnina.sakuramemorial.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SakuraMemorial.MOD_ID);

    public static final Supplier<CreativeModeTab> SAKURA_MEMORIAL_ITEMS_TAB = CREATIVE_MODE_TAB.register("sakura_memorial_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAKURA_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.sakuramemorial.items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (DeferredBlock<? extends Block> block : ModBlocks.ALL_BLOCKS) {
                            output.accept(block);
                        }
                        for (DeferredItem<? extends Item> item : ModItems.ALL_ITEMS) {
                            output.accept(item);
                        }
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
