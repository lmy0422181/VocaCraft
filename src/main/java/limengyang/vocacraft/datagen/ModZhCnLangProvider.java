package limengyang.vocacraft.datagen;

import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.items.type.ModItemGroups;
import limengyang.vocacraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //添加语言翻译
        translationBuilder.add(ModItems.FRENCH_BREAD, "法棍");
        translationBuilder.add(ModItems.SCALLION, "大葱");
        translationBuilder.add(ModItems.MANDARIN, "橘子");
        translationBuilder.add(ModItems.SCALLION_SEED, "大葱种子");
        translationBuilder.add(ModItems.MANDARIN_SEED, "橘子籽");
        translationBuilder.add(ModBlocks.SCALLION_CROP, "大葱植株");
        translationBuilder.add(ModBlocks.MANDARIN_CROP, "橘子树");
        translationBuilder.add(ModItems.SCALLION_SWORD, "大葱剑");
        translationBuilder.add("tooltip.vocacraft.scallion_sword", "谁会拿大葱当剑使啊...");
        translationBuilder.add("tooltip.vocacraft.disc_stack", "§4警告：不可反向合成，仅作装饰!!!");
        translationBuilder.add(ModBlocks.DISC_STACK, "唱片堆");
        translationBuilder.add(ModBlocks.DEFAULT_DOLL, "普通玩偶");
        translationBuilder.add(ModBlocks.MIKU_DOLL, "初音未来玩偶");
        translationBuilder.add(ModBlocks.TETO_DOLL, "重音テト玩偶");
        translationBuilder.add(ModBlocks.RIN_DOLL, "镜音铃玩偶");
        translationBuilder.add(ModItemGroups.VOCACRAFT_ITEMS, "VocaCraft:物品");
        translationBuilder.add(ModItemGroups.VOCACRAFT_BLOCKS, "VocaCraft:方块");
        translationBuilder.add("entity.minecraft.villager.disc_merchant", "唱片商");
        translationBuilder.add(ModItems.BLANK_DISC, "空白唱片");
    }
}
