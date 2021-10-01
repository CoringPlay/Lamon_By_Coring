
package net.mcreator.lamonbycoring.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.lamonbycoring.item.CharcoalMiniItem;

@Mod.EventBusSubscriber
public class CharcoalMiniFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == CharcoalMiniItem.block)
			event.setBurnTime(178);
	}
}
