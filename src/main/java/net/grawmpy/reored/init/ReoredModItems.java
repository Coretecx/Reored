
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.grawmpy.reored.item.OakArmorItem;
import net.grawmpy.reored.item.CopperSwordItem;
import net.grawmpy.reored.item.CopperShovelItem;
import net.grawmpy.reored.item.CopperPickaxeItem;
import net.grawmpy.reored.item.CopperHoeItem;
import net.grawmpy.reored.item.CopperAxeItem;
import net.grawmpy.reored.item.CopperArmorItem;
import net.grawmpy.reored.ReoredMod;

public class ReoredModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ReoredMod.MODID);
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> OAK_ARMOR_HELMET = REGISTRY.register("oak_armor_helmet", () -> new OakArmorItem.Helmet());
	public static final RegistryObject<Item> OAK_ARMOR_CHESTPLATE = REGISTRY.register("oak_armor_chestplate", () -> new OakArmorItem.Chestplate());
	public static final RegistryObject<Item> OAK_ARMOR_LEGGINGS = REGISTRY.register("oak_armor_leggings", () -> new OakArmorItem.Leggings());
	public static final RegistryObject<Item> OAK_ARMOR_BOOTS = REGISTRY.register("oak_armor_boots", () -> new OakArmorItem.Boots());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", () -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> SILVER_ORE = block(ReoredModBlocks.SILVER_ORE, ReoredModTabs.TAB_REORED_BLOCKS);
	public static final RegistryObject<Item> DEEPSLATE_SILVER_ORE = block(ReoredModBlocks.DEEPSLATE_SILVER_ORE, ReoredModTabs.TAB_REORED_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
