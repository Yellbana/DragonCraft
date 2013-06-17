package net.yellbana.dragoncraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.yellbana.dragoncraft.DragonCraft;
import net.yellbana.dragoncraft.lib.Reference;

public class BlockDC extends Block{
    public BlockDC(int par1, Material par2Material) {
        super(par1, par2Material);
        this.setCreativeTab(DragonCraft.tabDC);
    }
    
    public void registerIcons(IconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
    }
}