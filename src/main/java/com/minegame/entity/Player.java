package com.minegame.entity;

public class Player {
    private float x, y, z;
    private float rotationX, rotationY;

    public Player(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void move(float dx, float dy, float dz) {
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }

    public float getX() { return x; }
    public float getY() { return y; }
    public float getZ() { return z; }
}
