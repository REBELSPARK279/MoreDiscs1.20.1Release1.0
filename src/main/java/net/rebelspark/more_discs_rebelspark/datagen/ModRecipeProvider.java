package net.rebelspark.more_discs_rebelspark.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.rebelspark.more_discs_rebelspark.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALPHA_MUSIC_DISC.get())
                .pattern("FSF")
                .pattern("GCL")
                .pattern("FFF")
                .define('F', Items.FLINT)
                .define('G', Items.GRASS_BLOCK)
                .define('S', Items.COBBLESTONE)
                .define('L', Items.OAK_LOG)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLIND_SPOTS_DISC.get())
                .pattern("FFF")
                .pattern("ICI")
                .pattern("FFF")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DOORDISC.get())
                .pattern("FDF")
                .pattern("GCD")
                .pattern("FDF")
                .define('F', Items.FLINT)
                .define('D', Items.DARK_OAK_DOOR)
                .define('G', Items.GOLD_NUGGET)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREITONDISC.get())
                .pattern("FNF")
                .pattern("NCN")
                .pattern("FFF")
                .define('F', Items.FLINT)
                .define('N', Items.NOTE_BLOCK)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRYHANDSDISC.get())
                .pattern("FFF")
                .pattern("SCS")
                .pattern("FFF")
                .define('F', Items.FLINT)
                .define('S', Items.SAND)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EXCUSE_DISC.get())
                .pattern("FSF")
                .pattern("LCL")
                .pattern("FSF")
                .define('F', Items.FLINT)
                .define('L', Items.LAPIS_LAZULI)
                .define('S', Items.STRIPPED_DARK_OAK_WOOD)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLOATING_TREES_DISC.get())
                .pattern("FLF")
                .pattern("LCL")
                .pattern("F F")
                .define('F', Items.FLINT)
                .define('L', Items.OAK_LEAVES)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HAUNT_MUSKIE_DISC.get())
                .pattern("FWF")
                .pattern("WCW")
                .pattern("FWF")
                .define('F', Items.FLINT)
                .define('W', Items.WHITE_WOOL)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HEADBUGDISC.get())
                .pattern("FWF")
                .pattern("OCO")
                .pattern("FFF")
                .define('F', Items.FLINT)
                .define('W', Items.WATER_BUCKET)
                .define('O', Items.CORNFLOWER)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KEYDISC.get())
                .pattern("FFF")
                .pattern("FCY")
                .pattern("FFF")
                .define('F', Items.FLINT)
                .define('Y', Items.YELLOW_DYE)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KIDISC.get())
                .pattern("FLF")
                .pattern("PCP")
                .pattern("FLF")
                .define('F', Items.FLINT)
                .define('P', Items.PINK_PETALS)
                .define('L', Items.CHERRY_LEAVES)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIVING_MICE_DISC.get())
                .pattern("FFF")
                .pattern("GCG")
                .pattern("FFF")
                .define('F', Items.FLINT)
                .define('G', Items.GREEN_DYE)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOOG_CITY_DISC.get())
                .pattern("FAF")
                .pattern("SCS")
                .pattern("FAF")
                .define('F', Items.FLINT)
                .define('A', Items.ALLIUM)
                .define('S', Items.STONE_BRICKS)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUTATIONDISC.get())
                .pattern("FYF")
                .pattern("YCL")
                .pattern("FLF")
                .define('F', Items.FLINT)
                .define('L', Items.LIME_DYE)
                .define('Y', Items.YELLOW_DYE)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SWEDEN_DISC.get())
                .pattern("FBF")
                .pattern("YCY")
                .pattern("FBF")
                .define('F', Items.FLINT)
                .define('Y', Items.YELLOW_DYE)
                .define('B', Items.BLUE_DYE)
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.EMPTY_DISC_CORE.get()), has(ModItems.EMPTY_DISC_CORE.get()))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DOGDISC.get())
                .pattern("FFF")
                .pattern("FCF")
                .pattern("FFF")
                .define('F', ModItems.DOG_DISC_FRAGMENT.get())
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.DOG_DISC_FRAGMENT.get()), has(ModItems.DOG_DISC_FRAGMENT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MINECRAFTDISC.get())
                .pattern("FFF")
                .pattern("FCF")
                .pattern("FFF")
                .define('F', ModItems.MINECRAFT_DISC_FRAGMENT.get())
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.MOOG_CITY2_DISC_FRAGMENT.get()), has(ModItems.MOOG_CITY2_DISC_FRAGMENT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOOG_CITY2_DISC.get())
                .pattern("FFF")
                .pattern("FCF")
                .pattern("FFF")
                .define('F', ModItems.MOOG_CITY2_DISC_FRAGMENT.get())
                .define('C', ModItems.EMPTY_DISC_CORE.get())
                .unlockedBy(getHasName(ModItems.MOOG_CITY2_DISC_FRAGMENT.get()), has(ModItems.MOOG_CITY2_DISC_FRAGMENT.get()))
                .save(pWriter);




        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMPTY_DISC_CORE.get())
                .pattern(" R ")
                .pattern("RIR")
                .pattern(" R ")
                .define('R', Items.REDSTONE)
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .save(pWriter);
    }
}
