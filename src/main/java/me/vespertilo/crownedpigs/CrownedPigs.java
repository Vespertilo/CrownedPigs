package me.vespertilo.crownedpigs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.client.resource.SplashTextResourceSupplier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.NameTagItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrownedPigs implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("crownedpigs");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("CrownedPigs has been enabled.");
	}
}
