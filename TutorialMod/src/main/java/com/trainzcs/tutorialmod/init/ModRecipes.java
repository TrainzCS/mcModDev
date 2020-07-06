package com.trainzcs.tutorialmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	
	public static void init() 
	{
		GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModBlocks.RUBY_BLOCK, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK, new ItemStack(Blocks.DIAMOND_BLOCK, 1), 5.0F);
	}

}
