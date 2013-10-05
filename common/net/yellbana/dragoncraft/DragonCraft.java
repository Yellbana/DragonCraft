package net.yellbana.dragoncraft;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.yellbana.dragoncraft.block.ModBlocks;
import net.yellbana.dragoncraft.configuration.ConfigurationHandler;
import net.yellbana.dragoncraft.core.handlers.VersionCheckTickHandler;
import net.yellbana.dragoncraft.core.util.LogHelper;
import net.yellbana.dragoncraft.core.util.VersionHelper;
import net.yellbana.dragoncraft.creativetab.CreativeTabDC;
import net.yellbana.dragoncraft.dimension.ModDimensions;
import net.yellbana.dragoncraft.item.ModItems;
import net.yellbana.dragoncraft.lib.Reference;
import net.yellbana.dragoncraft.world.biome.ModBiomes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DragonCraft {
    @Instance(Reference.MOD_ID)
    public static DragonCraft instance;

    public static CreativeTabs tabDC = new CreativeTabDC(CreativeTabs.getNextID(), Reference.MOD_ID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Initialise the log helper
        LogHelper.init();

        //Initialise the Configuration
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));

        // Conduct the version check and log the result
        VersionHelper.execute();

        // Initialise the Version Check Tick Handler (Client only)
        TickRegistry.registerTickHandler(new VersionCheckTickHandler(), Side.CLIENT);

        ModBlocks.init();

        ModItems.init();

        ModBiomes.init();

        ModDimensions.init();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {

        //Creative Tab Name
        LanguageRegistry.instance().addStringLocalization("itemGroup.DC", "Dragon Craft");
    }
}