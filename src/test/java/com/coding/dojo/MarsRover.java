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
        for(Character command : direction) {
            moveTo(command);
        }
    }

    private void moveTo(Character command) {

        if (command == 'b') {
            switch (facing) {
                case NORTH:
                    location.decrementY();
                    break;
                case SOUTH:
                    location.incrementY();
                    break;
                case EAST:
                    location.decrementX();
                    break;
                case WEST:
                    location.incrementX();
                    break;
            }
        }

        if (command == 'f') {
            switch (facing) {
                case NORTH:
                    location.incrementY();
                    break;
                case SOUTH:
                    location.decrementY();
                    break;
                case EAST:
                    location.incrementX();
                    break;
                case WEST:
                    location.decrementX();
                    break;
            }
        }
    }
}
