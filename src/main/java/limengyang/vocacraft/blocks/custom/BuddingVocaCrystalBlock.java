package limengyang.vocacraft.blocks.custom;

import limengyang.vocacraft.blocks.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingVocaCrystalBlock extends BuddingAmethystBlock {
	public static final int GROW_CHANCE = 5;
	private static final Direction[] DIRECTIONS = Direction.values();

	public BuddingVocaCrystalBlock(Settings settings) {
		super(settings);
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if (random.nextInt(5) == 0) {
			Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
			BlockPos blockPos = pos.offset(direction);
			BlockState blockState = world.getBlockState(blockPos);
			Block block = null;
			if (canGrowIn(blockState)) {
				block = ModBlocks.SMALL_VOCA_CRYSTAL_BUD;
			} else if (blockState.isOf(ModBlocks.SMALL_VOCA_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
				block = ModBlocks.MEDIUM_VOCA_CRYSTAL_BUD;
			} else if (blockState.isOf(ModBlocks.MEDIUM_VOCA_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
				block = ModBlocks.LARGE_VOCA_CRYSTAL_BUD;
			} else if (blockState.isOf(ModBlocks.LARGE_VOCA_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
				block = ModBlocks.VOCA_CRYSTAL_CLUSTER;
			}

			if (block != null) {
				BlockState blockState2 = block.getDefaultState()
						.with(AmethystClusterBlock.FACING, direction)
						.with(AmethystClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
				world.setBlockState(blockPos, blockState2);
			}
		}
	}
}
