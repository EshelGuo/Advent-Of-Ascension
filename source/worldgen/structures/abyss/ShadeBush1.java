package net.tslat.aoa3.worldgen.structures.abyss;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class ShadeBush1 extends AoAStructure { //StructureSize: 1x2x3
	private static final BlockState shadowLeaves = AoABlocks.SHADOW_LEAVES.get().getDefaultState();

	public ShadeBush1() {
		super("ShadeBush1");
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, shadowLeaves);
		addBlock(world, basePos, 0, 0, 2, shadowLeaves);
		addBlock(world, basePos, 0, 1, 0, shadowLeaves);
		addBlock(world, basePos, 0, 1, 1, shadowLeaves);
		addBlock(world, basePos, 0, 1, 2, shadowLeaves);
	}
}
