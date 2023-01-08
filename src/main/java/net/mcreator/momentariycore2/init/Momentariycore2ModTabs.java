
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.momentariycore2.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class Momentariycore2ModTabs {
	public static CreativeModeTab TAB_MC_2_TAB;

	public static void load() {
		TAB_MC_2_TAB = new CreativeModeTab("tabmc_2_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Momentariycore2ModItems.MOMENTARIY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
