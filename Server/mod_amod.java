package net.minecraft.src;

import java.util.*;

import net.minecraft.src.forge.*;

public class mod_amod extends BaseMod
{
	
	public static Block ore1 = new ore1(255, 0).setHardness(1.0f).setResistance(6000.0F).setLightValue(1.0F).setBlockName("ore1");
	public static final Item Item1 = new Item(387).setItemName("Item1").setIconIndex(0);
	
	public mod_amod()
	{
		ModLoader.registerBlock(ore1);
	    ModLoader.addName(Item1, "LightStone Ball");
	    ModLoader.addName(ore1, "LightStone Ore");


	}
    
	public void GenerateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
        for(int i = 0; i < 15; i++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(40);
            int randPosZ = chunkZ + rand.nextInt(16);
            (new WorldGenMinable(mod_amod.ore1.blockID, 10)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    } 
	
	public String Version()
	{
		return "0.0.1";
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "0.0.1";
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}
}
