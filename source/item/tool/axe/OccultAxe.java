package net.tslat.aoa3.item.tool.axe;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.tslat.aoa3.util.ItemUtil;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.WorldUtil;

import javax.annotation.Nullable;
import java.util.List;

public class OccultAxe extends BaseAxe {
	public OccultAxe() {
		super(ItemUtil.customItemTier(3000, 11.0f, 6.0f, 6, 10, null));
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entity) {
		if (entity instanceof PlayerEntity && state.isIn(BlockTags.LOGS)) {
			BlockPos breakPos = pos;
			Block originBlock = state.getBlock();
			ItemStack toolStack = entity.getHeldItem(Hand.MAIN_HAND);

			while (world.getBlockState(breakPos = breakPos.up()).getBlock() == originBlock && !toolStack.isEmpty()) {
				WorldUtil.harvestAdditionalBlock(world, (PlayerEntity)entity, breakPos, true);
			}
		}

		return super.onBlockDestroyed(stack, world, state, pos, entity);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 1));
	}
}
