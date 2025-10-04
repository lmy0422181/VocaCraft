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
        translationBuilder.add(ModItems.FRENCH_BREAD, "french bread");
        translationBuilder.add(ModItems.SCALLION, "scallion");
        translationBuilder.add(ModItems.MANDARIN, "mandarin");
        translationBuilder.add(ModItems.SCALLION_SEED, "scallion seed");
        translationBuilder.add(ModItems.MANDARIN_SEED, "mandarin seed");
        translationBuilder.add(ModBlocks.SCALLION_CROP, "scallion crop");
        translationBuilder.add(ModBlocks.MANDARIN_CROP, "mandarin crop");
        translationBuilder.add(ModItems.SCALLION_SWORD, "scallion sword");
        translationBuilder.add("tooltip.vocacraft.scallion_sword", "Who would use a scallion as a sword...");
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
    }
}
