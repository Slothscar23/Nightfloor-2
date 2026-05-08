package com.nightfloor;

public class Player {
    public double x;
    public double y;
    private final int size;
    private final double speed;

    public Player(double initialX, double initialY, int size, double speed) {
        this.x = initialX;
        this.y = initialY;
        this.size = size;
        this.speed = speed;
    }

    public void move(boolean up, boolean down, boolean left, boolean right, int windowWidth, int windowHeight) {
        double newX = this.x;
        double newY = this.y;

        if (up) newY -= this.speed;
        if (down) newY += this.speed;
        if (left) newX -= this.speed;
        if (right) newX += this.speed;

        // Boundary collision
        this.x = Math.max(110, Math.min(windowWidth - 110, newX));
        this.y = Math.max(this.size + 20, Math.min(windowHeight - this.size - 20, newY));
    }

    public int getSize() {
        return this.size;
    }
}