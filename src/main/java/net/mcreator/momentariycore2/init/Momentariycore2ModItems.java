
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.momentariycore2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.momentariycore2.item.MomentariyItem;
import net.mcreator.momentariycore2.Momentariycore2Mod;

public class Momentariycore2ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Momentariycore2Mod.MODID);
	public static final RegistryObject<Item> MOMENTARIY = REGISTRY.register("momentariy", () -> new MomentariyItem());
	public static final RegistryObject<Item> MOMENTARIY_CORE_2_BLOCK = block(Momentariycore2ModBlocks.MOMENTARIY_CORE_2_BLOCK,
			Momentariycore2ModTabs.TAB_MC_2_TAB);
	public static final RegistryObject<Item> PERODIUM_CRAFT_BLOCK = block(Momentariycore2ModBlocks.PERODIUM_CRAFT_BLOCK,
			Momentariycore2ModTabs.TAB_MC_2_TAB);
	public static final RegistryObject<Item> SPONGE_BOB_SQUE_PENTS = block(Momentariycore2ModBlocks.SPONGE_BOB_SQUE_PENTS,
			Momentariycore2ModTabs.TAB_MC_2_TAB);
	public static final RegistryObject<Item> UPGRADE_VANILLA_BLOCK = block(Momentariycore2ModBlocks.UPGRADE_VANILLA_BLOCK,
			Momentariycore2ModTabs.TAB_MC_2_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
