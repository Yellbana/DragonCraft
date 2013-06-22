package net.yellbana.dragoncraft.block;

import net.yellbana.dragoncraft.api.Blocks;
import net.yellbana.dragoncraft.lib.BlockIds;
import net.yellbana.dragoncraft.lib.Reference;

import com.google.common.base.Optional;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {

    public static void init() {
        initializeBlocks();
        registerBlocks();
    }

    private static void initializeBlocks() {
        Blocks.dragonEmerald = Optional.of((new BlockDragonEmerald(BlockIds.DRAGONEMERALD)).setUnlocalizedName("dragonEmerald"));
        Blocks.dragonPortal = Optional.of((BlockDragonPortal)(new BlockDragonPortal(BlockIds.DRAGONPORTAL)).setUnlocalizedName("dragonPortal"));
        Blocks.dragonFire = Optional.of((new BlockDragonFire(BlockIds.DRAGONFIRE)).setUnlocalizedName("dragonFire"));
    }

    public static void registerBlocks() {
        GameRegistry.registerBlock(Blocks.dragonEmerald.get(), Reference.MOD_ID + (Blocks.dragonEmerald.get().getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(Blocks.dragonPortal.get(), Reference.MOD_ID + (Blocks.dragonPortal.get().getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(Blocks.dragonFire.get(), Reference.MOD_ID + (Blocks.dragonFire.get().getUnlocalizedName().substring(5)));

        LanguageRegistry.addName(Blocks.dragonEmerald.get(), "Dragon's Emerald");
        LanguageRegistry.addName(Blocks.dragonPortal.get(), "Dragon Portal");
        LanguageRegistry.addName(Blocks.dragonFire.get(), "Dragon Fire");
    }
}
