package net.tslat.aoa3.block.generation.misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.tslat.aoa3.block.WaterloggableBlock;

public class ShroomTop extends WaterloggableBlock {
	private static final VoxelShape BOTTOM_SHAPE = makeCuboidShape(5, 0, 5, 11, 6, 11);
	private static final VoxelShape TOP_SHAPE = makeCuboidShape(0, 6, 0, 16, 16, 16);
	private static final VoxelShape SHAPE = VoxelShapes.or(BOTTOM_SHAPE, TOP_SHAPE);

	public ShroomTop(Block.Properties properties) {
		super(properties);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}
}
