package com.trial;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrialMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("trial-mod");
	public static final String MOD_ID = "trialmod";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}