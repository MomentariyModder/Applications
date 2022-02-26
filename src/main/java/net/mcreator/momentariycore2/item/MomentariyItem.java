
package net.mcreator.momentariycore2.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.momentariycore2.init.Momentariycore2ModTabs;

public class MomentariyItem extends Item {
	public MomentariyItem() {
		super(new Item.Properties().tab(Momentariycore2ModTabs.TAB_MC_2_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("momentariy");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
