package limengyang.vocacraft.datagen;

import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
	public ModAdvancementProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateAdvancement(Consumer<Advancement> consumer) {
		Advancement rootAdvancement = Advancement.Builder.create()
				.display(
						ModBlocks.MIKU_DOLL,
						Text.translatable("advancements.vocacraft.root"),
						Text.translatable("advancements.vocacraft.root_describe"),
						new Identifier("vocacraft:textures/gui/advancements/backgrounds/vocacraft.png"),
						AdvancementFrame.TASK,
						true,
						true,
						false
				)
				.criterion("vocacraft", TickCriterion.Conditions.createTick())
				.build(consumer, "vocacraft:root");

		Advancement gotLeekAdvancement = Advancement.Builder.create().parent(rootAdvancement)
				.display(
						ModItems.LEEK,
						Text.translatable("advancements.vocacraft.got_leek"),
						Text.translatable("advancements.vocacraft.got_leek_describe"),
						null,
						AdvancementFrame.TASK,
						true,
						true,
						false
				)
				.criterion("got_leek", InventoryChangedCriterion.Conditions.items(ModItems.LEEK))
				.build(consumer, "vocacraft:got_leek");

		Advancement gotVocaCrystalAdvancement = Advancement.Builder.create().parent(gotLeekAdvancement)
				.display(
						ModItems.VOCA_CRYSTAL,
						Text.translatable("advancements.vocacraft.got_voca_crystal"),
						Text.translatable("advancements.vocacraft.got_voca_crystal_describe"),
						null,
						AdvancementFrame.TASK,
						true,
						true,
						false
				)
				.criterion("got_voca_crystal", InventoryChangedCriterion.Conditions.items(ModItems.VOCA_CRYSTAL))
				.build(consumer, "vocacraft:got_voca_crystal");

		Advancement gotBuddingVocaCrystal = Advancement.Builder.create().parent(gotVocaCrystalAdvancement)
				.display(
						ModBlocks.BUDDING_VOCA_CRYSTAL,
						Text.translatable("advancements.vocacraft.got_budding_voca_crystal"),
						Text.translatable("advancements.vocacraft.got_budding_voca_crystal_describe"),
						null,
						AdvancementFrame.TASK,
						true,
						true,
						false
				)
				.criterion("got_budding_voca_crystal", InventoryChangedCriterion.Conditions.items(ModBlocks.BUDDING_VOCA_CRYSTAL))
				.build(consumer, "vocacraft:got_budding_voca_crystal");

		Advancement gotStarWand = Advancement.Builder.create().parent(gotVocaCrystalAdvancement)
				.display(
						ModItems.STAR_WAND,
						Text.translatable("advancements.vocacraft.got_star_wand"),
						Text.translatable("advancements.vocacraft.got_star_wand_describe"),
						null,
						AdvancementFrame.CHALLENGE,
						false,
						true,
						false
				)
				.criterion("got_star_wand", InventoryChangedCriterion.Conditions.items(ModItems.STAR_WAND))
				.build(consumer, "vocacraft:got_star_wand");
	}
}
