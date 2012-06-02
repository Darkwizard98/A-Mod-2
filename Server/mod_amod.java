package net.minecraft.src;

import java.util.*;

import net.minecraft.src.forge.*;

public class mod_amod extends BaseMod
{
	
	public static Block LightStoneOre = new LightStoneOre(255, 0)
	.setHardness(1.0f)
	.setResistance(6000.0F)
	.setLightValue(1.0F)
	.setBlockName("LightStoneOre");
	public static final Item LightStoneBall = new Item(387)
	.setItemName("Item1")
	.setIconIndex(0);
	
	public mod_amod()
	{
		ModLoader.registerBlock(LightStoneOre);
	    ModLoader.addName(LightStoneBall, "LightStone Ball");
	    ModLoader.addName(LightStoneOre, "LightStone Ore");


	}
    
	public void GenerateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
        for(int i = 0; i < 15; i++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(40);
            int randPosZ = chunkZ + rand.nextInt(16);
            (new WorldGenMinable(mod_amod.LightStoneOre.blockID, 10)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    } 
	
	public String Version()
	{
		return "0.0.2";
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "0.0.2";
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}
}
