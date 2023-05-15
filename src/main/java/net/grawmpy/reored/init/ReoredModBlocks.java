
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.grawmpy.reored.block.SilverOreBlock;
import net.grawmpy.reored.ReoredMod;

public class ReoredModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ReoredMod.MODID);
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
}
