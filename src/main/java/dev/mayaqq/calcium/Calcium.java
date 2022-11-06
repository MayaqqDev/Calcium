package dev.mayaqq.calcium;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calcium implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Calcium");
	public void onInitialize() {
		LOGGER.info("Optimizing Minecraft Block Render Backend...");
		LOGGER.info("Minecraft BLock Render Backend Optimized!");
	}
}
