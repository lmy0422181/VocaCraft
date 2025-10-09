package limengyang.vocacraft;

import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.items.ModItems;
import limengyang.vocacraft.items.custom.StarWandItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class VocaCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEEK_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANDARIN_CROP, RenderLayer.getCutout());
	    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VOCA_CRYSTAL_CLUSTER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LARGE_VOCA_CRYSTAL_BUD, RenderLayer.getCutout());
	    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MEDIUM_VOCA_CRYSTAL_BUD, RenderLayer.getCutout());
	    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SMALL_VOCA_CRYSTAL_BUD, RenderLayer.getCutout());
    }
}