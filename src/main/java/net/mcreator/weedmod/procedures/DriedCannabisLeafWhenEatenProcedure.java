package net.mcreator.weedmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DriedCannabisLeafWhenEatenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WeedmodMod.LOGGER.warn("Failed to load dependency entity for procedure DriedCannabisLeafWhenEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 40, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 40, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 40, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 40, (int) 1));
	}

}
