package com.coding.dojo;

import com.coding.dojo.domain.Facing;
import com.coding.dojo.domain.Location;

import java.util.List;

public class MarsRover {

    private final Location location;
    private Facing facing;

    public MarsRover(int xAxis, int yAxis, Facing facing) {
        this.facing = facing;
        location = new Location(xAxis, yAxis);
    }

    public Location location() {
        return location;
    }

    public void move(List<Character> direction) {
        if (direction.get(0) == 'b') {
            int multiplicationFactor = 1;
            if (facing == Facing.NORTH) {
                multiplicationFactor = -1;
            }

            location.setY(multiplicationFactor * direction.size());
        } else if (direction.get(0) == 'f') {
            location.setX(direction.size());
        }
    }
}
