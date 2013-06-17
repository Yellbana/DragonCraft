package net.yellbana.dragoncraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.yellbana.dragoncraft.DragonCraft;
import net.yellbana.dragoncraft.block.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabDC extends CreativeTabs{
    public CreativeTabDC(int par1, String par2Str) {
        super(par1, par2Str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return DragonCraft.dragonEmerald.blockID;
    }
}
