package com.loliprincessnina.sakuramemorial;

import com.loliprincessnina.sakuramemorial.block.ModBlocks;
import com.loliprincessnina.sakuramemorial.item.ModCreativeModeTabs;
import com.loliprincessnina.sakuramemorial.item.ModItems;
import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.event.server.ServerStoppingEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import org.slf4j.Logger;

@Mod(SakuraMemorial.MOD_ID)
public class SakuraMemorial {

    public static final String MOD_ID = "sakuramemorial";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SakuraMemorial(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("[Sakura Memorial] Hello from the other side ~");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("[Sakura Memorial] Ciallo～(∠・ω<)⌒★");
    }
    @SubscribeEvent
    public void onServerStoping(ServerStoppingEvent event) {
        LOGGER.info("[Sakura Memorial] Genshin Impact, Deactivates!");
    }

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event) {

        }
    }
}
