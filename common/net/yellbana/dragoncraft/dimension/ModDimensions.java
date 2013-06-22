package net.yellbana.dragoncraft.dimension;

import net.minecraftforge.common.DimensionManager;
import net.yellbana.dragoncraft.lib.DimensionIds;

public class ModDimensions {
    
    public static void init() {
        registerProviderType();
        registerDimension();
    }
    
    public static void registerProviderType() {
        DimensionManager.registerProviderType(DimensionIds.DRAGONDEN, WorldProviderDragonDen.class, false);
    }
    
    public static void registerDimension() {
        DimensionManager.registerDimension(DimensionIds.DRAGONDEN, DimensionIds.DRAGONDEN);
    }
}
