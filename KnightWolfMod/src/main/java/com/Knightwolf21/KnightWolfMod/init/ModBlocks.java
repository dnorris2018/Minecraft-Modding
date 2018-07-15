package com.Knightwolf21.KnightWolfMod.init;

import java.util.ArrayList;
import java.util.List;
import com.Knightwolf21.KnightWolfMod.blocks.BlockBase;
import com.Knightwolf21.KnightWolfMod.blocks.OreAdamantium;
import com.Knightwolf21.KnightWolfMod.blocks.OreAluminum;
import com.Knightwolf21.KnightWolfMod.blocks.OreArdite;
import com.Knightwolf21.KnightWolfMod.blocks.OreCobalt;
import com.Knightwolf21.KnightWolfMod.blocks.OreCopper;
import com.Knightwolf21.KnightWolfMod.blocks.OreIridium;
import com.Knightwolf21.KnightWolfMod.blocks.OreLead;
import com.Knightwolf21.KnightWolfMod.blocks.OreMagnesium;
import com.Knightwolf21.KnightWolfMod.blocks.OreMercury;
import com.Knightwolf21.KnightWolfMod.blocks.OreNeptunium;
import com.Knightwolf21.KnightWolfMod.blocks.OreNickel;
import com.Knightwolf21.KnightWolfMod.blocks.OreNthmetal;
import com.Knightwolf21.KnightWolfMod.blocks.OreOsmium;
import com.Knightwolf21.KnightWolfMod.blocks.OrePlatinum;
import com.Knightwolf21.KnightWolfMod.blocks.OrePlutonium;
import com.Knightwolf21.KnightWolfMod.blocks.OreSilver;
import com.Knightwolf21.KnightWolfMod.blocks.OreThorium;
import com.Knightwolf21.KnightWolfMod.blocks.OreTin;
import com.Knightwolf21.KnightWolfMod.blocks.OreTitanium;
import com.Knightwolf21.KnightWolfMod.blocks.OreTungsten;
import com.Knightwolf21.KnightWolfMod.blocks.OreUranium;
import com.Knightwolf21.KnightWolfMod.blocks.OreUru;
import com.Knightwolf21.KnightWolfMod.blocks.OreVibranium;
import com.Knightwolf21.KnightWolfMod.blocks.OreYellorite;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Blocks
	
	// Ores
	public static final Block ORE_ADAMANTIUM = new OreAdamantium("ore_adamantium", Material.ROCK);
	public static final Block ORE_ALUMINUM   = new OreAluminum("ore_aluminum", Material.ROCK);
	public static final Block ORE_ARDITE     = new OreArdite("ore_ardite", Material.ROCK);
	public static final Block ORE_COBALT     = new OreCobalt("ore_cobalt", Material.ROCK);
	public static final Block ORE_COPPER     = new OreCopper("ore_copper", Material.ROCK);
	public static final Block ORE_IRIDIUM    = new OreIridium("ore_iridium", Material.ROCK);
	public static final Block ORE_LEAD       = new OreLead("ore_lead", Material.ROCK);
	public static final Block ORE_MAGNESIUM  = new OreMagnesium("ore_magnesium", Material.ROCK);
	public static final Block ORE_MERCURY    = new OreMercury("ore_mercury", Material.ROCK);
	public static final Block ORE_NEPTUNIUM  = new OreNeptunium("ore_neptunium", Material.ROCK);
	public static final Block ORE_NICKEL     = new OreNickel("ore_nickel", Material.ROCK);
	public static final Block ORE_NTHMETAL   = new OreNthmetal("ore_nthmetal", Material.ROCK);
	public static final Block ORE_OSMIUM     = new OreOsmium("ore_osmium", Material.ROCK);
	public static final Block ORE_PLATINUM   = new OrePlatinum("ore_platinum", Material.ROCK);
	public static final Block ORE_PLUTONIUM  = new OrePlutonium("ore_plutonium", Material.ROCK);
	public static final Block ORE_SILVER     = new OreSilver("ore_silver", Material.ROCK);
	public static final Block ORE_THORIUM    = new OreThorium("ore_thorium", Material.ROCK);
	public static final Block ORE_TIN        = new OreTin("ore_tin", Material.ROCK);
	public static final Block ORE_TITANIUM   = new OreTitanium("ore_titanium", Material.ROCK);
	public static final Block ORE_TUNGSTEN   = new OreTungsten("ore_tungsten", Material.ROCK);
	public static final Block ORE_URANIUM    = new OreUranium("ore_uranium", Material.ROCK);
	public static final Block ORE_URU        = new OreUru("ore_uru", Material.ROCK);
	public static final Block ORE_VIBRANIUM  = new OreVibranium("ore_vibranium", Material.ROCK);
	public static final Block ORE_YELLORITE  = new OreYellorite("ore_yellorite", Material.ROCK);
	
	// Special Ore
	// 
}
// To add a new block
	// public static final Block ORE_COPPER = new OreCopper("ore_copper", Material.ROCK);
	// Make 3 json files blockstate, block, item
	// Add texture
	// Add name to en_us.lang
	// Make class in blocks 