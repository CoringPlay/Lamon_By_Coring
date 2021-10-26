
package net.mcreator.lamonbycoring.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.lamonbycoring.LamonByCoringModElements;

@LamonByCoringModElements.ModElement.Tag
public class AppleInHoneyItem extends LamonByCoringModElements.ModElement {
	@ObjectHolder("lamon_by_coring:apple_in_honey")
	public static final Item block = null;
	public AppleInHoneyItem(LamonByCoringModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(6).saturation(4f).build()));
			setRegistryName("apple_in_honey");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
