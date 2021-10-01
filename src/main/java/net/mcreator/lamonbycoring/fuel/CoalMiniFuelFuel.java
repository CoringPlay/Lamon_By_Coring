
package net.mcreator.lamonbycoring.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.lamonbycoring.item.CoalMiniItem;

@Mod.EventBusSubscriber
public class CoalMiniFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == CoalMiniItem.block)
			event.setBurnTime(178);
	}
}
