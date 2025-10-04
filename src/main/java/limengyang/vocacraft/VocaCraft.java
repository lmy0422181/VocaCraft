package limengyang.vocacraft;

import limengyang.vocacraft.blocks.ModBlocks;
import limengyang.vocacraft.items.type.ModItemGroups;
import limengyang.vocacraft.items.ModItems;
import limengyang.vocacraft.villager.ModTrades;
import limengyang.vocacraft.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VocaCraft implements ModInitializer {
	public static final String MOD_ID = "vocacraft";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
        ModItems.registerItems();
        ModBlocks.registerModBlocks();
        ModTrades.registerTrades();
        ModVillagers.ModVillages();
        ModItemGroups.VocacraftBlocksGroup();
        ModItemGroups.VocacraftItemsGroup();
		LOGGER.info("Hello Fabric world!");
	}
}