package net.yellbana.dragoncraft.block;

import net.minecraft.block.Block;
import net.yellbana.dragoncraft.DragonCraft;
import net.yellbana.dragoncraft.lib.BlockIds;
import net.yellbana.dragoncraft.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {
    
    public static Block dragonPortal;
    
    public static void init() {
        dragonPortal = (new BlockDragonPortal(BlockIds.DRAGONPORTAL)).setUnlocalizedName("dragonPortal");
        
    }
    
    public static void register() {
        GameRegistry.registerBlock(dragonPortal, Reference.MOD_ID + (dragonPortal.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(DragonCraft.dragonEmerald, Reference.MOD_ID + (DragonCraft.dragonEmerald.getUnlocalizedName().substring(5)));
        
        LanguageRegistry.addName(dragonPortal, "Dragon Portal");
        LanguageRegistry.addName(DragonCraft.dragonEmerald, "Dragon's Emerald");
    }
}
