package net.ole.worldgenerator.generator;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class FunMapGenerator extends ChunkGenerator {

    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
        ChunkData chunkData = createChunkData(world);
        chunkX = Math.abs(chunkX) % 2;
        chunkZ = Math.abs(chunkZ) % 2;
        if(chunkX == chunkZ) {
            chunkData.setRegion(0,1,0,16,64,16, Material.DIAMOND_BLOCK);
        } else {
            chunkData.setRegion(0,1,0,16,64,16, Material.GOLD_BLOCK);
        }
        return chunkData;
    }
}
