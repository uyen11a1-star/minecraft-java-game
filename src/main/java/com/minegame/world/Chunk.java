package com.minegame.world;

public class Chunk {
    public static final int WIDTH = 16;
    public static final int HEIGHT = 256;
    public static final int DEPTH = 16;
    
    private byte[][][] blocks = new byte[WIDTH][HEIGHT][DEPTH];

    public Chunk(int chunkX, int chunkZ) {
        generateChunk();
    }

    private void generateChunk() {
        for (int x = 0; x < WIDTH; x++) {
            for (int z = 0; z < DEPTH; z++) {
                for (int y = 0; y < 64; y++) {
                    if (y < 63) {
                        blocks[x][y][z] = 1; // Stone
                    } else {
                        blocks[x][y][z] = 2; // Grass
                    }
                }
            }
        }
    }

    public byte getBlock(int x, int y, int z) {
        return blocks[x][y][z];
    }
}
