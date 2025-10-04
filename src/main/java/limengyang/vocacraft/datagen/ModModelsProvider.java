package limengyang.vocacraft.datagen;

import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.blocks.custom.ModCrops.MandarinBush;
import limengyang.vocacraft.blocks.custom.ModCrops.ScallionCrops;
import limengyang.vocacraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //添加方块模型
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.SCALLION_CROP, BlockStateModelGenerator.TintType.NOT_TINTED, ScallionCrops.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.MANDARIN_CROP, BlockStateModelGenerator.TintType.NOT_TINTED, MandarinBush.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MIKU_DOLL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TETO_DOLL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RIN_DOLL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DEFAULT_DOLL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DISC_STACK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //添加物品模型
        itemModelGenerator.register(ModItems.SCALLION, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANDARIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRENCH_BREAD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLANK_DISC, Models.GENERATED);
    }
}
