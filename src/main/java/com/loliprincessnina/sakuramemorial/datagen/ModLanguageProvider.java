package com.loliprincessnina.sakuramemorial.datagen;

import com.loliprincessnina.sakuramemorial.SakuraMemorial;
import com.loliprincessnina.sakuramemorial.block.ModBlocks;
import com.loliprincessnina.sakuramemorial.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.HashMap;
import java.util.Map;

public class ModLanguageProvider extends LanguageProvider {

    private final String locale;

    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, SakuraMemorial.MOD_ID, locale);
        this.locale = locale;
    }

    @Override
    protected void addTranslations() {
        if (locale.equals("zh_tw")) {
            addTraditionalChineseTranslations();
        } else if (locale.equals("zh_cn")) {
            addSimplifiedChineseTranslations();
        } else {
            addEnglishTranslations();
        }
    }

    private void addEnglishTranslations() {
        add("itemGroup.sakuramemorial", "Sakura Memorial");
        add("creativetab.sakuramemorial.items_tab", "Sakura Memorial");

        ModItems.ALL_ITEMS.forEach(item -> {
            String path = item.getId().getPath();
            add(item.get(), toDisplayName(path));
        });

        ModBlocks.ALL_BLOCKS.forEach(block -> {
            String path = block.getId().getPath();
            add(block.get(), toDisplayName(path));
        });
    }

    private void addSimplifiedChineseTranslations() {
        Map<String, String> translations = new HashMap<>();

        // 創造模式標籤
        translations.put("itemGroup.sakuramemorial", "繁樱幻忆");
        translations.put("creativetab.sakuramemorial.items_tab", "繁樱幻忆");

        // 方塊
        translations.put("block.sakuramemorial.astral_block", "星宇块");
        translations.put("block.sakuramemorial.sakura_block", "繁樱块");
        translations.put("block.sakuramemorial.sakura_crystal_block", "繁樱水晶块");
        translations.put("block.sakuramemorial.sakura_pearl_block", "繁樱珍珠块");
        translations.put("block.sakuramemorial.sakura_memorial_block", "繁樱幻忆块");
        translations.put("block.sakuramemorial.sakura_riuri", "繁樱琉璃");

        // 模具
        translations.put("item.sakuramemorial.nugget_mold", "模具：粒");
        translations.put("item.sakuramemorial.ingot_mold", "模具：锭");
        translations.put("item.sakuramemorial.gem_mold", "模具：宝石");
        translations.put("item.sakuramemorial.block_mold", "模具：方块");
        translations.put("item.sakuramemorial.rod_mold", "模具：棒");
        translations.put("item.sakuramemorial.plate_mold", "模具：板");
        translations.put("item.sakuramemorial.gear_mold", "模具：齿轮");
        translations.put("item.sakuramemorial.wire_mold", "模具：电线");
        translations.put("item.sakuramemorial.ball_mold", "模具：球");
        translations.put("item.sakuramemorial.coin_mold", "模具：硬币");
        translations.put("item.sakuramemorial.unpacking_mold", "模具：拆解");
        translations.put("item.sakuramemorial.packing_mold_2x2", "模具：打包 2x2");
        translations.put("item.sakuramemorial.packing_mold_3x3", "模具：打包 3x3");
        translations.put("item.sakuramemorial.stair_mold", "模具：楼梯");
        translations.put("item.sakuramemorial.slab_mold", "模具：台阶");
        translations.put("item.sakuramemorial.fence_mold", "模具：栅栏");
        translations.put("item.sakuramemorial.fence_gate_mold", "模具：栅栏门");
        translations.put("item.sakuramemorial.door_mold", "模具：门");
        translations.put("item.sakuramemorial.trapdoor_mold", "模具：活板门");
        translations.put("item.sakuramemorial.pressure_plate_mold", "模具：压力板");
        translations.put("item.sakuramemorial.button_mold", "模具：按钮");
        translations.put("item.sakuramemorial.wall_mold", "模具：墙");
        translations.put("item.sakuramemorial.carpet_mold", "模具：地毯");
        translations.put("item.sakuramemorial.pane_mold", "模具：玻璃板");
        translations.put("item.sakuramemorial.ladder_mold", "模具：梯子");
        translations.put("item.sakuramemorial.rail_mold", "模具：铁轨");
        translations.put("item.sakuramemorial.chain_mold", "模具：锁链");
        translations.put("item.sakuramemorial.leather_mold", "模具：皮革");
        translations.put("item.sakuramemorial.droplet_mold", "模具：液滴");
        translations.put("item.sakuramemorial.crafting_table_mold", "模具：工作台");
        translations.put("item.sakuramemorial.furnace_mold", "模具：熔炉");
        translations.put("item.sakuramemorial.anvil_mold", "模具：铁砧");
        translations.put("item.sakuramemorial.composter_mold", "模具：堆肥桶");
        translations.put("item.sakuramemorial.cauldron_mold", "模具：炼药锅");
        translations.put("item.sakuramemorial.sign_mold", "模具：告示牌");
        translations.put("item.sakuramemorial.chest_mold", "模具：箱子");
        translations.put("item.sakuramemorial.barrel_mold", "模具：木桶");
        translations.put("item.sakuramemorial.coral_mold", "模具：珊瑚");
        translations.put("item.sakuramemorial.coral_fan_mold", "模具：珊瑚扇");
        translations.put("item.sakuramemorial.minecart_mold", "模具：矿车");
        translations.put("item.sakuramemorial.boat_mold", "模具：船");
        translations.put("item.sakuramemorial.head_mold", "模具：头颅");
        translations.put("item.sakuramemorial.helmet_mold", "模具：头盔");
        translations.put("item.sakuramemorial.chestplate_mold", "模具：胸甲");
        translations.put("item.sakuramemorial.legging_mold", "模具：护腿");
        translations.put("item.sakuramemorial.boot_mold", "模具：靴子");
        translations.put("item.sakuramemorial.elytra_mold", "模具：鞘翅");
        translations.put("item.sakuramemorial.horse_armor_mold", "模具：马铠");
        translations.put("item.sakuramemorial.wolf_armor_mold", "模具：狼铠");
        translations.put("item.sakuramemorial.sword_mold", "模具：剑");
        translations.put("item.sakuramemorial.pickaxe_mold", "模具：镐");
        translations.put("item.sakuramemorial.axe_mold", "模具：斧");
        translations.put("item.sakuramemorial.shovel_mold", "模具：锹");
        translations.put("item.sakuramemorial.hoe_mold", "模具：锄");
        translations.put("item.sakuramemorial.bow_mold", "模具：弓");
        translations.put("item.sakuramemorial.crossbow_mold", "模具：弩");
        translations.put("item.sakuramemorial.fishing_rod_mold", "模具：钓鱼竿");
        translations.put("item.sakuramemorial.trident_mold", "模具：三叉戟");
        translations.put("item.sakuramemorial.hammer_mold", "模具：锤");
        translations.put("item.sakuramemorial.shear_mold", "模具：剪刀");
        translations.put("item.sakuramemorial.bucket_mold", "模具：桶");
        translations.put("item.sakuramemorial.arrow_mold", "模具：箭");
        translations.put("item.sakuramemorial.banner_pattern_mold", "模具：旗帜图案");
        translations.put("item.sakuramemorial.pottery_sherd_mold", "模具：陶片");
        translations.put("item.sakuramemorial.template_mold", "模具：模板");
        translations.put("item.sakuramemorial.key_mold", "模具：钥匙");
        translations.put("item.sakuramemorial.horn_mold", "模具：角");
        translations.put("item.sakuramemorial.disc_mold", "模具：唱片");
        translations.put("item.sakuramemorial.crystal_mold", "模具：水晶");
        translations.put("item.sakuramemorial.shard_mold", "模具：碎片");
        translations.put("item.sakuramemorial.clump_mold", "模具：团块");
        translations.put("item.sakuramemorial.circuit_mold", "模具：电路");
        translations.put("item.sakuramemorial.cable_mold", "模具：线缆");
        translations.put("item.sakuramemorial.installer_mold", "模具：安装器");
        translations.put("item.sakuramemorial.upgrade_mold", "模具：升级");

        // 壓印模板
        translations.put("item.sakuramemorial.enlightened_astral_press", "辉光星宇压印模板");
        translations.put("item.sakuramemorial.sakura_memorial_press", "繁樱幻忆压印模板");
        translations.put("item.sakuramemorial.cosmilite_press", "寰宇压印模板");

        // 粉塵
        translations.put("item.sakuramemorial.astral_dust", "星宇粉");
        translations.put("item.sakuramemorial.sakura_dust", "繁樱粉");
        translations.put("item.sakuramemorial.sakura_crystal_dust", "繁樱水晶粉");
        translations.put("item.sakuramemorial.sakura_pearl_dust", "繁樱珍珠粉");
        translations.put("item.sakuramemorial.sakura_memorial_dust", "繁樱幻忆粉");
        translations.put("item.sakuramemorial.nether_star_dust", "下界之星粉");

        // 粒
        translations.put("item.sakuramemorial.astral_nugget", "星宇粒");
        translations.put("item.sakuramemorial.sakura_nugget", "繁樱粒");
        translations.put("item.sakuramemorial.sakura_memorial_nugget", "繁樱幻忆粒");

        // 錠/合金
        translations.put("item.sakuramemorial.astral_ingot", "星宇锭");
        translations.put("item.sakuramemorial.enlightened_astral_ingot", "辉光星宇锭");
        translations.put("item.sakuramemorial.sakura_ingot", "繁樱锭");
        translations.put("item.sakuramemorial.galvanized_sakura_ingot", "凝能繁樱锭");
        translations.put("item.sakuramemorial.sakura_memorial_alloy", "繁樱幻忆合金");

        // 寶石
        translations.put("item.sakuramemorial.sakura_crystal", "繁樱水晶");
        translations.put("item.sakuramemorial.galvanized_sakura_crystal", "凝能繁樱水晶");
        translations.put("item.sakuramemorial.sakura_pearl", "繁樱珍珠");
        translations.put("item.sakuramemorial.galvanized_sakura_pearl", "凝能繁樱珍珠");

        // 電路
        translations.put("item.sakuramemorial.printed_enlightened_astral_circuit", "印刷辉光星宇电路");
        translations.put("item.sakuramemorial.printed_sakura_memorial_circuit", "印刷繁樱幻忆电路");
        translations.put("item.sakuramemorial.sakura_memorial_processor", "繁樱幻忆处理器");

        // 染料
        translations.put("item.sakuramemorial.sakura_dye", "繁樱染料");

        translations.forEach(this::add);
    }

    private void addTraditionalChineseTranslations() {
        Map<String, String> translations = new HashMap<>();

        // 創造模式標籤
        translations.put("itemGroup.sakuramemorial", "繁櫻幻憶");
        translations.put("creativetab.sakuramemorial.items_tab", "繁櫻幻憶");

        // 方塊
        translations.put("block.sakuramemorial.astral_block", "星宇方塊");
        translations.put("block.sakuramemorial.sakura_block", "繁櫻方塊");
        translations.put("block.sakuramemorial.sakura_crystal_block", "繁櫻水晶方塊");
        translations.put("block.sakuramemorial.sakura_pearl_block", "繁櫻珍珠方塊");
        translations.put("block.sakuramemorial.sakura_memorial_block", "繁櫻幻憶方塊");
        translations.put("block.sakuramemorial.sakura_riuri", "繁櫻琉璃");

        // 模具
        translations.put("item.sakuramemorial.nugget_mold", "模具：粒");
        translations.put("item.sakuramemorial.ingot_mold", "模具：錠");
        translations.put("item.sakuramemorial.gem_mold", "模具：寶石");
        translations.put("item.sakuramemorial.block_mold", "模具：方塊");
        translations.put("item.sakuramemorial.rod_mold", "模具：棒");
        translations.put("item.sakuramemorial.plate_mold", "模具：板");
        translations.put("item.sakuramemorial.gear_mold", "模具：齒輪");
        translations.put("item.sakuramemorial.wire_mold", "模具：電線");
        translations.put("item.sakuramemorial.ball_mold", "模具：球");
        translations.put("item.sakuramemorial.coin_mold", "模具：硬幣");
        translations.put("item.sakuramemorial.unpacking_mold", "模具：拆解");
        translations.put("item.sakuramemorial.packing_mold_2x2", "模具：打包 2x2");
        translations.put("item.sakuramemorial.packing_mold_3x3", "模具：打包 3x3");
        translations.put("item.sakuramemorial.stair_mold", "模具：樓梯");
        translations.put("item.sakuramemorial.slab_mold", "模具：半磚");
        translations.put("item.sakuramemorial.fence_mold", "模具：柵欄");
        translations.put("item.sakuramemorial.fence_gate_mold", "模具：柵欄門");
        translations.put("item.sakuramemorial.door_mold", "模具：門");
        translations.put("item.sakuramemorial.trapdoor_mold", "模具：地板門");
        translations.put("item.sakuramemorial.pressure_plate_mold", "模具：壓力板");
        translations.put("item.sakuramemorial.button_mold", "模具：按鈕");
        translations.put("item.sakuramemorial.wall_mold", "模具：牆");
        translations.put("item.sakuramemorial.carpet_mold", "模具：地毯");
        translations.put("item.sakuramemorial.pane_mold", "模具：玻璃板");
        translations.put("item.sakuramemorial.ladder_mold", "模具：梯子");
        translations.put("item.sakuramemorial.rail_mold", "模具：鐵軌");
        translations.put("item.sakuramemorial.chain_mold", "模具：鎖鏈");
        translations.put("item.sakuramemorial.leather_mold", "模具：皮革");
        translations.put("item.sakuramemorial.droplet_mold", "模具：液滴");
        translations.put("item.sakuramemorial.crafting_table_mold", "模具：工作台");
        translations.put("item.sakuramemorial.furnace_mold", "模具：熔爐");
        translations.put("item.sakuramemorial.anvil_mold", "模具：鐵砧");
        translations.put("item.sakuramemorial.composter_mold", "模具：堆肥桶");
        translations.put("item.sakuramemorial.cauldron_mold", "模具：鍋釜");
        translations.put("item.sakuramemorial.sign_mold", "模具：告示牌");
        translations.put("item.sakuramemorial.chest_mold", "模具：箱子");
        translations.put("item.sakuramemorial.barrel_mold", "模具：木桶");
        translations.put("item.sakuramemorial.coral_mold", "模具：珊瑚");
        translations.put("item.sakuramemorial.coral_fan_mold", "模具：珊瑚扇");
        translations.put("item.sakuramemorial.minecart_mold", "模具：礦車");
        translations.put("item.sakuramemorial.boat_mold", "模具：船");
        translations.put("item.sakuramemorial.head_mold", "模具：頭顱");
        translations.put("item.sakuramemorial.helmet_mold", "模具：頭盔");
        translations.put("item.sakuramemorial.chestplate_mold", "模具：胸甲");
        translations.put("item.sakuramemorial.legging_mold", "模具：護腿");
        translations.put("item.sakuramemorial.boot_mold", "模具：靴子");
        translations.put("item.sakuramemorial.horse_armor_mold", "模具：馬鎧");
        translations.put("item.sakuramemorial.wolf_armor_mold", "模具：狼鎧");
        translations.put("item.sakuramemorial.sword_mold", "模具：劍");
        translations.put("item.sakuramemorial.pickaxe_mold", "模具：鎬");
        translations.put("item.sakuramemorial.axe_mold", "模具：斧");
        translations.put("item.sakuramemorial.shovel_mold", "模具：鏟");
        translations.put("item.sakuramemorial.hoe_mold", "模具：鋤");
        translations.put("item.sakuramemorial.bow_mold", "模具：弓");
        translations.put("item.sakuramemorial.crossbow_mold", "模具：弩");
        translations.put("item.sakuramemorial.fishing_rod_mold", "模具：釣竿");
        translations.put("item.sakuramemorial.trident_mold", "模具：三叉戟");
        translations.put("item.sakuramemorial.hammer_mold", "模具：錘");
        translations.put("item.sakuramemorial.shear_mold", "模具：剪刀");
        translations.put("item.sakuramemorial.bucket_mold", "模具：桶");
        translations.put("item.sakuramemorial.arrow_mold", "模具：箭");
        translations.put("item.sakuramemorial.banner_pattern_mold", "模具：旗幟圖案");
        translations.put("item.sakuramemorial.pottery_sherd_mold", "模具：陶片");
        translations.put("item.sakuramemorial.template_mold", "模具：模板");
        translations.put("item.sakuramemorial.key_mold", "模具：鑰匙");
        translations.put("item.sakuramemorial.horn_mold", "模具：角");
        translations.put("item.sakuramemorial.disc_mold", "模具：唱片");
        translations.put("item.sakuramemorial.crystal_mold", "模具：水晶");
        translations.put("item.sakuramemorial.shard_mold", "模具：碎片");
        translations.put("item.sakuramemorial.clump_mold", "模具：團塊");
        translations.put("item.sakuramemorial.circuit_mold", "模具：電路");
        translations.put("item.sakuramemorial.cable_mold", "模具：線纜");
        translations.put("item.sakuramemorial.elytra_mold", "模具：鞘翅");
        translations.put("item.sakuramemorial.installer_mold", "模具：安裝器");
        translations.put("item.sakuramemorial.upgrade_mold", "模具：升級");

        // 壓印模板
        translations.put("item.sakuramemorial.enlightened_astral_press", "輝光星宇壓印模板");
        translations.put("item.sakuramemorial.sakura_memorial_press", "繁櫻幻憶壓印模板");
        translations.put("item.sakuramemorial.cosmilite_press", "寰宇壓印模板");

        // 粉塵
        translations.put("item.sakuramemorial.astral_dust", "星宇粉");
        translations.put("item.sakuramemorial.sakura_dust", "繁櫻粉");
        translations.put("item.sakuramemorial.sakura_crystal_dust", "繁櫻水晶粉");
        translations.put("item.sakuramemorial.sakura_pearl_dust", "繁櫻珍珠粉");
        translations.put("item.sakuramemorial.sakura_memorial_dust", "繁櫻幻憶粉");
        translations.put("item.sakuramemorial.nether_star_dust", "地獄之星粉");

        // 粒
        translations.put("item.sakuramemorial.astral_nugget", "星宇粒");
        translations.put("item.sakuramemorial.sakura_nugget", "繁櫻粒");
        translations.put("item.sakuramemorial.sakura_memorial_nugget", "繁櫻幻憶粒");

        // 錠/合金
        translations.put("item.sakuramemorial.astral_ingot", "星宇錠");
        translations.put("item.sakuramemorial.enlightened_astral_ingot", "輝光星宇錠");
        translations.put("item.sakuramemorial.sakura_ingot", "繁櫻錠");
        translations.put("item.sakuramemorial.galvanized_sakura_ingot", "凝能繁櫻錠");
        translations.put("item.sakuramemorial.sakura_memorial_alloy", "繁櫻幻憶合金");

        // 寶石
        translations.put("item.sakuramemorial.sakura_crystal", "繁櫻水晶");
        translations.put("item.sakuramemorial.galvanized_sakura_crystal", "凝能繁櫻水晶");
        translations.put("item.sakuramemorial.sakura_pearl", "繁櫻珍珠");
        translations.put("item.sakuramemorial.galvanized_sakura_pearl", "凝能繁櫻珍珠");

        // 電路
        translations.put("item.sakuramemorial.printed_enlightened_astral_circuit", "印刷輝光星宇電路");
        translations.put("item.sakuramemorial.printed_sakura_memorial_circuit", "印刷繁櫻幻憶電路");
        translations.put("item.sakuramemorial.sakura_memorial_processor", "繁櫻幻憶處理器");

        // 染料
        translations.put("item.sakuramemorial.sakura_dye", "繁櫻染料");

        translations.forEach(this::add);
    }

    private String toDisplayName(String path) {
        String[] words = path.split("_");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase());
        }
        return sb.toString();
    }
}