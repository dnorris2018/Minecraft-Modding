package com.Knightwolf21.KnightWolfMod.init;

import java.util.ArrayList;
import java.util.List;
import com.Knightwolf21.KnightWolfMod.items.ItemBase;
import com.Knightwolf21.KnightWolfMod.items.tools.ToolAxe;
import com.Knightwolf21.KnightWolfMod.items.tools.ToolHoe;
import com.Knightwolf21.KnightWolfMod.items.tools.ToolPickaxe;
import com.Knightwolf21.KnightWolfMod.items.tools.ToolSpade;
import com.Knightwolf21.KnightWolfMod.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Tool Materials
	public static final ToolMaterial MATERIAL_ADAMANTIUM = EnumHelper.addToolMaterial("material_adamanium", 3, 1000000, 18.0F, 10.0F, 24);
	public static final ToolMaterial MATERIAL_ALUMINUM   = EnumHelper.addToolMaterial("material_aluminum", 1, 200, 4.0F, 2.0F, 4);
	public static final ToolMaterial MATERIAL_ARDITE     = EnumHelper.addToolMaterial("material_ardite", 3, 3000, 9.0F, 4.0F, 16);
	public static final ToolMaterial MATERIAL_COBALT 	 = EnumHelper.addToolMaterial("material_cobalt", 3, 5000, 10.0F, 5.0F, 18);
	public static final ToolMaterial MATERIAL_COPPER 	 = EnumHelper.addToolMaterial("material_copper", 2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_IRIDIUM 	 = EnumHelper.addToolMaterial("material_iridium", 3, 1000, 6.0F, 3.0F, 12);
	public static final ToolMaterial MATERIAL_LEAD 		 = EnumHelper.addToolMaterial("material_lead", 2, 350, 7.0F, 4.0F, 8);
	public static final ToolMaterial MATERIAL_MAGNESIUM  = EnumHelper.addToolMaterial("material_magnesium", 1, 200, 4.0F, 1.0F, 14);
	public static final ToolMaterial MATERIAL_MERCURY 	 = EnumHelper.addToolMaterial("material_mercury", 1, 250, 4.0F, 1.0F, 14);
	public static final ToolMaterial MATERIAL_NEPTUNIUM  = EnumHelper.addToolMaterial("material_neptunium", 3, 2000, 7.0F, 5.0F, 18);
	public static final ToolMaterial MATERIAL_NICKEL 	 = EnumHelper.addToolMaterial("material_nickel", 2, 250, 6.0F, 4.0F, 6);
	public static final ToolMaterial MATERIAL_NTHMETAL   = EnumHelper.addToolMaterial("material_nthmetal", 3, 10000, 12.0F, 8.0F, 20);
	public static final ToolMaterial MATERIAL_OSMIUM 	 = EnumHelper.addToolMaterial("material_osmium", 2, 500, 6.0F, 2.0F, 8);
	public static final ToolMaterial MATERIAL_PLATINUM 	 = EnumHelper.addToolMaterial("material_platinum", 2, 750, 7.0F, 3.0F, 15);
	public static final ToolMaterial MATERIAL_PLUTONIUM  = EnumHelper.addToolMaterial("material_plutonium", 2, 1000, 8.0F, 4.0F, 12);
	public static final ToolMaterial MATERIAL_SILVER 	 = EnumHelper.addToolMaterial("material_silver", 1, 200, 4.0F, 1.0F, 16);
	public static final ToolMaterial MATERIAL_THORIUM 	 = EnumHelper.addToolMaterial("material_thorium", 3, 100000, 10.0F, 7.0F, 24);
	public static final ToolMaterial MATERIAL_TIN 		 = EnumHelper.addToolMaterial("material_tin", 2, 250, 6.0F, 2.0F, 10);
	public static final ToolMaterial MATERIAL_TITANIUM 	 = EnumHelper.addToolMaterial("material_titanium", 3, 3000, 8.0F, 6.0F, 12);
	public static final ToolMaterial MATERIAL_TUNGSTEN   = EnumHelper.addToolMaterial("material_tungsten", 2, 1000, 7.0F, 2.0F, 12);
	public static final ToolMaterial MATERIAL_URANIUM 	 = EnumHelper.addToolMaterial("material_uranium", 1, 200, 3.0F, 1.0F, 5);
	public static final ToolMaterial MATERIAL_URU 		 = EnumHelper.addToolMaterial("material_uru", 3, 100000, 9.0F, 4.0F, 24);
	public static final ToolMaterial MATERIAL_VIBRANIUM  = EnumHelper.addToolMaterial("material_vibranium", 3, 750000, 16.0F, 9.0F, 22);
	public static final ToolMaterial MATERIAL_YELLORITE  = EnumHelper.addToolMaterial("material_yellorite", 1, 200, 3.0F, 1.0F, 8);
	
	// Ingots
	public static final Item INGOT_ADAMANTIUM = new ItemBase("ingot_adamantium");
	public static final Item INGOT_ALUMINUM   = new ItemBase("ingot_aluminum");
	public static final Item INGOT_ARDITE     = new ItemBase("ingot_ardite");
	public static final Item INGOT_COBALT     = new ItemBase("ingot_cobalt");
	public static final Item INGOT_COPPER     = new ItemBase("ingot_copper");
	public static final Item INGOT_IRIDIUM    = new ItemBase("ingot_iridium");
	public static final Item INGOT_LEAD       = new ItemBase("ingot_lead");
	public static final Item INGOT_MAGNESIUM  = new ItemBase("ingot_magnesium");
	public static final Item INGOT_MERCURY    = new ItemBase("ingot_mercury");
	public static final Item INGOT_NEPTUNIUM  = new ItemBase("ingot_neptunium");
	public static final Item INGOT_NICKEL     = new ItemBase("ingot_nickel");
	public static final Item INGOT_NTHMETAL   = new ItemBase("ingot_nthmetal");
	public static final Item INGOT_OSMIUM     = new ItemBase("ingot_osmium");
	public static final Item INGOT_PLATINUM   = new ItemBase("ingot_platinum");
	public static final Item INGOT_PLUTONIUM  = new ItemBase("ingot_plutonium");
	public static final Item INGOT_SILVER     = new ItemBase("ingot_silver");
	public static final Item INGOT_THORIUM    = new ItemBase("ingot_thorium");
	public static final Item INGOT_TIN        = new ItemBase("ingot_tin");
	public static final Item INGOT_TITANIUM   = new ItemBase("ingot_titanium");
	public static final Item INGOT_TUNGSTEN   = new ItemBase("ingot_tungsten");
	public static final Item INGOT_URANIUM    = new ItemBase("ingot_uranium");
	public static final Item INGOT_URU        = new ItemBase("ingot_uru");
	public static final Item INGOT_VIBRANIUM  = new ItemBase("ingot_vibranium");
	public static final Item INGOT_YELLORITE  = new ItemBase("ingot_yellorite");

	// Tools
		// Adamantium
		public static final ItemSword ADAMANTIUM_SWORD     = new ToolSword("adamantium_sword", MATERIAL_ADAMANTIUM);
		public static final ItemSpade ADAMANTIUM_SHOVEL    = new ToolSpade("adamantium_shovel", MATERIAL_ADAMANTIUM);
		public static final ItemPickaxe ADAMANTIUM_PICKAXE = new ToolPickaxe("adamantium_pickaxe", MATERIAL_ADAMANTIUM);
		public static final ItemAxe ADAMANTIUM_AXE         = new ToolAxe("adamantium_axe", MATERIAL_ADAMANTIUM);
		public static final ItemHoe ADAMANTIUM_HOE         = new ToolHoe("adamantium_hoe", MATERIAL_ADAMANTIUM);
		
		// Aluminum
		public static final ItemSword ALUMINUM_SWORD     = new ToolSword("aluminum_sword", MATERIAL_ALUMINUM);
		public static final ItemSpade ALUMINUM_SHOVEL    = new ToolSpade("aluminum_shovel", MATERIAL_ALUMINUM);
		public static final ItemPickaxe ALUMINUM_PICKAXE = new ToolPickaxe("aluminum_pickaxe", MATERIAL_ALUMINUM);
		public static final ItemAxe ALUMINUM_AXE		 = new ToolAxe("aluminum_axe", MATERIAL_ALUMINUM);
		public static final ItemHoe ALUMINUM_HOE 		 = new ToolHoe("aluminum_hoe", MATERIAL_ALUMINUM);
		
		// Ardite
		public static final ItemSword ARDITE_SWORD     = new ToolSword("ardite_sword", MATERIAL_ARDITE);
		public static final ItemSpade ARDITE_SHOVEL    = new ToolSpade("ardite_shovel", MATERIAL_ARDITE);
		public static final ItemPickaxe ARDITE_PICKAXE = new ToolPickaxe("ardite_pickaxe", MATERIAL_ARDITE);
		public static final ItemAxe ARDITE_AXE		   = new ToolAxe("ardite_axe", MATERIAL_ARDITE);
		public static final ItemHoe ARDITE_HOE         = new ToolHoe("ardite_hoe", MATERIAL_ARDITE);
		
		// Cobalt
		public static final ItemSword COBALT_SWORD     = new ToolSword("cobalt_sword", MATERIAL_COBALT);
		public static final ItemSpade COBALT_SHOVEL    = new ToolSpade("cobalt_shovel", MATERIAL_COBALT);
		public static final ItemPickaxe COBALT_PICKAXE = new ToolPickaxe("cobalt_pickaxe", MATERIAL_COBALT);
		public static final ItemAxe COBALT_AXE 		   = new ToolAxe("cobalt_axe", MATERIAL_COBALT);
		public static final ItemHoe COBALT_HOE		   = new ToolHoe("cobalt_hoe", MATERIAL_COBALT);
		
		// Copper
		public static final ItemSword COPPER_SWORD     = new ToolSword("copper_sword", MATERIAL_COPPER);
		public static final ItemSpade COPPER_SHOVEL    = new ToolSpade("copper_shovel", MATERIAL_COPPER);
		public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
		public static final ItemAxe COPPER_AXE         = new ToolAxe("copper_axe", MATERIAL_COPPER);
		public static final ItemHoe COPPER_HOE         = new ToolHoe("copper_hoe", MATERIAL_COPPER);
		
		// Iridium
		public static final ItemSword IRIDIUM_SWORD     = new ToolSword("iridium_sword", MATERIAL_IRIDIUM);
		public static final ItemSpade IRIDIUM_SHOVEL    = new ToolSpade("iridium_shovel", MATERIAL_IRIDIUM);
		public static final ItemPickaxe IRIDIUM_PICKAXE = new ToolPickaxe("iridium_pickaxe", MATERIAL_IRIDIUM);
		public static final ItemAxe IRIDIUM_AXE         = new ToolAxe("iridium_axe", MATERIAL_IRIDIUM);
		public static final ItemHoe IRIDIUM_HOE 		= new ToolHoe("iridium_hoe", MATERIAL_IRIDIUM);
		
		// Lead
		public static final ItemSword LEAD_SWORD     = new ToolSword("lead_sword", MATERIAL_LEAD);
		public static final ItemSpade LEAD_SHOVEL    = new ToolSpade("lead_shovel", MATERIAL_LEAD);
		public static final ItemPickaxe LEAD_PICKAXE = new ToolPickaxe("lead_pickaxe", MATERIAL_LEAD);
		public static final ItemAxe LEAD_AXE 		 = new ToolAxe("lead_axe", MATERIAL_LEAD);
		public static final ItemHoe LEAD_HOE 		 = new ToolHoe("lead_hoe", MATERIAL_LEAD);
		
		// Magnesium
		public static final ItemSword MAGNESIUM_SWORD     = new ToolSword("magnesium_sword", MATERIAL_MAGNESIUM);
		public static final ItemSpade MAGNESIUM_SHOVEL 	  = new ToolSpade("magnesium_shovel", MATERIAL_MAGNESIUM);
		public static final ItemPickaxe MAGNESIUM_PICKAXE = new ToolPickaxe("magnesium_pickaxe", MATERIAL_MAGNESIUM);
		public static final ItemAxe MAGNESIUM_AXE 		  = new ToolAxe("magnesium_axe", MATERIAL_MAGNESIUM);
		public static final ItemHoe MAGNESIUM_HOE 		  = new ToolHoe("magnesium_hoe", MATERIAL_MAGNESIUM);
		
		// Mercury
		public static final ItemSword MERCURY_SWORD 	= new ToolSword("mercury_sword", MATERIAL_MERCURY);
		public static final ItemSpade MERCURY_SHOVEL 	= new ToolSpade("mercury_shovel", MATERIAL_MERCURY);
		public static final ItemPickaxe MERCURY_PICKAXE = new ToolPickaxe("mercury_pickaxe", MATERIAL_MERCURY);
		public static final ItemAxe MERCURY_AXE 		= new ToolAxe("mercury_axe", MATERIAL_MERCURY);
		public static final ItemHoe MERCURY_HOE 		= new ToolHoe("mercury_hoe", MATERIAL_MERCURY);
		
		// Neptunium
		public static final ItemSword NEPTUNIUM_SWORD     = new ToolSword("neptunium_sword", MATERIAL_NEPTUNIUM);
		public static final ItemSpade NEPTUNIUM_SHOVEL    = new ToolSpade("neptunium_shovel", MATERIAL_NEPTUNIUM);
		public static final ItemPickaxe NEPTUNIUM_PICKAXE = new ToolPickaxe("neptunium_pickaxe", MATERIAL_NEPTUNIUM);
		public static final ItemAxe NEPTUNIUM_AXE 		  = new ToolAxe("neptunium_axe", MATERIAL_NEPTUNIUM);
		public static final ItemHoe NEPTUNIUM_HOE 		  = new ToolHoe("neptunium_hoe", MATERIAL_NEPTUNIUM);
		
		// Nickel
		public static final ItemSword NICKEL_SWORD 	   = new ToolSword("nickel_sword", MATERIAL_NICKEL);
		public static final ItemSpade NICKEL_SHOVEL    = new ToolSpade("nickel_shovel", MATERIAL_NICKEL);
		public static final ItemPickaxe NICKEL_PICKAXE = new ToolPickaxe("nickel_pickaxe", MATERIAL_NICKEL);
		public static final ItemAxe NICKEL_AXE 		   = new ToolAxe("nickel_axe", MATERIAL_NICKEL);
		public static final ItemHoe NICKEL_HOE 		   = new ToolHoe("nickel_hoe", MATERIAL_NICKEL);
		
		// Nth Metal
		public static final ItemSword NTHMETAL_SWORD     = new ToolSword("nthmetal_sword", MATERIAL_NTHMETAL);
		public static final ItemSpade NTHMETAL_SHOVEL    = new ToolSpade("nthmetal_shovel", MATERIAL_NTHMETAL);
		public static final ItemPickaxe NTHMETAL_PICKAXE = new ToolPickaxe("nthmetal_pickaxe", MATERIAL_NTHMETAL);
		public static final ItemAxe NTHMETAL_AXE  		 = new ToolAxe("nthmetal_axe", MATERIAL_NTHMETAL);
		public static final ItemHoe NTHMETAL_HOE 		 = new ToolHoe("nthmetal_hoe", MATERIAL_NTHMETAL);
		
		// Osmium 
		public static final ItemSword OSMIUM_SWORD     = new ToolSword("osmium_sword", MATERIAL_OSMIUM);
		public static final ItemSpade OSMIUM_SHOVEL    = new ToolSpade("osmium_shovel", MATERIAL_OSMIUM);
		public static final ItemPickaxe OSMIUM_PICKAXE = new ToolPickaxe("osmium_pickaxe", MATERIAL_OSMIUM);
		public static final ItemAxe OSMIUM_AXE  	   = new ToolAxe("osmium_axe", MATERIAL_OSMIUM);
		public static final ItemHoe OSMIUM_HOE 		   = new ToolHoe("osmium_hoe", MATERIAL_OSMIUM);
		
		// Platinum 
		public static final ItemSword PLATINUM_SWORD     = new ToolSword("platinum_sword", MATERIAL_PLATINUM);
		public static final ItemSpade PLATINUM_SHOVEL    = new ToolSpade("platinum_shovel", MATERIAL_PLATINUM);
		public static final ItemPickaxe PLATINUM_PICKAXE = new ToolPickaxe("platinum_pickaxe", MATERIAL_PLATINUM);
		public static final ItemAxe PLATINUM_AXE  		 = new ToolAxe("platinum_axe", MATERIAL_PLATINUM);
		public static final ItemHoe PLATINUM_HOE 		 = new ToolHoe("platinum_hoe", MATERIAL_PLATINUM);
		
		// Plutonium 
		public static final ItemSword PLUTONIUM_SWORD     = new ToolSword("plutonium_sword", MATERIAL_PLUTONIUM);
		public static final ItemSpade PLUTONIUM_SHOVEL    = new ToolSpade("plutonium_shovel", MATERIAL_PLUTONIUM);
		public static final ItemPickaxe PLUTONIUM_PICKAXE = new ToolPickaxe("plutonium_pickaxe", MATERIAL_PLUTONIUM);
		public static final ItemAxe PLUTONIUM_AXE  		  = new ToolAxe("plutonium_axe", MATERIAL_PLUTONIUM);
		public static final ItemHoe PLUTONIUM_HOE 		  = new ToolHoe("plutonium_hoe", MATERIAL_PLUTONIUM);		
		
		// Silver 
		public static final ItemSword SILVER_SWORD     = new ToolSword("silver_sword", MATERIAL_SILVER);
		public static final ItemSpade SILVER_SHOVEL    = new ToolSpade("silver_shovel", MATERIAL_SILVER);
		public static final ItemPickaxe SILVER_PICKAXE = new ToolPickaxe("silver_pickaxe", MATERIAL_SILVER);
		public static final ItemAxe SILVER_AXE  	   = new ToolAxe("silver_axe", MATERIAL_SILVER);
		public static final ItemHoe SILVER_HOE 		   = new ToolHoe("silver_hoe", MATERIAL_SILVER);
		
		// Thorium 
		public static final ItemSword THORIUM_SWORD     = new ToolSword("thorium_sword", MATERIAL_THORIUM);
		public static final ItemSpade THORIUM_SHOVEL    = new ToolSpade("thorium_shovel", MATERIAL_THORIUM);
		public static final ItemPickaxe THORIUM_PICKAXE = new ToolPickaxe("thorium_pickaxe", MATERIAL_THORIUM);
		public static final ItemAxe THORIUM_AXE 	    = new ToolAxe("thorium_axe", MATERIAL_THORIUM);
		public static final ItemHoe THORIUM_HOE		    = new ToolHoe("thorium_hoe", MATERIAL_THORIUM);
		
		// Tin 
		public static final ItemSword TIN_SWORD     = new ToolSword("tin_sword", MATERIAL_TIN);
		public static final ItemSpade TIN_SHOVEL    = new ToolSpade("tin_shovel", MATERIAL_TIN);
		public static final ItemPickaxe TIN_PICKAXE = new ToolPickaxe("tin_pickaxe", MATERIAL_TIN);
		public static final ItemAxe TIN_AXE  	    = new ToolAxe("tin_axe", MATERIAL_TIN);
		public static final ItemHoe TIN_HOE 	    = new ToolHoe("tin_hoe", MATERIAL_TIN);
		
		// Titanium 
		public static final ItemSword TITANIUM_SWORD     = new ToolSword("titanium_sword", MATERIAL_TITANIUM);
		public static final ItemSpade TITANIUM_SHOVEL    = new ToolSpade("titanium_shovel", MATERIAL_TITANIUM);
		public static final ItemPickaxe TITANIUM_PICKAXE = new ToolPickaxe("titanium_pickaxe", MATERIAL_TITANIUM);
		public static final ItemAxe TITANIUM_AXE  		 = new ToolAxe("titanium_axe", MATERIAL_TITANIUM);
		public static final ItemHoe TITANIUM_HOE 		 = new ToolHoe("titanium_hoe", MATERIAL_TITANIUM);
		
		// Tungsten 
		public static final ItemSword TUNGSTEN_SWORD     = new ToolSword("tungsten_sword", MATERIAL_TUNGSTEN);
		public static final ItemSpade TUNGSTEN_SHOVEL    = new ToolSpade("tungsten_shovel", MATERIAL_TUNGSTEN);
		public static final ItemPickaxe TUNGSTEN_PICKAXE = new ToolPickaxe("tungsten_pickaxe", MATERIAL_TUNGSTEN);
		public static final ItemAxe TUNGSTEN_AXE  		 = new ToolAxe("tungsten_axe", MATERIAL_TUNGSTEN);
		public static final ItemHoe TUNGSTEN_HOE 		 = new ToolHoe("tungsten_hoe", MATERIAL_TUNGSTEN);
		
		// Uranium
		public static final ItemSword URANIUM_SWORD     = new ToolSword("uranium_sword", MATERIAL_URANIUM);
		public static final ItemSpade URANIUM_SHOVEL    = new ToolSpade("uranium_shovel", MATERIAL_URANIUM);
		public static final ItemPickaxe URANIUM_PICKAXE = new ToolPickaxe("uranium_pickaxe", MATERIAL_URANIUM);
		public static final ItemAxe URANIUM_AXE  		= new ToolAxe("uranium_axe", MATERIAL_URANIUM);
		public static final ItemHoe URANIUM_HOE 	    = new ToolHoe("uranium_hoe", MATERIAL_URANIUM);
		
		// Uru 
		public static final ItemSword URU_SWORD     = new ToolSword("uru_sword", MATERIAL_URU);
		public static final ItemSpade URU_SHOVEL    = new ToolSpade("uru_shovel", MATERIAL_URU);
		public static final ItemPickaxe URU_PICKAXE = new ToolPickaxe("uru_pickaxe", MATERIAL_URU);
		public static final ItemAxe URU_AXE         = new ToolAxe("uru_axe", MATERIAL_URU);
		public static final ItemHoe URU_HOE 	    = new ToolHoe("uru_hoe", MATERIAL_URU);
		
		// Vibranium 
		public static final ItemSword VIBRANIUM_SWORD     = new ToolSword("vibranium_sword", MATERIAL_VIBRANIUM);
		public static final ItemSpade VIBRANIUM_SHOVEL    = new ToolSpade("vibranium_shovel", MATERIAL_VIBRANIUM);
		public static final ItemPickaxe VIBRANIUM_PICKAXE = new ToolPickaxe("vibranium_pickaxe", MATERIAL_VIBRANIUM);
		public static final ItemAxe VIBRANIUM_AXE  		  = new ToolAxe("vibranium_axe", MATERIAL_VIBRANIUM);
		public static final ItemHoe VIBRANIUM_HOE 	      = new ToolHoe("vibranium_hoe", MATERIAL_VIBRANIUM);
		
		// Yellorite
		public static final ItemSword YELLORITE_SWORD     = new ToolSword("yellorite_sword", MATERIAL_YELLORITE);
		public static final ItemSpade YELLORITE_SHOVEL    = new ToolSpade("yellorite_shovel", MATERIAL_YELLORITE);
		public static final ItemPickaxe YELLORITE_PICKAXE = new ToolPickaxe("yellorite_pickaxe", MATERIAL_YELLORITE);
		public static final ItemAxe YELLORITE_AXE  		  = new ToolAxe("yellorite_axe", MATERIAL_YELLORITE);
		public static final ItemHoe YELLORITE_HOE 		  = new ToolHoe("yellorite_hoe", MATERIAL_YELLORITE);
}

// To add a new item
	// public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	// Make json file
	// Add texture and name to en_us.lang

// To add a new tool
	// public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	// Axe is special
	// Make json file and recipe
	// Add texture and name to en_us.lang

// To add a new material
	// public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_ruby", 2, 300, 6.0F, 2.0F, 14);