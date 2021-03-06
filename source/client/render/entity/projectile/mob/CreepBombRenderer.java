package net.tslat.aoa3.client.render.entity.projectile.mob;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.tslat.aoa3.client.render.entity.projectile.ParticleProjectileRenderer;
import net.tslat.aoa3.common.registration.AoAParticleTypes;
import net.tslat.aoa3.entity.projectile.mob.CreepBombEntity;
import net.tslat.aoa3.library.misc.CustomisableParticleType;
import net.tslat.aoa3.util.NumberUtil;

public class CreepBombRenderer extends ParticleProjectileRenderer<CreepBombEntity> {
	public CreepBombRenderer(final EntityRendererManager manager) {
		super(manager);
	}

	@Override
	protected void addParticles(CreepBombEntity entity, float partialTicks) {
		entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.FLICKERING_SPARKLER.get(), 1, 3, NumberUtil.RGB(0, 255, 0)), entity.getPosX(), entity.getPosY(), entity.getPosZ(), 0, 0, 0);
	}
}
