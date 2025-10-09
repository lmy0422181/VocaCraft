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
        translationBuilder.add(ModItems.BAGUETTE, "法棍");
        translationBuilder.add(ModItems.LEEK, "大葱");
        translationBuilder.add(ModItems.MANDARIN, "橘子");
        translationBuilder.add(ModItems.LEEK_SEED, "大葱种子");
        translationBuilder.add(ModItems.MANDARIN_SEED, "橘子籽");
        translationBuilder.add(ModBlocks.LEEK_CROP, "大葱植株");
        translationBuilder.add(ModBlocks.MANDARIN_CROP, "橘子树");
        translationBuilder.add(ModItems.LEEK_SWORD, "大葱剑");
		translationBuilder.add(ModItems.STAR_WAND, "星之法杖");
	    translationBuilder.add("tooltip.vocacraft.star_wand", "§d别动，一会就送你轮回§r§e*§r§d\\§r");
        translationBuilder.add("tooltip.vocacraft.leek_sword", "谁会拿大葱当剑使啊...");
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
	    translationBuilder.add(ModItems.VOCA_DUST, "乐音尘埃");
	    translationBuilder.add(ModItems.VOCA_CRYSTAL, "乐音水晶碎片");
	    translationBuilder.add(ModBlocks.VOCA_CRYSTAL_BLOCK, "乐音水晶块");
	    translationBuilder.add(ModBlocks.BUDDING_VOCA_CRYSTAL, "乐音水晶母岩");
	    translationBuilder.add(ModBlocks.VOCA_CRYSTAL_CLUSTER, "乐音水晶簇");
	    translationBuilder.add(ModBlocks.LARGE_VOCA_CRYSTAL_BUD, "大型乐音水晶芽");
	    translationBuilder.add(ModBlocks.MEDIUM_VOCA_CRYSTAL_BUD, "中型乐音水晶芽");
	    translationBuilder.add(ModBlocks.SMALL_VOCA_CRYSTAL_BUD, "小型乐音水晶芽");


	    translationBuilder.add("advancements.vocacraft.root", "乐音奇旅——启程！");
	    translationBuilder.add("advancements.vocacraft.root_describe", "欢迎游玩此模组！");
	    translationBuilder.add("advancements.vocacraft.got_leek", "万物起源！");
	    translationBuilder.add("advancements.vocacraft.got_leek_describe", "种植并收获一根大葱");
	    translationBuilder.add("advancements.vocacraft.got_voca_crystal", "精加工");
	    translationBuilder.add("advancements.vocacraft.got_voca_crystal_describe", "把大葱做成乐音结晶");
	    translationBuilder.add("advancements.vocacraft.got_budding_voca_crystal", "自给自足");
	    translationBuilder.add("advancements.vocacraft.got_budding_voca_crystal_describe", "加了掉落物，现在可以用稿子挖母岩了");
	    translationBuilder.add("advancements.vocacraft.got_star_wand", "“魔法棒”");
	    translationBuilder.add("advancements.vocacraft.got_star_wand_describe", "要信标还是魔法棒");
    }
}
