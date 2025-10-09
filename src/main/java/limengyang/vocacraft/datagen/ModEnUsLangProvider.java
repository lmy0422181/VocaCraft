package limengyang.vocacraft.datagen;

import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.items.type.ModItemGroups;
import limengyang.vocacraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //添加语言翻译
        translationBuilder.add(ModItems.BAGUETTE, "baguette");
        translationBuilder.add(ModItems.LEEK, "leek");
        translationBuilder.add(ModItems.MANDARIN, "mandarin");
        translationBuilder.add(ModItems.LEEK_SEED, "leek seed");
        translationBuilder.add(ModItems.MANDARIN_SEED, "mandarin seed");
        translationBuilder.add(ModBlocks.LEEK_CROP, "leek crop");
        translationBuilder.add(ModBlocks.MANDARIN_CROP, "mandarin crop");
        translationBuilder.add(ModItems.LEEK_SWORD, "leek sword");
		translationBuilder.add(ModItems.STAR_WAND, "star wand");
		translationBuilder.add("tooltip.vocacraft.star_wand", "§dいますぐ輪廻!§r");
        translationBuilder.add("tooltip.vocacraft.leek_sword", "Who would use a leek as a sword...");
        translationBuilder.add("tooltip.vocacraft.disc_stack", "§4Warning: Do not reverse synthesize, for decoration only!!!");
        translationBuilder.add(ModBlocks.DISC_STACK, "disc stack");
        translationBuilder.add(ModBlocks.DEFAULT_DOLL, "default doll");
        translationBuilder.add(ModBlocks.MIKU_DOLL, "Miku doll");
        translationBuilder.add(ModBlocks.TETO_DOLL, "Teto doll");
        translationBuilder.add(ModBlocks.RIN_DOLL, "Kagamine Rin doll");
        translationBuilder.add(ModItemGroups.VOCACRAFT_ITEMS, "VocaCraft:Items");
        translationBuilder.add(ModItemGroups.VOCACRAFT_BLOCKS, "VocaCraft:Blocks");
        translationBuilder.add("entity.minecraft.villager.disc_merchant", "disc merchant");
        translationBuilder.add(ModItems.BLANK_DISC, "blank disc");
	    translationBuilder.add(ModItems.VOCA_CRYSTAL, "voca crystal shard");
	    translationBuilder.add(ModItems.VOCA_DUST, "voca dust");
		translationBuilder.add(ModBlocks.VOCA_CRYSTAL_BLOCK, "block of voca crystal");
	    translationBuilder.add(ModBlocks.BUDDING_VOCA_CRYSTAL, "budding voca crystal");
	    translationBuilder.add(ModBlocks.VOCA_CRYSTAL_CLUSTER, "voca crystal cluster");
	    translationBuilder.add(ModBlocks.LARGE_VOCA_CRYSTAL_BUD, "large voca crystal bud");
	    translationBuilder.add(ModBlocks.MEDIUM_VOCA_CRYSTAL_BUD, "medium voca crystal bud");
	    translationBuilder.add(ModBlocks.SMALL_VOCA_CRYSTAL_BUD, "small voca crystal bud");


		translationBuilder.add("advancements.vocacraft.root", "VocaCraft!");
		translationBuilder.add("advancements.vocacraft.root_describe", "Welcome to VocaCraft!");
		translationBuilder.add("advancements.vocacraft.got_leek", "The beginning of all!");
	    translationBuilder.add("advancements.vocacraft.got_leek_describe", "Got a leek");
	    translationBuilder.add("advancements.vocacraft.got_voca_crystal", "fine machining");
	    translationBuilder.add("advancements.vocacraft.got_voca_crystal_describe", "Get voca crystal made from leeks");
		translationBuilder.add("advancements.vocacraft.got_budding_voca_crystal", "Self-sufficiency");
	    translationBuilder.add("advancements.vocacraft.got_budding_voca_crystal_describe", "Added drops, now you can use a pickaxe to mine budding amethyst");
	    translationBuilder.add("advancements.vocacraft.got_star_wand", "The wand");
	    translationBuilder.add("advancements.vocacraft.got_star_wand_describe", "Do you want a beacon or a wand?");
    }
}
