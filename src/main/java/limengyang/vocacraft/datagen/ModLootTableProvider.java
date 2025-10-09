package limengyang.vocacraft.datagen;

import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.blocks.custom.ModCrops.LeekCrops;
import limengyang.vocacraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //添加掉落
	    addDrop(ModBlocks.VOCA_CRYSTAL_BLOCK);
		addDrop(ModBlocks.BUDDING_VOCA_CRYSTAL);
		addDrop(ModBlocks.VOCA_CRYSTAL_CLUSTER, likeAmethystDrops(ModBlocks.VOCA_CRYSTAL_CLUSTER, ModItems.VOCA_CRYSTAL, 4.0f, 4.0f));
		addDrop(Blocks.BUDDING_AMETHYST);
        addDrop(ModBlocks.DEFAULT_DOLL);
        addDrop(ModBlocks.MIKU_DOLL);
        addDrop(ModBlocks.TETO_DOLL);
        addDrop(ModBlocks.RIN_DOLL);
        addDrop(ModBlocks.DISC_STACK);
        LootCondition.Builder builder =
                BlockStatePropertyLootCondition.builder(ModBlocks.LEEK_CROP)
                        .properties(StatePredicate.Builder.create().exactMatch(LeekCrops.AGE, 7));
                addDrop(ModBlocks.LEEK_CROP, cropDrops(ModBlocks.LEEK_CROP, ModItems.LEEK, ModItems.LEEK_SEED, builder));
        addDrop(ModBlocks.MANDARIN_CROP, ModItems.MANDARIN_SEED);
    }
	public LootTable.Builder likeAmethystDrops(Block drop, Item item, float min, float max) {
		return dropsWithSilkTouch(
				drop,
				(LootPoolEntry.Builder<?>)this.applyExplosionDecay(
						drop,
						ItemEntry.builder(item)
								.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
								.apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
				)
		);
	}
}
