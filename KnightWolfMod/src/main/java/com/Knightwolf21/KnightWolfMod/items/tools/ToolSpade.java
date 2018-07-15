package com.Knightwolf21.KnightWolfMod.items.tools;

import com.Knightwolf21.KnightWolfMod.Main;
import com.Knightwolf21.KnightWolfMod.init.ModItems;
import com.Knightwolf21.KnightWolfMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel
{
	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
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
