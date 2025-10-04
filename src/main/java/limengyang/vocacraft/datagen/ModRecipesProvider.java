package limengyang.vocacraft.datagen;

import limengyang.vocacraft.VocaCraft;
import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //添加合成表
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_CAT, 1)
                .pattern(" # ")
		        .pattern("#W#")
				.pattern(" # ")
				.input('#', ItemTags.FISHES)
				.input('W', ModItems.BLANK_DISC)
				.criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
		        .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_cat"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_13, 1)
			    .pattern(" # ")
			    .pattern("#W#")
			    .pattern(" # ")
			    .input('#', Items.YELLOW_DYE)
			    .input('W', ModItems.BLANK_DISC)
			    .criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_13"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_CHIRP, 1)
			    .pattern(" # ")
			    .pattern("#W#")
			    .pattern(" # ")
			    .input('#', Items.EGG)
			    .input('W', ModItems.BLANK_DISC)
			    .criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_chirp"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_BLOCKS, 1)
			    .pattern(" Q ")
			    .pattern("#W#")
			    .pattern(" # ")
		        .input('#', Items.REDSTONE)
			    .input('Q', Blocks.REDSTONE_TORCH)
			    .input('W', ModItems.BLANK_DISC)
			    .criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_blocks"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_FAR, 1)
			    .pattern(" Q ")
			    .pattern("#W#")
			    .pattern(" # ")
			    .input('#', Blocks.DIRT)
			    .input('Q', Blocks.GRASS)
			    .input('W', ModItems.BLANK_DISC)
			    .criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_far"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_MALL, 1)
			    .pattern(" # ")
			    .pattern("#W#")
			    .pattern(" # ")
			    .input('#', Items.PURPLE_DYE)
			    .input('W', ModItems.BLANK_DISC)
			    .criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_mall"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEFAULT_DOLL, 1)
                .pattern("###")
                .pattern("#W#")
                .pattern("###")
                .input('#', Blocks.PINK_WOOL)
                .input('W', Items.ARMOR_STAND)
                .criterion(hasItem(Items.ARMOR_STAND), conditionsFromItem(Items.ARMOR_STAND))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "default_doll"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FRENCH_BREAD, 1)
                .pattern("  #")
                .pattern(" # ")
                .pattern("#  ")
                .input('#', Items.BREAD)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID ,"french_bread"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MIKU_DOLL, 1)
                .pattern("###")
                .pattern("#E#")
                .pattern("WSW")
                .input('#', Items.CYAN_WOOL)
                .input('S', Items.BLACK_WOOL)
                .input('W', ModItems.SCALLION)
                .input('E', ModBlocks.DEFAULT_DOLL)
                .criterion(hasItem(ModItems.SCALLION), conditionsFromItem(ModItems.SCALLION))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "miku_doll"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TETO_DOLL, 1)
                .pattern("###")
                .pattern("#E#")
                .pattern("WSW")
                .input('#', Items.RED_WOOL)
                .input('S', Items.GRAY_WOOL)
                .input('W', ModItems.FRENCH_BREAD)
                .input('E', ModBlocks.DEFAULT_DOLL)
                .criterion(hasItem(ModItems.FRENCH_BREAD), conditionsFromItem(ModItems.FRENCH_BREAD))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "teto_doll"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RIN_DOLL, 1)
                .pattern("###")
                .pattern("#E#")
                .pattern("WSW")
                .input('#', Items.YELLOW_WOOL)
                .input('S', Items.BLACK_WOOL)
                .input('W', ModItems.MANDARIN)
                .input('E', ModBlocks.DEFAULT_DOLL)
                .criterion(hasItem(ModItems.FRENCH_BREAD), conditionsFromItem(ModItems.FRENCH_BREAD))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "rin_doll"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SCALLION_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("W")
                .input('W', Items.STICK)
                .input('#', ModItems.SCALLION)
                .criterion(hasItem(ModItems.SCALLION), conditionsFromItem(ModItems.SCALLION))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "scallion_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLANK_DISC)
                .pattern(" # ")
                .pattern("#W#")
                .pattern(" # ")
                .input('#', Items.GLASS)
                .input('W', Items.BLACK_DYE)
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "blank_disc"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLANK_DISC)
                .input(ItemTags.MUSIC_DISCS)
                .criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "blank_disc2"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DISC_STACK)
                .input(ItemTags.MUSIC_DISCS)
                .input(ItemTags.MUSIC_DISCS)
                .input(ItemTags.MUSIC_DISCS)
                .input(ItemTags.MUSIC_DISCS)
                .input(ItemTags.MUSIC_DISCS)
                .input(ItemTags.MUSIC_DISCS)
                .input(ItemTags.MUSIC_DISCS)
                .criterion(hasItem(Items.MUSIC_DISC_5), conditionsFromItem(Items.MUSIC_DISC_11))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "disc_stack"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANDARIN_SEED, 3)
                .input(ModItems.MANDARIN)
                .criterion(hasItem(ModItems.MANDARIN), conditionsFromItem(ModItems.MANDARIN))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "mandarin_seed"));
    }
}
