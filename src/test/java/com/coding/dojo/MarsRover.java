package com.coding.dojo;

import com.coding.dojo.domain.Location;

public class MarsRover {

    private final Location location = new Location();

    public Location location() {
        return location;
    }

    public void move(char[] direction) {
        location.setX(1);
    }
}
