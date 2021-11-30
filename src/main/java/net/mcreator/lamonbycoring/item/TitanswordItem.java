
package net.mcreator.lamonbycoring.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.lamonbycoring.LamonByCoringModElements;

@LamonByCoringModElements.ModElement.Tag
public class TitanswordItem extends LamonByCoringModElements.ModElement {
	@ObjectHolder("lamon_by_coring:titanium_sword")
	public static final Item block = null;
	public TitanswordItem(LamonByCoringModElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2480;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitanIngotItem.block));
			}
		}, 3, -3.2999999999999999f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("titanium_sword"));
	}
}
