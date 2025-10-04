package limengyang.vocacraft.datagen;

import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.blocks.custom.ModCrops.ScallionCrops;
import limengyang.vocacraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //添加掉落
        addDrop(ModBlocks.DEFAULT_DOLL);
        addDrop(ModBlocks.MIKU_DOLL);
        addDrop(ModBlocks.TETO_DOLL);
        addDrop(ModBlocks.RIN_DOLL);
        addDrop(ModBlocks.DISC_STACK);
        LootCondition.Builder builder =
                BlockStatePropertyLootCondition.builder(ModBlocks.SCALLION_CROP)
                        .properties(StatePredicate.Builder.create().exactMatch(ScallionCrops.AGE, 7));
                addDrop(ModBlocks.SCALLION_CROP, cropDrops(ModBlocks.SCALLION_CROP, ModItems.SCALLION, ModItems.SCALLION_SEED, builder));
        addDrop(ModBlocks.MANDARIN_CROP, ModItems.MANDARIN_SEED);
    }
}
