package net.minecraft.src;

import java.util.Random;

import net.minecraft.src.forge.*;

public class Item1 extends Item implements ITextureProvider
{
	
	
	public Item1 (int i)
	{
		super(i);
		maxStackSize = 64;
	}
	
    public String getTextureFile()
    {
            return "/imgz/terrain.png";
    }

}
