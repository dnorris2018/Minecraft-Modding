package com.Knightwolf21.KnightWolfMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreVibranium extends BlockBase
{
	public OreVibranium(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE); // How it sounds when you walk on it
		setHardness(40.0F);            // How hard it is to break
		setResistance(750000.0F);      // How resistance to explosions
		setHarvestLevel("pickaxe", 3); // What is use to break it and what level it takes
		setLightLevel(5.0F);           // How much light it gives off
		// setLightOpacity(1);         // How much light can get through
		// setBlockUnbreakable();      // Unbreakable or Not
	}
}
