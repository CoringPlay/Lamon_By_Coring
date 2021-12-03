
package net.mcreator.lamonbycoring.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.lamonbycoring.item.AppleInHoneyItem;
import net.mcreator.lamonbycoring.LamonByCoringModElements;

@LamonByCoringModElements.ModElement.Tag
public class CreativeTabFoodItemGroup extends LamonByCoringModElements.ModElement {
	public CreativeTabFoodItemGroup(LamonByCoringModElements instance) {
		super(instance, 145);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreative_tab_food") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AppleInHoneyItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
