package com.coding.dojo;

import com.coding.dojo.domain.Facing;
import com.coding.dojo.domain.Location;

import java.util.List;

public class MarsRover {

    private final Location location;

    public MarsRover(int xAxis, int yAxis, Facing facing) {
        location = new Location(xAxis, yAxis);
    }

    public Location location() {
        return location;
    }

    public void move(List<Character> direction) {
        if (direction.get(0) == 'b') {
            location.setY(-direction.size());
        }
        else if (direction.get(0) == 'f') {
            location.setX(direction.size());
        }
    }
}
