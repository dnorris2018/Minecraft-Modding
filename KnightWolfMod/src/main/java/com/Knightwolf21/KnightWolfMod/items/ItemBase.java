package com.Knightwolf21.KnightWolfMod.items;

import com.Knightwolf21.KnightWolfMod.Main;
import com.Knightwolf21.KnightWolfMod.init.ModItems;
import com.Knightwolf21.KnightWolfMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}	
}
