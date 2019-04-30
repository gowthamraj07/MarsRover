package com.coding.dojo;

import com.coding.dojo.domain.Facing;
import com.coding.dojo.domain.Location;

public class MarsRover {

    private final Location location;

    public MarsRover(int xAxis, int yAxis, Facing facing) {
        location = new Location(xAxis, yAxis);
    }

    public Location location() {
        return location;
    }

    public void move(char[] direction) {
        if (direction[0] == 'b') {
            location.setY(-1);
        }
        else {
            location.setX(1);
        }
    }
}
