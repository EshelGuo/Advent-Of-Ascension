package net.tslat.aoa3.entity.projectile.staff;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.item.EnergyProjectileWeapon;

public class ShyreShotEntity extends BaseEnergyShot {
	public ShyreShotEntity(EntityType<? extends ThrowableEntity> entityType, World world) {
		super(entityType, world);
	}

	public ShyreShotEntity(World world) {
		super(AoAEntities.Projectiles.SHYRE_SHOT.get(), world);
	}

	public ShyreShotEntity(LivingEntity shooter, EnergyProjectileWeapon weapon, int maxAge) {
		super(AoAEntities.Projectiles.SHYRE_SHOT.get(), shooter, weapon, maxAge);
	}

	public ShyreShotEntity(World world, double x, double y, double z) {
		super(AoAEntities.Projectiles.SHYRE_SHOT.get(), world, x, y, z);
	}

	@Override
	public float getGravityVelocity() {
		return 0.085f;
	}
}
