package net.tslat.aoa3.worldgen.structures.haven;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class YellowHavenTree extends AoAStructure { //StructureSize: 10x18x10
	private static final BlockState yellowLeaves = AoABlocks.YELLOW_HAVEN_LEAVES.get().getDefaultState();
	private static final BlockState log = Blocks.OAK_LOG.getDefaultState();

	public YellowHavenTree() {
		super("YellowHavenTree");
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 4, 0, 4, log);
		addBlock(world, basePos, 4, 0, 5, log);
		addBlock(world, basePos, 5, 0, 4, log);
		addBlock(world, basePos, 5, 0, 5, log);
		addBlock(world, basePos, 4, 1, 4, log);
		addBlock(world, basePos, 4, 1, 5, log);
		addBlock(world, basePos, 5, 1, 4, log);
		addBlock(world, basePos, 5, 1, 5, log);
		addBlock(world, basePos, 4, 2, 4, log);
		addBlock(world, basePos, 4, 2, 5, log);
		addBlock(world, basePos, 5, 2, 4, log);
		addBlock(world, basePos, 5, 2, 5, log);
		addBlock(world, basePos, 4, 3, 4, log);
		addBlock(world, basePos, 4, 3, 5, log);
		addBlock(world, basePos, 5, 3, 4, log);
		addBlock(world, basePos, 5, 3, 5, log);
		addBlock(world, basePos, 3, 4, 4, yellowLeaves);
		addBlock(world, basePos, 3, 4, 5, yellowLeaves);
		addBlock(world, basePos, 4, 4, 3, yellowLeaves);
		addBlock(world, basePos, 4, 4, 4, log);
		addBlock(world, basePos, 4, 4, 5, log);
		addBlock(world, basePos, 4, 4, 6, yellowLeaves);
		addBlock(world, basePos, 5, 4, 3, yellowLeaves);
		addBlock(world, basePos, 5, 4, 4, log);
		addBlock(world, basePos, 5, 4, 5, log);
		addBlock(world, basePos, 5, 4, 6, yellowLeaves);
		addBlock(world, basePos, 6, 4, 4, yellowLeaves);
		addBlock(world, basePos, 6, 4, 5, yellowLeaves);
		addBlock(world, basePos, 0, 5, 2, yellowLeaves);
		addBlock(world, basePos, 0, 5, 3, yellowLeaves);
		addBlock(world, basePos, 0, 5, 4, yellowLeaves);
		addBlock(world, basePos, 0, 5, 5, yellowLeaves);
		addBlock(world, basePos, 0, 5, 6, yellowLeaves);
		addBlock(world, basePos, 0, 5, 7, yellowLeaves);
		addBlock(world, basePos, 1, 5, 1, yellowLeaves);
		addBlock(world, basePos, 1, 5, 2, yellowLeaves);
		addBlock(world, basePos, 1, 5, 3, yellowLeaves);
		addBlock(world, basePos, 1, 5, 4, yellowLeaves);
		addBlock(world, basePos, 1, 5, 5, yellowLeaves);
		addBlock(world, basePos, 1, 5, 6, yellowLeaves);
		addBlock(world, basePos, 1, 5, 7, yellowLeaves);
		addBlock(world, basePos, 1, 5, 8, yellowLeaves);
		addBlock(world, basePos, 2, 5, 0, yellowLeaves);
		addBlock(world, basePos, 2, 5, 1, yellowLeaves);
		addBlock(world, basePos, 2, 5, 2, yellowLeaves);
		addBlock(world, basePos, 2, 5, 3, yellowLeaves);
		addBlock(world, basePos, 2, 5, 4, yellowLeaves);
		addBlock(world, basePos, 2, 5, 5, yellowLeaves);
		addBlock(world, basePos, 2, 5, 6, yellowLeaves);
		addBlock(world, basePos, 2, 5, 7, yellowLeaves);
		addBlock(world, basePos, 2, 5, 8, yellowLeaves);
		addBlock(world, basePos, 2, 5, 9, yellowLeaves);
		addBlock(world, basePos, 3, 5, 0, yellowLeaves);
		addBlock(world, basePos, 3, 5, 1, yellowLeaves);
		addBlock(world, basePos, 3, 5, 2, yellowLeaves);
		addBlock(world, basePos, 3, 5, 3, yellowLeaves);
		addBlock(world, basePos, 3, 5, 4, yellowLeaves);
		addBlock(world, basePos, 3, 5, 5, yellowLeaves);
		addBlock(world, basePos, 3, 5, 6, yellowLeaves);
		addBlock(world, basePos, 3, 5, 7, yellowLeaves);
		addBlock(world, basePos, 3, 5, 8, yellowLeaves);
		addBlock(world, basePos, 3, 5, 9, yellowLeaves);
		addBlock(world, basePos, 4, 5, 0, yellowLeaves);
		addBlock(world, basePos, 4, 5, 1, yellowLeaves);
		addBlock(world, basePos, 4, 5, 2, yellowLeaves);
		addBlock(world, basePos, 4, 5, 3, yellowLeaves);
		addBlock(world, basePos, 4, 5, 4, log);
		addBlock(world, basePos, 4, 5, 5, log);
		addBlock(world, basePos, 4, 5, 6, yellowLeaves);
		addBlock(world, basePos, 4, 5, 7, yellowLeaves);
		addBlock(world, basePos, 4, 5, 8, yellowLeaves);
		addBlock(world, basePos, 4, 5, 9, yellowLeaves);
		addBlock(world, basePos, 5, 5, 0, yellowLeaves);
		addBlock(world, basePos, 5, 5, 1, yellowLeaves);
		addBlock(world, basePos, 5, 5, 2, yellowLeaves);
		addBlock(world, basePos, 5, 5, 3, yellowLeaves);
		addBlock(world, basePos, 5, 5, 4, log);
		addBlock(world, basePos, 5, 5, 5, log);
		addBlock(world, basePos, 5, 5, 6, yellowLeaves);
		addBlock(world, basePos, 5, 5, 7, yellowLeaves);
		addBlock(world, basePos, 5, 5, 8, yellowLeaves);
		addBlock(world, basePos, 5, 5, 9, yellowLeaves);
		addBlock(world, basePos, 6, 5, 0, yellowLeaves);
		addBlock(world, basePos, 6, 5, 1, yellowLeaves);
		addBlock(world, basePos, 6, 5, 2, yellowLeaves);
		addBlock(world, basePos, 6, 5, 3, yellowLeaves);
		addBlock(world, basePos, 6, 5, 4, yellowLeaves);
		addBlock(world, basePos, 6, 5, 5, yellowLeaves);
		addBlock(world, basePos, 6, 5, 6, yellowLeaves);
		addBlock(world, basePos, 6, 5, 7, yellowLeaves);
		addBlock(world, basePos, 6, 5, 8, yellowLeaves);
		addBlock(world, basePos, 6, 5, 9, yellowLeaves);
		addBlock(world, basePos, 7, 5, 0, yellowLeaves);
		addBlock(world, basePos, 7, 5, 1, yellowLeaves);
		addBlock(world, basePos, 7, 5, 2, yellowLeaves);
		addBlock(world, basePos, 7, 5, 3, yellowLeaves);
		addBlock(world, basePos, 7, 5, 4, yellowLeaves);
		addBlock(world, basePos, 7, 5, 5, yellowLeaves);
		addBlock(world, basePos, 7, 5, 6, yellowLeaves);
		addBlock(world, basePos, 7, 5, 7, yellowLeaves);
		addBlock(world, basePos, 7, 5, 8, yellowLeaves);
		addBlock(world, basePos, 7, 5, 9, yellowLeaves);
		addBlock(world, basePos, 8, 5, 1, yellowLeaves);
		addBlock(world, basePos, 8, 5, 2, yellowLeaves);
		addBlock(world, basePos, 8, 5, 3, yellowLeaves);
		addBlock(world, basePos, 8, 5, 4, yellowLeaves);
		addBlock(world, basePos, 8, 5, 5, yellowLeaves);
		addBlock(world, basePos, 8, 5, 6, yellowLeaves);
		addBlock(world, basePos, 8, 5, 7, yellowLeaves);
		addBlock(world, basePos, 8, 5, 8, yellowLeaves);
		addBlock(world, basePos, 9, 5, 2, yellowLeaves);
		addBlock(world, basePos, 9, 5, 3, yellowLeaves);
		addBlock(world, basePos, 9, 5, 4, yellowLeaves);
		addBlock(world, basePos, 9, 5, 5, yellowLeaves);
		addBlock(world, basePos, 9, 5, 6, yellowLeaves);
		addBlock(world, basePos, 9, 5, 7, yellowLeaves);
		addBlock(world, basePos, 3, 6, 3, yellowLeaves);
		addBlock(world, basePos, 3, 6, 4, yellowLeaves);
		addBlock(world, basePos, 3, 6, 5, yellowLeaves);
		addBlock(world, basePos, 3, 6, 6, yellowLeaves);
		addBlock(world, basePos, 4, 6, 3, yellowLeaves);
		addBlock(world, basePos, 4, 6, 4, log);
		addBlock(world, basePos, 4, 6, 5, log);
		addBlock(world, basePos, 4, 6, 6, yellowLeaves);
		addBlock(world, basePos, 5, 6, 3, yellowLeaves);
		addBlock(world, basePos, 5, 6, 4, log);
		addBlock(world, basePos, 5, 6, 5, log);
		addBlock(world, basePos, 5, 6, 6, yellowLeaves);
		addBlock(world, basePos, 6, 6, 3, yellowLeaves);
		addBlock(world, basePos, 6, 6, 4, yellowLeaves);
		addBlock(world, basePos, 6, 6, 5, yellowLeaves);
		addBlock(world, basePos, 6, 6, 6, yellowLeaves);
		addBlock(world, basePos, 4, 7, 4, log);
		addBlock(world, basePos, 4, 7, 5, log);
		addBlock(world, basePos, 5, 7, 4, log);
		addBlock(world, basePos, 5, 7, 5, log);
		addBlock(world, basePos, 3, 8, 4, yellowLeaves);
		addBlock(world, basePos, 3, 8, 5, yellowLeaves);
		addBlock(world, basePos, 4, 8, 3, yellowLeaves);
		addBlock(world, basePos, 4, 8, 4, log);
		addBlock(world, basePos, 4, 8, 5, log);
		addBlock(world, basePos, 4, 8, 6, yellowLeaves);
		addBlock(world, basePos, 5, 8, 3, yellowLeaves);
		addBlock(world, basePos, 5, 8, 4, log);
		addBlock(world, basePos, 5, 8, 5, log);
		addBlock(world, basePos, 5, 8, 6, yellowLeaves);
		addBlock(world, basePos, 6, 8, 4, yellowLeaves);
		addBlock(world, basePos, 6, 8, 5, yellowLeaves);
		addBlock(world, basePos, 1, 9, 3, yellowLeaves);
		addBlock(world, basePos, 1, 9, 4, yellowLeaves);
		addBlock(world, basePos, 1, 9, 5, yellowLeaves); 
		addBlock(world, basePos, 1, 9, 6, yellowLeaves); 
		addBlock(world, basePos, 2, 9, 2, yellowLeaves);
		addBlock(world, basePos, 2, 9, 3, yellowLeaves);
		addBlock(world, basePos, 2, 9, 4, yellowLeaves);
		addBlock(world, basePos, 2, 9, 5, yellowLeaves); 
		addBlock(world, basePos, 2, 9, 6, yellowLeaves); 
		addBlock(world, basePos, 2, 9, 7, yellowLeaves);
		addBlock(world, basePos, 3, 9, 1, yellowLeaves);
		addBlock(world, basePos, 3, 9, 2, yellowLeaves);
		addBlock(world, basePos, 3, 9, 3, yellowLeaves);
		addBlock(world, basePos, 3, 9, 4, yellowLeaves);
		addBlock(world, basePos, 3, 9, 5, yellowLeaves);
		addBlock(world, basePos, 3, 9, 6, yellowLeaves);
		addBlock(world, basePos, 3, 9, 7, yellowLeaves);
		addBlock(world, basePos, 3, 9, 8, yellowLeaves);
		addBlock(world, basePos, 4, 9, 1, yellowLeaves);
		addBlock(world, basePos, 4, 9, 2, yellowLeaves);
		addBlock(world, basePos, 4, 9, 3, yellowLeaves);
		addBlock(world, basePos, 4, 9, 4, log);
		addBlock(world, basePos, 4, 9, 5, log);
		addBlock(world, basePos, 4, 9, 6, yellowLeaves);
		addBlock(world, basePos, 4, 9, 7, yellowLeaves);
		addBlock(world, basePos, 4, 9, 8, yellowLeaves);
		addBlock(world, basePos, 5, 9, 1, yellowLeaves);
		addBlock(world, basePos, 5, 9, 2, yellowLeaves);
		addBlock(world, basePos, 5, 9, 3, yellowLeaves);
		addBlock(world, basePos, 5, 9, 4, log);
		addBlock(world, basePos, 5, 9, 5, log);
		addBlock(world, basePos, 5, 9, 6, yellowLeaves);
		addBlock(world, basePos, 5, 9, 7, yellowLeaves);
		addBlock(world, basePos, 5, 9, 8, yellowLeaves);
		addBlock(world, basePos, 6, 9, 1, yellowLeaves);
		addBlock(world, basePos, 6, 9, 2, yellowLeaves);
		addBlock(world, basePos, 6, 9, 3, yellowLeaves);
		addBlock(world, basePos, 6, 9, 4, yellowLeaves);
		addBlock(world, basePos, 6, 9, 5, yellowLeaves);
		addBlock(world, basePos, 6, 9, 6, yellowLeaves);
		addBlock(world, basePos, 6, 9, 7, yellowLeaves);
		addBlock(world, basePos, 6, 9, 8, yellowLeaves);
		addBlock(world, basePos, 7, 9, 2, yellowLeaves);
		addBlock(world, basePos, 7, 9, 3, yellowLeaves);
		addBlock(world, basePos, 7, 9, 4, yellowLeaves);
		addBlock(world, basePos, 7, 9, 5, yellowLeaves);
		addBlock(world, basePos, 7, 9, 6, yellowLeaves);
		addBlock(world, basePos, 7, 9, 7, yellowLeaves);
		addBlock(world, basePos, 8, 9, 3, yellowLeaves);
		addBlock(world, basePos, 8, 9, 4, yellowLeaves);
		addBlock(world, basePos, 8, 9, 5, yellowLeaves);
		addBlock(world, basePos, 8, 9, 6, yellowLeaves);
		addBlock(world, basePos, 3, 10, 3, yellowLeaves);
		addBlock(world, basePos, 3, 10, 4, yellowLeaves);
		addBlock(world, basePos, 3, 10, 5, yellowLeaves);
		addBlock(world, basePos, 3, 10, 6, yellowLeaves);
		addBlock(world, basePos, 4, 10, 3, yellowLeaves);
		addBlock(world, basePos, 4, 10, 4, log);
		addBlock(world, basePos, 4, 10, 5, log);
		addBlock(world, basePos, 4, 10, 6, yellowLeaves);
		addBlock(world, basePos, 5, 10, 3, yellowLeaves);
		addBlock(world, basePos, 5, 10, 4, log);
		addBlock(world, basePos, 5, 10, 5, log);
		addBlock(world, basePos, 5, 10, 6, yellowLeaves);
		addBlock(world, basePos, 6, 10, 3, yellowLeaves);
		addBlock(world, basePos, 6, 10, 4, yellowLeaves);
		addBlock(world, basePos, 6, 10, 5, yellowLeaves);
		addBlock(world, basePos, 6, 10, 6, yellowLeaves);
		addBlock(world, basePos, 4, 11, 4, log);
		addBlock(world, basePos, 4, 11, 5, log);
		addBlock(world, basePos, 5, 11, 4, log);
		addBlock(world, basePos, 5, 11, 5, log);
		addBlock(world, basePos, 3, 12, 4, yellowLeaves);
		addBlock(world, basePos, 3, 12, 5, yellowLeaves);
		addBlock(world, basePos, 4, 12, 3, yellowLeaves);
		addBlock(world, basePos, 4, 12, 4, log);
		addBlock(world, basePos, 4, 12, 5, log);
		addBlock(world, basePos, 4, 12, 6, yellowLeaves);
		addBlock(world, basePos, 5, 12, 3, yellowLeaves);
		addBlock(world, basePos, 5, 12, 4, log);
		addBlock(world, basePos, 5, 12, 5, log);
		addBlock(world, basePos, 5, 12, 6, yellowLeaves);
		addBlock(world, basePos, 6, 12, 4, yellowLeaves);
		addBlock(world, basePos, 6, 12, 5, yellowLeaves);
		addBlock(world, basePos, 0, 13, 2, yellowLeaves);
		addBlock(world, basePos, 0, 13, 3, yellowLeaves);
		addBlock(world, basePos, 0, 13, 4, yellowLeaves);
		addBlock(world, basePos, 0, 13, 5, yellowLeaves);
		addBlock(world, basePos, 0, 13, 6, yellowLeaves);
		addBlock(world, basePos, 0, 13, 7, yellowLeaves);
		addBlock(world, basePos, 1, 13, 1, yellowLeaves);
		addBlock(world, basePos, 1, 13, 2, yellowLeaves);
		addBlock(world, basePos, 1, 13, 3, yellowLeaves);
		addBlock(world, basePos, 1, 13, 4, yellowLeaves);
		addBlock(world, basePos, 1, 13, 5, yellowLeaves);
		addBlock(world, basePos, 1, 13, 6, yellowLeaves);
		addBlock(world, basePos, 1, 13, 7, yellowLeaves);
		addBlock(world, basePos, 1, 13, 8, yellowLeaves);
		addBlock(world, basePos, 2, 13, 0, yellowLeaves);
		addBlock(world, basePos, 2, 13, 1, yellowLeaves);
		addBlock(world, basePos, 2, 13, 2, yellowLeaves);
		addBlock(world, basePos, 2, 13, 3, yellowLeaves);
		addBlock(world, basePos, 2, 13, 4, yellowLeaves);
		addBlock(world, basePos, 2, 13, 5, yellowLeaves);
		addBlock(world, basePos, 2, 13, 6, yellowLeaves);
		addBlock(world, basePos, 2, 13, 7, yellowLeaves);
		addBlock(world, basePos, 2, 13, 8, yellowLeaves);
		addBlock(world, basePos, 2, 13, 9, yellowLeaves);
		addBlock(world, basePos, 3, 13, 0, yellowLeaves);
		addBlock(world, basePos, 3, 13, 1, yellowLeaves);
		addBlock(world, basePos, 3, 13, 2, yellowLeaves);
		addBlock(world, basePos, 3, 13, 3, yellowLeaves);
		addBlock(world, basePos, 3, 13, 4, yellowLeaves);
		addBlock(world, basePos, 3, 13, 5, yellowLeaves);
		addBlock(world, basePos, 3, 13, 6, yellowLeaves);
		addBlock(world, basePos, 3, 13, 7, yellowLeaves);
		addBlock(world, basePos, 3, 13, 8, yellowLeaves);
		addBlock(world, basePos, 3, 13, 9, yellowLeaves);
		addBlock(world, basePos, 4, 13, 0, yellowLeaves);
		addBlock(world, basePos, 4, 13, 1, yellowLeaves);
		addBlock(world, basePos, 4, 13, 2, yellowLeaves);
		addBlock(world, basePos, 4, 13, 3, yellowLeaves);
		addBlock(world, basePos, 4, 13, 4, yellowLeaves);
		addBlock(world, basePos, 4, 13, 5, yellowLeaves);
		addBlock(world, basePos, 4, 13, 6, yellowLeaves);
		addBlock(world, basePos, 4, 13, 7, yellowLeaves);
		addBlock(world, basePos, 4, 13, 8, yellowLeaves);
		addBlock(world, basePos, 4, 13, 9, yellowLeaves);
		addBlock(world, basePos, 5, 13, 0, yellowLeaves);
		addBlock(world, basePos, 5, 13, 1, yellowLeaves);
		addBlock(world, basePos, 5, 13, 2, yellowLeaves);
		addBlock(world, basePos, 5, 13, 3, yellowLeaves);
		addBlock(world, basePos, 5, 13, 4, yellowLeaves);
		addBlock(world, basePos, 5, 13, 5, yellowLeaves);
		addBlock(world, basePos, 5, 13, 6, yellowLeaves);
		addBlock(world, basePos, 5, 13, 7, yellowLeaves);
		addBlock(world, basePos, 5, 13, 8, yellowLeaves);
		addBlock(world, basePos, 5, 13, 9, yellowLeaves);
		addBlock(world, basePos, 6, 13, 0, yellowLeaves);
		addBlock(world, basePos, 6, 13, 1, yellowLeaves);
		addBlock(world, basePos, 6, 13, 2, yellowLeaves);
		addBlock(world, basePos, 6, 13, 3, yellowLeaves);
		addBlock(world, basePos, 6, 13, 4, yellowLeaves);
		addBlock(world, basePos, 6, 13, 5, yellowLeaves);
		addBlock(world, basePos, 6, 13, 6, yellowLeaves);
		addBlock(world, basePos, 6, 13, 7, yellowLeaves);
		addBlock(world, basePos, 6, 13, 8, yellowLeaves);
		addBlock(world, basePos, 6, 13, 9, yellowLeaves);
		addBlock(world, basePos, 7, 13, 0, yellowLeaves);
		addBlock(world, basePos, 7, 13, 1, yellowLeaves);
		addBlock(world, basePos, 7, 13, 2, yellowLeaves);
		addBlock(world, basePos, 7, 13, 3, yellowLeaves);
		addBlock(world, basePos, 7, 13, 4, yellowLeaves);
		addBlock(world, basePos, 7, 13, 5, yellowLeaves);
		addBlock(world, basePos, 7, 13, 6, yellowLeaves);
		addBlock(world, basePos, 7, 13, 7, yellowLeaves);
		addBlock(world, basePos, 7, 13, 8, yellowLeaves);
		addBlock(world, basePos, 7, 13, 9, yellowLeaves);
		addBlock(world, basePos, 8, 13, 1, yellowLeaves);
		addBlock(world, basePos, 8, 13, 2, yellowLeaves);
		addBlock(world, basePos, 8, 13, 3, yellowLeaves);
		addBlock(world, basePos, 8, 13, 4, yellowLeaves);
		addBlock(world, basePos, 8, 13, 5, yellowLeaves);
		addBlock(world, basePos, 8, 13, 6, yellowLeaves);
		addBlock(world, basePos, 8, 13, 7, yellowLeaves);
		addBlock(world, basePos, 8, 13, 8, yellowLeaves);
		addBlock(world, basePos, 9, 13, 2, yellowLeaves);
		addBlock(world, basePos, 9, 13, 3, yellowLeaves);
		addBlock(world, basePos, 9, 13, 4, yellowLeaves);
		addBlock(world, basePos, 9, 13, 5, yellowLeaves);
		addBlock(world, basePos, 9, 13, 6, yellowLeaves);
		addBlock(world, basePos, 9, 13, 7, yellowLeaves);
		addBlock(world, basePos, 1, 14, 2, yellowLeaves);
		addBlock(world, basePos, 1, 14, 3, yellowLeaves);
		addBlock(world, basePos, 1, 14, 4, yellowLeaves);
		addBlock(world, basePos, 1, 14, 5, yellowLeaves);
		addBlock(world, basePos, 1, 14, 6, yellowLeaves);
		addBlock(world, basePos, 1, 14, 7, yellowLeaves);
		addBlock(world, basePos, 2, 14, 1, yellowLeaves);
		addBlock(world, basePos, 2, 14, 2, yellowLeaves);
		addBlock(world, basePos, 2, 14, 3, yellowLeaves);
		addBlock(world, basePos, 2, 14, 4, yellowLeaves);
		addBlock(world, basePos, 2, 14, 5, yellowLeaves);
		addBlock(world, basePos, 2, 14, 6, yellowLeaves);
		addBlock(world, basePos, 2, 14, 7, yellowLeaves);
		addBlock(world, basePos, 2, 14, 8, yellowLeaves);
		addBlock(world, basePos, 3, 14, 1, yellowLeaves);
		addBlock(world, basePos, 3, 14, 2, yellowLeaves);
		addBlock(world, basePos, 3, 14, 3, yellowLeaves);
		addBlock(world, basePos, 3, 14, 4, yellowLeaves);
		addBlock(world, basePos, 3, 14, 5, yellowLeaves);
		addBlock(world, basePos, 3, 14, 6, yellowLeaves);
		addBlock(world, basePos, 3, 14, 7, yellowLeaves);
		addBlock(world, basePos, 3, 14, 8, yellowLeaves);
		addBlock(world, basePos, 4, 14, 1, yellowLeaves);
		addBlock(world, basePos, 4, 14, 2, yellowLeaves);
		addBlock(world, basePos, 4, 14, 3, yellowLeaves);
		addBlock(world, basePos, 4, 14, 4, yellowLeaves);
		addBlock(world, basePos, 4, 14, 5, yellowLeaves);
		addBlock(world, basePos, 4, 14, 6, yellowLeaves);
		addBlock(world, basePos, 4, 14, 7, yellowLeaves);
		addBlock(world, basePos, 4, 14, 8, yellowLeaves);
		addBlock(world, basePos, 5, 14, 1, yellowLeaves);
		addBlock(world, basePos, 5, 14, 2, yellowLeaves);
		addBlock(world, basePos, 5, 14, 3, yellowLeaves);
		addBlock(world, basePos, 5, 14, 4, yellowLeaves);
		addBlock(world, basePos, 5, 14, 5, yellowLeaves);
		addBlock(world, basePos, 5, 14, 6, yellowLeaves);
		addBlock(world, basePos, 5, 14, 7, yellowLeaves);
		addBlock(world, basePos, 5, 14, 8, yellowLeaves);
		addBlock(world, basePos, 6, 14, 1, yellowLeaves);
		addBlock(world, basePos, 6, 14, 2, yellowLeaves);
		addBlock(world, basePos, 6, 14, 3, yellowLeaves);
		addBlock(world, basePos, 6, 14, 4, yellowLeaves);
		addBlock(world, basePos, 6, 14, 5, yellowLeaves);
		addBlock(world, basePos, 6, 14, 6, yellowLeaves);
		addBlock(world, basePos, 6, 14, 7, yellowLeaves);
		addBlock(world, basePos, 6, 14, 8, yellowLeaves);
		addBlock(world, basePos, 7, 14, 1, yellowLeaves);
		addBlock(world, basePos, 7, 14, 2, yellowLeaves);
		addBlock(world, basePos, 7, 14, 3, yellowLeaves);
		addBlock(world, basePos, 7, 14, 4, yellowLeaves);
		addBlock(world, basePos, 7, 14, 5, yellowLeaves);
		addBlock(world, basePos, 7, 14, 6, yellowLeaves);
		addBlock(world, basePos, 7, 14, 7, yellowLeaves);
		addBlock(world, basePos, 7, 14, 8, yellowLeaves);
		addBlock(world, basePos, 8, 14, 2, yellowLeaves);
		addBlock(world, basePos, 8, 14, 3, yellowLeaves);
		addBlock(world, basePos, 8, 14, 4, yellowLeaves);
		addBlock(world, basePos, 8, 14, 5, yellowLeaves);
		addBlock(world, basePos, 8, 14, 6, yellowLeaves);
		addBlock(world, basePos, 8, 14, 7, yellowLeaves);
		addBlock(world, basePos, 2, 15, 3, yellowLeaves);
		addBlock(world, basePos, 2, 15, 4, yellowLeaves);
		addBlock(world, basePos, 2, 15, 5, yellowLeaves);
		addBlock(world, basePos, 2, 15, 6, yellowLeaves);
		addBlock(world, basePos, 3, 15, 2, yellowLeaves);
		addBlock(world, basePos, 3, 15, 3, yellowLeaves);
		addBlock(world, basePos, 3, 15, 4, yellowLeaves);
		addBlock(world, basePos, 3, 15, 5, yellowLeaves);
		addBlock(world, basePos, 3, 15, 6, yellowLeaves);
		addBlock(world, basePos, 3, 15, 7, yellowLeaves);
		addBlock(world, basePos, 4, 15, 2, yellowLeaves);
		addBlock(world, basePos, 4, 15, 3, yellowLeaves);
		addBlock(world, basePos, 4, 15, 4, yellowLeaves);
		addBlock(world, basePos, 4, 15, 5, yellowLeaves);
		addBlock(world, basePos, 4, 15, 6, yellowLeaves);
		addBlock(world, basePos, 4, 15, 7, yellowLeaves);
		addBlock(world, basePos, 5, 15, 2, yellowLeaves);
		addBlock(world, basePos, 5, 15, 3, yellowLeaves);
		addBlock(world, basePos, 5, 15, 4, yellowLeaves);
		addBlock(world, basePos, 5, 15, 5, yellowLeaves);
		addBlock(world, basePos, 5, 15, 6, yellowLeaves);
		addBlock(world, basePos, 5, 15, 7, yellowLeaves);
		addBlock(world, basePos, 6, 15, 2, yellowLeaves);
		addBlock(world, basePos, 6, 15, 3, yellowLeaves);
		addBlock(world, basePos, 6, 15, 4, yellowLeaves);
		addBlock(world, basePos, 6, 15, 5, yellowLeaves);
		addBlock(world, basePos, 6, 15, 6, yellowLeaves);
		addBlock(world, basePos, 6, 15, 7, yellowLeaves);
		addBlock(world, basePos, 7, 15, 3, yellowLeaves);
		addBlock(world, basePos, 7, 15, 4, yellowLeaves);
		addBlock(world, basePos, 7, 15, 5, yellowLeaves);
		addBlock(world, basePos, 7, 15, 6, yellowLeaves);
		addBlock(world, basePos, 3, 16, 3, yellowLeaves);
		addBlock(world, basePos, 3, 16, 4, yellowLeaves);
		addBlock(world, basePos, 3, 16, 5, yellowLeaves);
		addBlock(world, basePos, 3, 16, 6, yellowLeaves);
		addBlock(world, basePos, 4, 16, 3, yellowLeaves);
		addBlock(world, basePos, 4, 16, 4, yellowLeaves);
		addBlock(world, basePos, 4, 16, 5, yellowLeaves);
		addBlock(world, basePos, 4, 16, 6, yellowLeaves);
		addBlock(world, basePos, 5, 16, 3, yellowLeaves);
		addBlock(world, basePos, 5, 16, 4, yellowLeaves);
		addBlock(world, basePos, 5, 16, 5, yellowLeaves);
		addBlock(world, basePos, 5, 16, 6, yellowLeaves);
		addBlock(world, basePos, 6, 16, 3, yellowLeaves);
		addBlock(world, basePos, 6, 16, 4, yellowLeaves);
		addBlock(world, basePos, 6, 16, 5, yellowLeaves);
		addBlock(world, basePos, 6, 16, 6, yellowLeaves);
		addBlock(world, basePos, 4, 17, 4, yellowLeaves);
		addBlock(world, basePos, 4, 17, 5, yellowLeaves);
		addBlock(world, basePos, 5, 17, 4, yellowLeaves);
		addBlock(world, basePos, 5, 17, 5, yellowLeaves);
	}
}
