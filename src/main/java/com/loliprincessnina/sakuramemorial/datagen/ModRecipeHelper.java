package com.loliprincessnina.sakuramemorial.datagen;

import com.jerry.mekmm.api.datagen.recipe.builder.StamperRecipeBuilder;
import com.jerry.mekmm.api.datagen.recipe.builder.TripleItemToItemRecipeBuilder;
import com.loliprincessnina.sakuramemorial.SakuraMemorial;
import mekanism.api.recipes.basic.BasicCrushingRecipe;
import mekanism.api.recipes.basic.BasicEnrichingRecipe;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

public class ModRecipeHelper {

    // ====== 打包/拆解 ======

    public static void packing3x3(Block result, ItemLike ingredient, RecipeOutput output) {
        String resultName = getItemName(result.asItem());
        String ingredientName = getItemName(ingredient);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shaped/" + resultName + "_from_" + ingredientName));
    }

    public static void packing3x3(Block result, TagKey<Item> ingredient, RecipeOutput output) {
        String resultName = getItemName(result.asItem());
        String ingredientName = getTagName(ingredient);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shaped/" + resultName + "_from_" + ingredientName));
    }

    public static void packing3x3(ItemLike result, ItemLike ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shaped/" + resultName + "_from_" + ingredientName));
    }

    public static void packing3x3(ItemLike result, TagKey<Item> ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shaped/" + resultName + "_from_" + ingredientName));
    }

    public static void unpacking3x3(ItemLike result, Block ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient.asItem());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result, 9)
                .requires(ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shapeless/" + resultName + "_from_" + ingredientName));
    }

    public static void unpacking3x3(ItemLike result, TagKey<Item> ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result, 9)
                .requires(ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shapeless/" + resultName + "_from_" + ingredientName));
    }

    public static void unpacking3x3(ItemLike result, ItemLike ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result, 9)
                .requires(ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shapeless/" + resultName + "_from_" + ingredientName));
    }

    public static void packing2x2(Block result, ItemLike ingredient, RecipeOutput output) {
        String resultName = getItemName(result.asItem());
        String ingredientName = getItemName(ingredient);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("XX")
                .pattern("XX")
                .define('X', ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shaped/" + resultName + "_from_" + ingredientName));
    }

    public static void packing2x2(Block result, TagKey<Item> ingredient, RecipeOutput output) {
        String resultName = getItemName(result.asItem());
        String ingredientName = getTagName(ingredient);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("XX")
                .pattern("XX")
                .define('X', ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shaped/" + resultName + "_from_" + ingredientName));
    }

    public static void unpacking2x2(ItemLike result, Block ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient.asItem());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result, 4)
                .requires(ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shapeless/" + resultName + "_from_" + ingredientName));
    }

    public static void unpacking2x2(ItemLike result, TagKey<Item> ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result, 4)
                .requires(ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shapeless/" + resultName + "_from_" + ingredientName));
    }

    // ====== 熔煉/高爐/煙燻/營火 ======

    public static void smelting(ItemLike result, ItemLike ingredient, RecipeOutput output, float experience, int cookingTime) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), RecipeCategory.MISC, result, experience, cookingTime)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "smelting/" + resultName + "_from_" + ingredientName));
    }

    public static void smelting(ItemLike result, TagKey<Item> ingredient, RecipeOutput output, float experience, int cookingTime) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), RecipeCategory.MISC, result, experience, cookingTime)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "smelting/" + resultName + "_from_" + ingredientName));
    }

    public static void blasting(ItemLike result, ItemLike ingredient, RecipeOutput output, float experience, int cookingTime) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient), RecipeCategory.MISC, result, experience, cookingTime)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "blasting/" + resultName + "_from_" + ingredientName));
    }

    public static void blasting(ItemLike result, TagKey<Item> ingredient, RecipeOutput output, float experience, int cookingTime) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient), RecipeCategory.MISC, result, experience, cookingTime)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "blasting/" + resultName + "_from_" + ingredientName));
    }

    public static void smoking(ItemLike result, ItemLike ingredient, RecipeOutput output, float experience, int cookingTime) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, cookingTime)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "smoking/" + resultName + "_from_" + ingredientName));
    }

    public static void smoking(ItemLike result, TagKey<Item> ingredient, RecipeOutput output, float experience, int cookingTime) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, cookingTime)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "smoking/" + resultName + "_from_" + ingredientName));
    }

    public static void campfireCooking(ItemLike result, ItemLike ingredient, RecipeOutput output, float experience, int cookingTime) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, cookingTime)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "campfireCooking/" + resultName + "_from_" + ingredientName));
    }

    public static void campfireCooking(ItemLike result, TagKey<Item> ingredient, RecipeOutput output, float experience, int cookingTime) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, cookingTime)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "campfireCooking/" + resultName + "_from_" + ingredientName));
    }

    // ====== 鍛造 ======

    public static void smithing(ItemLike result, ItemLike template, ItemLike base, ItemLike addition, RecipeOutput output) {
        String resultName = getItemName(result);
        String baseName = getItemName(base);

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(template),
                        Ingredient.of(base),
                        Ingredient.of(addition),
                        RecipeCategory.MISC,
                        result.asItem())
                .unlocks("has_" + baseName, has(base))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "smithing/" + resultName + "_from_" + baseName));
    }

    public static void smithing(ItemLike result, ItemLike template, TagKey<Item> base, ItemLike addition, RecipeOutput output) {
        String resultName = getItemName(result);
        String baseName = getTagName(base);

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(template),
                        Ingredient.of(base),
                        Ingredient.of(addition),
                        RecipeCategory.MISC,
                        result.asItem())
                .unlocks("has_" + baseName, has(base))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "smithing/" + resultName + "_from_" + baseName));
    }

    // ====== 石切 ======

    public static void stonecutting(ItemLike result, int count, ItemLike ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), RecipeCategory.MISC, result, count)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "stonecutting/" + resultName + "_from_" + ingredientName));
    }

    public static void stonecutting(ItemLike result, int count, TagKey<Item> ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), RecipeCategory.MISC, result, count)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "stonecutting/" + resultName + "_from_" + ingredientName));
    }

    // ====== Mekanism 粉碎 ======

    public static void crushing(ItemLike result, int outputCount, ItemLike ingredient, int inputCount,
                                RecipeOutput output, ICondition... conditions) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(
                SakuraMemorial.MOD_ID,
                "mekanism/crushing/" + ingredientName + "_to_" + resultName
        );

        var recipe = new BasicCrushingRecipe(
                ItemStackIngredient.of(SizedIngredient.of(ingredient, inputCount)),
                new ItemStack(result, outputCount)
        );

        output = output.withConditions(conditions);
        output.accept(id, recipe, null);
    }

    public static void crushing(ItemLike result, int outputCount, TagKey<Item> ingredient, int inputCount,
                                RecipeOutput output, ICondition... conditions) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(
                SakuraMemorial.MOD_ID,
                "mekanism/crushing/" + ingredientName + "_to_" + resultName
        );

        var recipe = new BasicCrushingRecipe(
                ItemStackIngredient.of(SizedIngredient.of(ingredient, inputCount)),
                new ItemStack(result, outputCount)
        );

        output = output.withConditions(conditions);
        output.accept(id, recipe, null);
    }

    // ====== Mekanism 富集 ======

    public static void enriching(ItemLike result, int outputCount, ItemLike ingredient, int inputCount,
                                 RecipeOutput output, ICondition... conditions) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(
                SakuraMemorial.MOD_ID,
                "mekanism/enriching/" + ingredientName + "_to_" + resultName
        );

        var recipe = new BasicEnrichingRecipe(
                ItemStackIngredient.of(SizedIngredient.of(ingredient, inputCount)),
                new ItemStack(result, outputCount)
        );

        output = output.withConditions(conditions);
        output.accept(id, recipe, null);
    }

    public static void enriching(ItemLike result, int outputCount, TagKey<Item> ingredient, int inputCount,
                                 RecipeOutput output, ICondition... conditions) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(
                SakuraMemorial.MOD_ID,
                "mekanism/enriching/" + ingredientName + "_to_" + resultName
        );

        var recipe = new BasicEnrichingRecipe(
                ItemStackIngredient.of(SizedIngredient.of(ingredient, inputCount)),
                new ItemStack(result, outputCount)
        );

        output = output.withConditions(conditions);
        output.accept(id, recipe, null);
    }

    // ====== Mekanism 沖壓 ======

    public static void stamping(ItemLike result, int outputCount, ItemLike ingredient, int inputCount,
                                ItemLike mold, int moldCount, RecipeOutput output, ICondition... conditions) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(
                SakuraMemorial.MOD_ID,
                "mekanism/stamping/" + ingredientName + "_to_" + resultName
        );

        var recipe = StamperRecipeBuilder.stamping(
                ItemStackIngredient.of(SizedIngredient.of(ingredient, inputCount)),
                ItemStackIngredient.of(SizedIngredient.of(mold, moldCount)),
                new ItemStack(result, outputCount)
        );
        for (ICondition condition : conditions) {
            recipe.addCondition(condition);
        }
        recipe.build(output, id);
    }

    public static void stamping(ItemLike result, int outputCount, TagKey<Item> ingredient, int inputCount,
                                ItemLike mold, int moldCount, RecipeOutput output, ICondition... conditions) {
        String resultName = getItemName(result);
        String ingredientName = getTagName(ingredient);

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(
                SakuraMemorial.MOD_ID,
                "mekanism/stamping/" + ingredientName + "_to_" + resultName
        );

        var recipe = StamperRecipeBuilder.stamping(
                ItemStackIngredient.of(SizedIngredient.of(ingredient, inputCount)),
                ItemStackIngredient.of(SizedIngredient.of(mold, moldCount)),
                new ItemStack(result, outputCount)
        );
        for (ICondition condition : conditions) {
            recipe.addCondition(condition);
        }
        recipe.build(output, id);
    }

    // ====== MekMM 合金 ======

    public static void alloying(ItemLike result, int outputCount,
                                ItemLike input0, int input0Count,
                                ItemLike input1, int input1Count,
                                ItemLike input2, int input2Count,
                                String extraText, RecipeOutput output, ICondition... conditions) {
        String resultName = getItemName(result);

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(
                SakuraMemorial.MOD_ID,
                "mekanism/alloying/" + extraText + "/" + resultName
        );

        var recipe = TripleItemToItemRecipeBuilder.pressing(
                ItemStackIngredient.of(SizedIngredient.of(input0, input0Count)),
                ItemStackIngredient.of(SizedIngredient.of(input1, input1Count)),
                ItemStackIngredient.of(SizedIngredient.of(input2, input2Count)),
                new ItemStack(result, outputCount)
        );
        for (ICondition condition : conditions) {
            recipe.addCondition(condition);
        }
        recipe.build(output, id);
    }

    public static void alloying(ItemLike result, int outputCount,
                                TagKey<Item> input0, int input0Count,
                                TagKey<Item> input1, int input1Count,
                                TagKey<Item> input2, int input2Count,
                                String extraText, RecipeOutput output, ICondition... conditions) {
        String resultName = getItemName(result);

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(
                SakuraMemorial.MOD_ID,
                "mekanism/alloying/" + extraText + "/" + resultName
        );

        var recipe = TripleItemToItemRecipeBuilder.pressing(
                ItemStackIngredient.of(SizedIngredient.of(input0, input0Count)),
                ItemStackIngredient.of(SizedIngredient.of(input1, input1Count)),
                ItemStackIngredient.of(SizedIngredient.of(input2, input2Count)),
                new ItemStack(result, outputCount)
        );
        for (ICondition condition : conditions) {
            recipe.addCondition(condition);
        }
        recipe.build(output, id);
    }

    // ====== 木材配方 ======

    /**
     * 木材 → 門 x12
     */
    public static void door(ItemLike result, ItemLike ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 12)
                .pattern("XX")
                .pattern("XX")
                .pattern("XX")
                .define('X', ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shaped/" + resultName + "_from_" + ingredientName));
    }

    /**
     * 木材 → 活板門 x8
     */
    public static void trapdoor(ItemLike result, ItemLike ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 8)
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shaped/" + resultName + "_from_" + ingredientName));
    }

    /**
     * 木材 → 壓力板 x4
     */
    public static void pressurePlates(ItemLike result, ItemLike ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, result, 4)
                .pattern("XX")
                .define('X', ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shaped/" + resultName + "_from_" + ingredientName));
    }

    /**
     * 木材 → 船 x4
     */
    public static void boat(ItemLike result, ItemLike ingredient, RecipeOutput output) {
        String resultName = getItemName(result);
        String ingredientName = getItemName(ingredient);

        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, result, 4)
                .pattern("X X")
                .pattern("XXX")
                .define('X', ingredient)
                .unlockedBy("has_" + ingredientName, has(ingredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(SakuraMemorial.MOD_ID, "shaped/" + resultName + "_from_" + ingredientName));
    }

    /**
     * 完整的木材配方組
     */
    public static void woodSet(
            ItemLike log, ItemLike strippedLog,
            ItemLike wood, ItemLike strippedWood,
            ItemLike planks,
            ItemLike stairs, ItemLike slab,
            ItemLike door, ItemLike trapdoor,
            ItemLike pressurePlate, ItemLike boat,
            RecipeOutput output, ICondition... conditions) {

        // 原木 ⇄ 去皮原木
        enriching(log, 1, strippedLog, 1, output, conditions);
        crushing(strippedLog, 1, log, 1, output, conditions);
        // 木材 ⇄ 去皮木材
        enriching(wood, 1, strippedWood, 1, output, conditions);
        crushing(strippedWood, 1, wood, 1, output, conditions);
        // 去皮原木 → 木材 x8
        enriching(strippedLog, 1, planks, 8, output, conditions);
        // 木材衍生品
        stonecutting(stairs, 1, planks, output);
        stonecutting(slab, 2, planks, output);
        door(door, log, output);
        trapdoor(trapdoor, log, output);
        pressurePlates(pressurePlate, log, output);
        if (boat != null) {
            // boat(boat, log, output);
        }
    }

    // ====== 輔助方法 ======

    private static Criterion<InventoryChangeTrigger.TriggerInstance> has(ItemLike item) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(item);
    }

    private static Criterion<InventoryChangeTrigger.TriggerInstance> has(TagKey<Item> tag) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(
                ItemPredicate.Builder.item().of(tag).build()
        );
    }

    private static String getItemName(ItemLike item) {
        return item.asItem().builtInRegistryHolder().key().location().getPath();
    }

    private static String getItemName(Item item) {
        return item.builtInRegistryHolder().key().location().getPath();
    }

    private static String getTagName(TagKey<Item> tag) {
        return tag.location().getPath().replace("/", "_");
    }
}