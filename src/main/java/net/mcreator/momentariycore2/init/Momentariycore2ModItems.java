
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.momentariycore2.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.momentariycore2.item.MomentariyItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Momentariycore2ModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MOMENTARIY = register(new MomentariyItem());
	public static final Item MOMENTARIY_CORE_2_BLOCK = register(Momentariycore2ModBlocks.MOMENTARIY_CORE_2_BLOCK,
			Momentariycore2ModTabs.TAB_MC_2_TAB);
	public static final Item PERODIUM_CRAFT_BLOCK = register(Momentariycore2ModBlocks.PERODIUM_CRAFT_BLOCK, Momentariycore2ModTabs.TAB_MC_2_TAB);
	public static final Item SPONGE_BOB_SQUE_PENTS = register(Momentariycore2ModBlocks.SPONGE_BOB_SQUE_PENTS, Momentariycore2ModTabs.TAB_MC_2_TAB);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
