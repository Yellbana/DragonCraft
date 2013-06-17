package net.yellbana.dragoncraft.world.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBiomes {

    public static BiomeGenBase emerald;

    public static void init() {
        emerald = new BiomeGenEmerald(124).setBiomeName("Emerald Dragon Biome").setMinMaxHeight(0.1f, 0.2f);
    }

    public static void register() {
        GameRegistry.addBiome(emerald);
    }
}
