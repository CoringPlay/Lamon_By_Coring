package net.mcreator.lamonbycoring.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.lamonbycoring.block.YellowSandBlock;
import net.mcreator.lamonbycoring.block.WhiteSandBlock;
import net.mcreator.lamonbycoring.block.RedSandBlock;
import net.mcreator.lamonbycoring.block.PurpleSandBlock;
import net.mcreator.lamonbycoring.block.PinkSandBlock;
import net.mcreator.lamonbycoring.block.OrangeSandBlock;
import net.mcreator.lamonbycoring.block.MagentaSandBlock;
import net.mcreator.lamonbycoring.block.LightGraySandBlock;
import net.mcreator.lamonbycoring.block.LightBlueSandBlock;
import net.mcreator.lamonbycoring.block.LImeSandBlock;
import net.mcreator.lamonbycoring.block.GreenSandBlock;
import net.mcreator.lamonbycoring.block.GraySandBlock;
import net.mcreator.lamonbycoring.block.CyanSandBlock;
import net.mcreator.lamonbycoring.block.BrownSandBlock;
import net.mcreator.lamonbycoring.block.BlueSandBlock;
import net.mcreator.lamonbycoring.block.BlackSandBlock;
import net.mcreator.lamonbycoring.LamonByCoringMod;

import java.util.Map;
import java.util.Iterator;

public class AllSandProcedurProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LamonByCoringMod.LOGGER.warn("Failed to load dependency entity for procedure AllSandProcedur!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(RedSandBlock.block)) : false)
				&& ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(GreenSandBlock.block)) : false))
				&& (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(YellowSandBlock.block)) : false)
						&& ((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BlackSandBlock.block))
								: false)))
				&& ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BrownSandBlock.block)) : false)
						&& ((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BlueSandBlock.block))
								: false))
						&& (((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(WhiteSandBlock.block))
								: false)
								&& ((entity instanceof PlayerEntity)
										? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(PinkSandBlock.block))
										: false))))
				&& (((((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(OrangeSandBlock.block))
						: false)
						&& ((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(MagentaSandBlock.block))
								: false))
						&& (((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(LightBlueSandBlock.block))
								: false)
								&& ((entity instanceof PlayerEntity)
										? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(LImeSandBlock.block))
										: false)))
						&& ((((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(GraySandBlock.block))
								: false)
								&& ((entity instanceof PlayerEntity)
										? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(LightGraySandBlock.block))
										: false))
								&& (((entity instanceof PlayerEntity)
										? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(CyanSandBlock.block))
										: false)
										&& ((entity instanceof PlayerEntity)
												? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(PurpleSandBlock.block))
												: false)))))) {
			if (entity instanceof ServerPlayerEntity) {
				Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
						.getAdvancement(new ResourceLocation("lamon_by_coring:all_sand"));
				AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
	}
}
