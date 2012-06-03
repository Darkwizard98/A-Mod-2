package net.minecraft.src;

import java.util.Random;

import net.minecraft.src.forge.*;

public class DarkStoneOre extends Block implements ITextureProvider
{
	
	public DarkStoneOre(int i, int j)
	{
		super(i, j, Material.ground);
	}
    public String getTextureFile()
    {
            return "/imgz/terrain.png";
    }
	//public int idDropped(int i, Random random, int j)
	//{
		//return mod_amod.LightStoneBall.shiftedIndex;
	//}
	public int quantityDropped(Random random)
	{
		return 1;
	}
	
	
	
	

}
