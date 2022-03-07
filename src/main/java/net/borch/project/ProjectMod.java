package net.borch.project;

import net.borch.project.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class ProjectMod implements ModInitializer {
	public static final String MOD_ID = "fabric_project";
	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		System.out.println("Hello Fabric world!");
	}
}
