package com.Knightwolf21.KnightWolfMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		// Minecraft Furnace Recipes
		GameRegistry.addSmelting(ModBlocks.ORE_ADAMANTIUM, new ItemStack(ModItems.INGOT_ADAMANTIUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_ALUMINUM,   new ItemStack(ModItems.INGOT_ALUMINUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_ARDITE,     new ItemStack(ModItems.INGOT_ARDITE, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_COBALT,     new ItemStack(ModItems.INGOT_COBALT, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_COPPER,     new ItemStack(ModItems.INGOT_COPPER, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_IRIDIUM,    new ItemStack(ModItems.INGOT_IRIDIUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_LEAD,       new ItemStack(ModItems.INGOT_LEAD, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_MAGNESIUM,  new ItemStack(ModItems.INGOT_MAGNESIUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_MERCURY,    new ItemStack(ModItems.INGOT_MERCURY, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_NEPTUNIUM,  new ItemStack(ModItems.INGOT_NEPTUNIUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_NICKEL,     new ItemStack(ModItems.INGOT_NICKEL, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_NTHMETAL,   new ItemStack(ModItems.INGOT_NTHMETAL, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_OSMIUM,     new ItemStack(ModItems.INGOT_OSMIUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_PLATINUM,   new ItemStack(ModItems.INGOT_PLATINUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_PLUTONIUM,  new ItemStack(ModItems.INGOT_PLUTONIUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_SILVER,     new ItemStack(ModItems.INGOT_SILVER, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_THORIUM,    new ItemStack(ModItems.INGOT_THORIUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_TIN,        new ItemStack(ModItems.INGOT_TIN, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_TITANIUM,   new ItemStack(ModItems.INGOT_TITANIUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_TUNGSTEN,   new ItemStack(ModItems.INGOT_TUNGSTEN, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_URANIUM,    new ItemStack(ModItems.INGOT_URANIUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_URU,        new ItemStack(ModItems.INGOT_URU, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_VIBRANIUM,  new ItemStack(ModItems.INGOT_VIBRANIUM, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ORE_YELLORITE,  new ItemStack(ModItems.INGOT_YELLORITE, 1), 1.5F);
	}
}
// Add a new recipe
	// GameRegistry.addSmelting(ModBlocks.ORE_COPPER, new ItemStack(ModItems.INGOT_COPPER, 1), 1.5F);
