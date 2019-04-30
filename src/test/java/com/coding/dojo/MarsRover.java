package com.coding.dojo;

import com.coding.dojo.domain.Facing;
import com.coding.dojo.domain.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarsRover {

    private final Location location;
    private Facing facing;
    private Map<Character, Integer> commandMap = new HashMap<Character, Integer>();

    public MarsRover(int xAxis, int yAxis, Facing facing) {
        this.facing = facing;
        location = new Location(xAxis, yAxis);
        commandMap.put('b', -1);
        commandMap.put('f', 1);
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

        int direction = commandMap.get(command);

        switch (facing) {
            case NORTH:
                location.addY(direction);
                break;
            case SOUTH:
                location.addY(-direction);
                break;
            case EAST:
                location.addX(direction);
                break;
            case WEST:
                location.addX(-direction);
                break;
        }
    }
}
