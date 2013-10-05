package net.yellbana.dragoncraft.item;

import net.minecraft.item.Item;
import net.yellbana.dragoncraft.lib.ItemIds;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {
    public static Item dragonSphere;
    public static Item dragonFlint;
    
    public static void init() {
        initializeItems();
        registerItems();
    }
    
    public static void initializeItems() {
        dragonFlint = (new ItemDragonFlint(ItemIds.DRAGONFLINT));
    }
    
    public static void registerItems() {
        LanguageRegistry.addName(dragonFlint, "Dragon Flint");
    }
}
