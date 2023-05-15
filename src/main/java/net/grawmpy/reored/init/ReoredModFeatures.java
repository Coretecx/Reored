
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.grawmpy.reored.world.features.ores.SilverOreFeature;
import net.grawmpy.reored.ReoredMod;

@Mod.EventBusSubscriber
public class ReoredModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ReoredMod.MODID);
	public static final RegistryObject<Feature<?>> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreFeature::feature);
}
