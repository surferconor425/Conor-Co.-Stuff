package com.surferconor425.conorco.block;

import com.surferconor425.conorco.creativetab.CreativeTabConorCo;
import com.surferconor425.conorco.reference.BlockRef;
import net.minecraft.block.material.Material;

public class BlockCCBlack extends BlockConorCo
{
    public BlockCCBlack()
    {
        super(Material.rock);
        this.setBlockName(BlockRef.Block6);
        setCreativeTab(CreativeTabConorCo.ConorCo);
        setStepSound(soundTypeStone);
        setHardness(4.0F);

    }
}
