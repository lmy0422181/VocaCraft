package limengyang.vocacraft.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class DollBlock extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
//碰撞箱
    public static final VoxelShape SHAPE_N = VoxelShapes.combineAndSimplify(Block.createCuboidShape(2.5000000000000018, 0, 5.599999999999996, 13.500000000000004, 2.5, 11.999999999999996), Block.createCuboidShape(2.5000000000000018, 2.5, 7.5, 13.5, 12, 12), BooleanBiFunction.OR);
    public static final VoxelShape SHAPE_W = VoxelShapes.combineAndSimplify(Block.createCuboidShape(5.599999999999996, 0, 2.4999999999999964, 11.999999999999996, 2.5, 13.499999999999998), Block.createCuboidShape(7.5, 2.5, 2.5, 12, 12, 13.499999999999998), BooleanBiFunction.OR);
    public static final VoxelShape SHAPE_S = VoxelShapes.combineAndSimplify(Block.createCuboidShape(2.4999999999999964, 0, 4.0000000000000036, 13.499999999999998, 2.5, 10.400000000000004), Block.createCuboidShape(2.5, 2.5, 4, 13.499999999999998, 12, 8.5), BooleanBiFunction.OR);
    public static final VoxelShape SHAPE_E = VoxelShapes.combineAndSimplify(Block.createCuboidShape(4.0000000000000036, 0, 2.5000000000000018, 10.400000000000004, 2.5, 13.500000000000004), Block.createCuboidShape(4, 2.5, 2.5000000000000018, 8.5, 12, 13.5), BooleanBiFunction.OR);
    public DollBlock(Settings settings) {
        super(settings);
        //默认北方
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH));
    }
//判断朝向
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case SOUTH -> SHAPE_S;
            case NORTH -> SHAPE_N;
            case EAST -> SHAPE_E;
            default -> SHAPE_W;
        };
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
}