package net.mcreator.lamonbycoring.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.lamonbycoring.item.MonsterTrapCowItem;
import net.mcreator.lamonbycoring.LamonByCoringMod;

import java.util.Map;

public class MonsterTrapKoghdaNazhataPkmPoVozdukhuProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LamonByCoringMod.LOGGER.warn("Failed to load dependency entity for procedure MonsterTrapKoghdaNazhataPkmPoVozdukhu!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof CowEntity)) {
			if (!entity.world.isRemote())
				entity.remove();
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
				_setstack.setCount(
						(int) (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getCount())
								- 1));
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(MonsterTrapCowItem.block);
				_setstack.setCount(
						(int) (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getCount())
								+ 1));
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
