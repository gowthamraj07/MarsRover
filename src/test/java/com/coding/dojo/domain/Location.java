package com.coding.dojo.domain;

public class Location {
    private int x;
    private int y;

    public Location(int xAxis, int yAxis) {
        x = xAxis;
        y = yAxis;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int i) {
        this.y = i;
    }
}
