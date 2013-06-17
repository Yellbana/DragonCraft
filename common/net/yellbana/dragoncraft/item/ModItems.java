package net.yellbana.dragoncraft.item;

import net.minecraft.item.Item;
import net.yellbana.dragoncraft.lib.ItemIds;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {
    public static Item dragonSphere;
    
    public static void init() {
        dragonSphere = (new ItemDragonSphere(ItemIds.DRAGONSPHERE));
    }
    
    public static void register() {
        LanguageRegistry.addName(dragonSphere, "Dragon Sphere");
    }
}
