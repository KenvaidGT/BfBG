package com.ropap.tardom.world.gen;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;
import com.ropap.tardom.block.ModBlocks;

public enum OreType {

    ZINC_ORE(Lazy.of(ModBlocks.ZINC_ORE), 6, 0, 30, 5),
    COPPER_ORE(Lazy.of(ModBlocks.COPPER_ORE), 6, 0, 30, 5);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;


    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }
    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}