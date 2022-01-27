package net.mcreator.weedmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class CannabisSeedsRightClickOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WeedmodMod.LOGGER.warn("Failed to load dependency world for procedure CannabisSeedsRightClickOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WeedmodMod.LOGGER.warn("Failed to load dependency x for procedure CannabisSeedsRightClickOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WeedmodMod.LOGGER.warn("Failed to load dependency y for procedure CannabisSeedsRightClickOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WeedmodMod.LOGGER.warn("Failed to load dependency z for procedure CannabisSeedsRightClickOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WeedmodMod.LOGGER.warn("Failed to load dependency entity for procedure CannabisSeedsRightClickOnBlock!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");

		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FARMLAND
				&& world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), CannabisPlantBlock.block.getDefaultState(), 3);
			if (!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(CannabisSeedsItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
	}

}
