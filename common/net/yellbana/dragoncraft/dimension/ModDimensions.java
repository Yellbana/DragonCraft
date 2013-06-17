package net.yellbana.dragoncraft.dimension;

import net.minecraftforge.common.DimensionManager;

public class ModDimensions {
    public static int dragonDen = 125;
    
    public static void init() {
        DimensionManager.registerProviderType(dragonDen, WorldProviderDragonDen.class, false);
        DimensionManager.registerDimension(dragonDen, dragonDen);
    }
}
