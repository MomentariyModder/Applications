package net.mcreator.momentariycore2.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;

import java.io.File;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Momentariycore2ModVariables {
	public static File file = new File("");
	public static BlockState mainJsonObject = Blocks.AIR.defaultBlockState();

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
