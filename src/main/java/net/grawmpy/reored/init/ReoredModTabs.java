
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ReoredModTabs {
	public static CreativeModeTab TAB_REORED_TOOLS;
	public static CreativeModeTab TAB_REORED_ARMORY;

	public static void load() {
		TAB_REORED_TOOLS = new CreativeModeTab("tabreored_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ReoredModItems.COPPER_PICKAXE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_REORED_ARMORY = new CreativeModeTab("tabreored_armory") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ReoredModItems.COPPER_SWORD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
