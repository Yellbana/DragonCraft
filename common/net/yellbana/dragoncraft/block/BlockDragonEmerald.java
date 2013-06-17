package net.yellbana.dragoncraft.block;

import net.minecraft.block.material.Material;

public class BlockDragonEmerald extends BlockDC {

    public BlockDragonEmerald(int par1) {
        super(par1, Material.rock);
        this.setStepSound(soundStoneFootstep);
        this.setHardness(5f);
        this.setResistance(5f);
    }
}
