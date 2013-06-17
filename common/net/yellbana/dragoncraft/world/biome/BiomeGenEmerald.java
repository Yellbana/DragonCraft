package net.yellbana.dragoncraft.world.biome;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.yellbana.dragoncraft.DragonCraft;
import net.yellbana.dragoncraft.block.ModBlocks;

public class BiomeGenEmerald extends BiomeGenBase
{
    public BiomeGenEmerald(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlock = (byte)DragonCraft.dragonEmerald.blockID;
        this.fillerBlock = (byte)DragonCraft.dragonEmerald.blockID;
    }

    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
    }
}
