
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.momentariycore2.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.momentariycore2.block.UpgradeVanillaBlockBlock;
import net.mcreator.momentariycore2.block.SpongeBobSquePentsBlock;
import net.mcreator.momentariycore2.block.PerodiumCraftBlockBlock;
import net.mcreator.momentariycore2.block.MomentariyCore2BlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Momentariycore2ModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block MOMENTARIY_CORE_2_BLOCK = register(new MomentariyCore2BlockBlock());
	public static final Block PERODIUM_CRAFT_BLOCK = register(new PerodiumCraftBlockBlock());
	public static final Block SPONGE_BOB_SQUE_PENTS = register(new SpongeBobSquePentsBlock());
	public static final Block UPGRADE_VANILLA_BLOCK = register(new UpgradeVanillaBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
