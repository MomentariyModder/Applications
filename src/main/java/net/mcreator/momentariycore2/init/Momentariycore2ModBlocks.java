
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.momentariycore2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.momentariycore2.block.SpongeBobSquePentsBlock;
import net.mcreator.momentariycore2.block.PerodiumCraftBlockBlock;
import net.mcreator.momentariycore2.block.MomentariyCore2BlockBlock;
import net.mcreator.momentariycore2.block.HVHBlock;
import net.mcreator.momentariycore2.block.CSEBlock;
import net.mcreator.momentariycore2.block.CMDBlock;
import net.mcreator.momentariycore2.Momentariycore2Mod;

public class Momentariycore2ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Momentariycore2Mod.MODID);
	public static final RegistryObject<Block> MOMENTARIY_CORE_2_BLOCK = REGISTRY.register("momentariy_core_2_block",
			() -> new MomentariyCore2BlockBlock());
	public static final RegistryObject<Block> PERODIUM_CRAFT_BLOCK = REGISTRY.register("perodium_craft_block", () -> new PerodiumCraftBlockBlock());
	public static final RegistryObject<Block> SPONGE_BOB_SQUE_PENTS = REGISTRY.register("sponge_bob_sque_pents", () -> new SpongeBobSquePentsBlock());
	public static final RegistryObject<Block> HVH = REGISTRY.register("hvh", () -> new HVHBlock());
	public static final RegistryObject<Block> CMD = REGISTRY.register("cmd", () -> new CMDBlock());
	public static final RegistryObject<Block> CSE = REGISTRY.register("cse", () -> new CSEBlock());
}
