package net.vault.dungeondetour;

import net.fabricmc.api.ModInitializer;

import net.vault.dungeondetour.block.ModBlocks;
import net.vault.item.ModItemGroup;
import net.vault.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DungeonDetour implements ModInitializer {
	public static final	String MOD_ID = "dungeondetour";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroup.registerItemGroups();
	}
}