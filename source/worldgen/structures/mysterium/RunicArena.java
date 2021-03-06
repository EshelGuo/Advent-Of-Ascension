package net.tslat.aoa3.worldgen.structures.mysterium;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class RunicArena extends AoAStructure { //StructureSize: 15x3x15
	private static final BlockState orangeMushroomOutside = AoABlocks.ORANGE_MUSHROOM_BLOCK.get().getDefaultState();
	private static final BlockState orangeMushroomInside = AoABlocks.ORANGE_MUSHROOM_BLOCK.get().getDefaultState().with(HugeMushroomBlock.NORTH, false).with(HugeMushroomBlock.SOUTH, false).with(HugeMushroomBlock.EAST, false).with(HugeMushroomBlock.WEST, false).with(HugeMushroomBlock.UP, false).with(HugeMushroomBlock.DOWN, false);
	private static final BlockState runicSpawner = Blocks.SPAWNER.getDefaultState();
	private static final BlockState runicBlock = AoABlocks.RUNIC_BLOCK.get().getDefaultState();
	private static final BlockState ironBars = Blocks.IRON_BARS.getDefaultState();

	public RunicArena() {
		super("RunicArena");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 1, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 2, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 3, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 4, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 5, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 6, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 7, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 8, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 9, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 10, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 11, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 12, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 13, orangeMushroomOutside);
		addBlock(world, basePos, 0, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 1, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 1, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 4, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 7, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 10, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 1, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 2, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 2, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 4, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 7, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 10, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 2, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 3, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 3, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 4, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 7, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 10, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 3, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 4, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 4, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 4, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 4, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 4, 0, 4, orangeMushroomOutside);
		addBlock(world, basePos, 4, 0, 5, orangeMushroomOutside);
		addBlock(world, basePos, 4, 0, 6, orangeMushroomOutside);
		addBlock(world, basePos, 4, 0, 7, orangeMushroomOutside);
		addBlock(world, basePos, 4, 0, 8, orangeMushroomOutside);
		addBlock(world, basePos, 4, 0, 9, orangeMushroomOutside);
		addBlock(world, basePos, 4, 0, 10, orangeMushroomOutside);
		addBlock(world, basePos, 4, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 4, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 4, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 4, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 5, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 5, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 4, orangeMushroomOutside);
		addBlock(world, basePos, 5, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 7, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 10, orangeMushroomOutside);
		addBlock(world, basePos, 5, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 5, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 6, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 6, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 4, orangeMushroomOutside);
		addBlock(world, basePos, 6, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 7, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 10, orangeMushroomOutside);
		addBlock(world, basePos, 6, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 6, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 7, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 7, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 7, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 7, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 7, 0, 4, orangeMushroomOutside);
		addBlock(world, basePos, 7, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 7, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 7, 0, 7, orangeMushroomOutside);
		addBlock(world, basePos, 7, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 7, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 7, 0, 10, orangeMushroomOutside);
		addBlock(world, basePos, 7, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 7, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 7, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 7, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 8, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 8, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 4, orangeMushroomOutside);
		addBlock(world, basePos, 8, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 7, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 10, orangeMushroomOutside);
		addBlock(world, basePos, 8, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 8, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 9, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 9, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 4, orangeMushroomOutside);
		addBlock(world, basePos, 9, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 7, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 10, orangeMushroomOutside);
		addBlock(world, basePos, 9, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 9, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 10, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 10, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 10, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 10, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 10, 0, 4, orangeMushroomOutside);
		addBlock(world, basePos, 10, 0, 5, orangeMushroomOutside);
		addBlock(world, basePos, 10, 0, 6, orangeMushroomOutside);
		addBlock(world, basePos, 10, 0, 7, orangeMushroomOutside);
		addBlock(world, basePos, 10, 0, 8, orangeMushroomOutside);
		addBlock(world, basePos, 10, 0, 9, orangeMushroomOutside);
		addBlock(world, basePos, 10, 0, 10, orangeMushroomOutside);
		addBlock(world, basePos, 10, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 10, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 10, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 10, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 11, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 11, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 4, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 7, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 10, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 11, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 12, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 12, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 4, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 7, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 10, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 12, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 13, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 13, 0, 1, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 2, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 3, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 4, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 5, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 6, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 7, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 8, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 9, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 10, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 11, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 12, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 13, orangeMushroomInside);
		addBlock(world, basePos, 13, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 0, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 1, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 2, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 3, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 4, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 5, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 6, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 7, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 8, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 9, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 10, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 11, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 12, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 13, orangeMushroomOutside);
		addBlock(world, basePos, 14, 0, 14, orangeMushroomOutside);
		addBlock(world, basePos, 0, 1, 0, orangeMushroomOutside);
		addBlock(world, basePos, 0, 1, 1, ironBars);
		addBlock(world, basePos, 0, 1, 2, ironBars);
		addBlock(world, basePos, 0, 1, 3, ironBars);
		addBlock(world, basePos, 0, 1, 4, ironBars);
		addBlock(world, basePos, 0, 1, 5, ironBars);
		addBlock(world, basePos, 0, 1, 6, ironBars);
		addBlock(world, basePos, 0, 1, 7, ironBars);
		addBlock(world, basePos, 0, 1, 8, ironBars);
		addBlock(world, basePos, 0, 1, 9, ironBars);
		addBlock(world, basePos, 0, 1, 10, ironBars);
		addBlock(world, basePos, 0, 1, 11, ironBars);
		addBlock(world, basePos, 0, 1, 12, ironBars);
		addBlock(world, basePos, 0, 1, 13, ironBars);
		addBlock(world, basePos, 0, 1, 14, orangeMushroomOutside);
		addBlock(world, basePos, 1, 1, 0, ironBars);
		addBlock(world, basePos, 1, 1, 14, ironBars);
		addBlock(world, basePos, 2, 1, 0, ironBars);
		addBlock(world, basePos, 2, 1, 14, ironBars);
		addBlock(world, basePos, 3, 1, 0, ironBars);
		addBlock(world, basePos, 3, 1, 14, ironBars);
		addBlock(world, basePos, 4, 1, 0, ironBars);
		addBlock(world, basePos, 4, 1, 10, orangeMushroomOutside);
		addBlock(world, basePos, 4, 1, 14, ironBars);
		addBlock(world, basePos, 5, 1, 0, ironBars);
		addBlock(world, basePos, 5, 1, 14, ironBars);
		addBlock(world, basePos, 6, 1, 0, ironBars);
		addBlock(world, basePos, 6, 1, 14, ironBars);
		addBlock(world, basePos, 7, 1, 0, ironBars);
		addBlock(world, basePos, 7, 1, 7, orangeMushroomOutside);
		addBlock(world, basePos, 7, 1, 14, ironBars);
		addBlock(world, basePos, 8, 1, 0, ironBars);
		addBlock(world, basePos, 8, 1, 14, ironBars);
		addBlock(world, basePos, 9, 1, 0, ironBars);
		addBlock(world, basePos, 9, 1, 14, ironBars);
		addBlock(world, basePos, 10, 1, 0, ironBars);
		addBlock(world, basePos, 10, 1, 4, orangeMushroomOutside);
		addBlock(world, basePos, 10, 1, 14, ironBars);
		addBlock(world, basePos, 11, 1, 0, ironBars);
		addBlock(world, basePos, 11, 1, 14, ironBars);
		addBlock(world, basePos, 12, 1, 0, ironBars);
		addBlock(world, basePos, 12, 1, 14, ironBars);
		addBlock(world, basePos, 13, 1, 0, ironBars);
		addBlock(world, basePos, 13, 1, 14, ironBars);
		addBlock(world, basePos, 14, 1, 0, orangeMushroomOutside);
		addBlock(world, basePos, 14, 1, 1, ironBars);
		addBlock(world, basePos, 14, 1, 2, ironBars);
		addBlock(world, basePos, 14, 1, 3, ironBars);
		addBlock(world, basePos, 14, 1, 4, ironBars);
		addBlock(world, basePos, 14, 1, 5, ironBars);
		addBlock(world, basePos, 14, 1, 6, ironBars);
		addBlock(world, basePos, 14, 1, 7, ironBars);
		addBlock(world, basePos, 14, 1, 8, ironBars);
		addBlock(world, basePos, 14, 1, 9, ironBars);
		addBlock(world, basePos, 14, 1, 10, ironBars);
		addBlock(world, basePos, 14, 1, 11, ironBars);
		addBlock(world, basePos, 14, 1, 12, ironBars);
		addBlock(world, basePos, 14, 1, 13, ironBars);
		addBlock(world, basePos, 14, 1, 14, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 1, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 2, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 3, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 4, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 5, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 6, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 7, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 8, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 9, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 10, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 11, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 12, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 13, orangeMushroomOutside);
		addBlock(world, basePos, 0, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 1, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 1, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 2, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 2, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 3, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 3, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 4, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 4, 2, 10, runicSpawner);
		addBlock(world, basePos, 4, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 5, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 5, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 6, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 6, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 7, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 7, 2, 7, runicBlock);
		addBlock(world, basePos, 7, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 8, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 8, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 9, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 9, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 10, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 10, 2, 4, runicSpawner);
		addBlock(world, basePos, 10, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 11, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 11, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 12, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 12, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 13, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 13, 2, 14, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 0, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 1, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 2, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 3, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 4, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 5, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 6, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 7, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 8, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 9, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 10, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 11, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 12, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 13, orangeMushroomOutside);
		addBlock(world, basePos, 14, 2, 14, orangeMushroomOutside);
	}

	@Override
	protected void doPostBuildOps(IWorld world, Random rand, BlockPos basePos) {
		initSpawner(world, basePos.add(4, 2, 10), AoAEntities.Mobs.RUNIC_GOLEM.get());
		initSpawner(world, basePos.add(10, 2, 4), AoAEntities.Mobs.RUNIC_GOLEM.get());
	}
}
