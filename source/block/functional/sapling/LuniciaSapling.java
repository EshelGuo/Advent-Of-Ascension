package net.tslat.aoa3.block.functional.sapling;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.tslat.aoa3.block.decoration.sapling.SaplingBlock;
import net.tslat.aoa3.worldgen.trees.BloodtwisterTreeGenerator;
import net.tslat.aoa3.worldgen.trees.LuniciaTreeGenerator;
import net.tslat.aoa3.worldgen.trees.TreeGenerator;

import java.util.Random;

public class LuniciaSapling extends SaplingBlock {
	public LuniciaSapling() {
		super(MaterialColor.FOLIAGE, true);
	}

	@Override
	protected TreeGenerator getTree(ServerWorld world, BlockPos pos, BlockState groundBlock, Random rand) {
		return new LuniciaTreeGenerator(this);
	}
}
