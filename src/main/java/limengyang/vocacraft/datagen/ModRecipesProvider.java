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
	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.VOCA_CRYSTAL_BLOCK, 1)
				.pattern(" # ")
				.pattern("#W#")
			    .pattern(" # ")
			    .input('#', ModItems.VOCA_DUST)
			    .input('W', Blocks.AMETHYST_BLOCK)
			    .criterion(hasItem(ModItems.VOCA_DUST), conditionsFromItem(ModItems.VOCA_DUST))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "voca_crystal_block2"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BUDDING_VOCA_CRYSTAL, 1)
			    .pattern(" # ")
			    .pattern("#W#")
			    .pattern(" # ")
			    .input('#', ModItems.VOCA_DUST)
			    .input('W', Blocks.BUDDING_AMETHYST)
			    .criterion(hasItem(ModItems.VOCA_DUST), conditionsFromItem(ModItems.VOCA_DUST))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "budding_voca_crystal"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.VOCA_CRYSTAL_BLOCK, 1)
			    .pattern("##")
			    .pattern("##")
			    .input('#', ModItems.VOCA_CRYSTAL)
			    .criterion(hasItem(ModItems.VOCA_CRYSTAL), conditionsFromItem(ModItems.VOCA_CRYSTAL))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "voca_crystal_block"));

		ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VOCA_CRYSTAL, 1)
				.pattern(" # ")
				.pattern("#W#")
				.pattern(" # ")
				.input('#', ModItems.VOCA_DUST)
				.input('W', Items.AMETHYST_SHARD)
				.criterion(hasItem(ModItems.VOCA_DUST), conditionsFromItem(ModItems.VOCA_DUST))
				.offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "voca_crystal"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STAR_WAND, 1)
			    .pattern("WV*")
				.pattern("V/#")
			    .pattern("GVP")
			    .input('*', Items.NETHER_STAR)
			    .input('V', ModItems.VOCA_CRYSTAL)
			    .input('/', Blocks.END_ROD)
			    .input('#', Blocks.WHITE_WOOL)
			    .input('G', Items.GOLD_INGOT)
			    .input('P', Items.PINK_DYE)
			    .input('W', Items.WHITE_DYE)
			    .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "star_wand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_CAT, 1)
                .pattern("V#V")
		        .pattern("#W#")
				.pattern("V#V")
				.input('#', ItemTags.FISHES)
				.input('W', ModItems.BLANK_DISC)
		        .input('V', ModItems.VOCA_DUST)
				.criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
		        .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_cat"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_13, 1)
			    .pattern("V#V")
			    .pattern("#W#")
			    .pattern("V#V")
			    .input('#', Items.YELLOW_DYE)
			    .input('V', ModItems.VOCA_DUST)
			    .input('W', ModItems.BLANK_DISC)
			    .criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_13"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_CHIRP, 1)
			    .pattern("V#V")
			    .pattern("#W#")
			    .pattern("V#V")
			    .input('#', Items.EGG)
			    .input('V', ModItems.VOCA_DUST)
			    .input('W', ModItems.BLANK_DISC)
			    .criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_chirp"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_BLOCKS, 1)
			    .pattern("VQV")
			    .pattern("#W#")
			    .pattern("V#V")
			    .input('V', ModItems.VOCA_DUST)
			    .input('#', Items.REDSTONE)
			    .input('Q', Blocks.REDSTONE_TORCH)
			    .input('W', ModItems.BLANK_DISC)
			    .criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_blocks"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_FAR, 1)
			    .pattern("VQV")
			    .pattern("#W#")
			    .pattern("V#V")
			    .input('#', Blocks.DIRT)
			    .input('V', ModItems.VOCA_DUST)
			    .input('Q', Blocks.GRASS)
			    .input('W', ModItems.BLANK_DISC)
			    .criterion(hasItem(ModItems.BLANK_DISC), conditionsFromItem(ModItems.BLANK_DISC))
			    .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "music_disc_far"));

	    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MUSIC_DISC_MALL, 1)
			    .pattern("V#V")
			    .pattern("#W#")
			    .pattern("V#V")
			    .input('#', Items.PURPLE_DYE)
			    .input('V', ModItems.VOCA_DUST)
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BAGUETTE, 1)
                .pattern("  #")
                .pattern(" # ")
                .pattern("#  ")
                .input('#', Items.BREAD)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID ,"baguette"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MIKU_DOLL, 1)
                .pattern("###")
                .pattern("#E#")
                .pattern("WVW")
                .input('#', Blocks.LIGHT_BLUE_WOOL)
		        .input('V', ModItems.VOCA_DUST)
		        .input('W', ModItems.LEEK)
                .input('E', ModBlocks.DEFAULT_DOLL)
                .criterion(hasItem(ModItems.LEEK), conditionsFromItem(ModItems.LEEK))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "miku_doll"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TETO_DOLL, 1)
                .pattern("###")
                .pattern("#E#")
                .pattern("WVW")
                .input('#', Blocks.RED_WOOL)
		        .input('V', ModItems.VOCA_DUST)
		        .input('W', ModItems.BAGUETTE)
                .input('E', ModBlocks.DEFAULT_DOLL)
                .criterion(hasItem(ModItems.BAGUETTE), conditionsFromItem(ModItems.BAGUETTE))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "teto_doll"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RIN_DOLL, 1)
                .pattern("###")
                .pattern("#E#")
                .pattern("WVW")
                .input('#', Blocks.YELLOW_WOOL)
		        .input('V', ModItems.VOCA_DUST)
		        .input('W', ModItems.MANDARIN)
                .input('E', ModBlocks.DEFAULT_DOLL)
                .criterion(hasItem(ModItems.MANDARIN), conditionsFromItem(ModItems.MANDARIN))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "rin_doll"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEEK_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("W")
                .input('W', Items.STICK)
                .input('#', ModItems.LEEK)
                .criterion(hasItem(ModItems.LEEK), conditionsFromItem(ModItems.LEEK))
                .offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "leek_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLANK_DISC)
                .pattern(" # ")
                .pattern("#W#")
                .pattern(" # ")
                .input('#', Blocks.GLASS)
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

		ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VOCA_DUST, 5)
				.input(ModItems.LEEK)
				.criterion(hasItem(ModItems.LEEK), conditionsFromItem(ModItems.LEEK))
				.offerTo(exporter, new Identifier(VocaCraft.MOD_ID, "voca_dust"));
    }
}
