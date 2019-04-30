package com.coding.dojo;


import com.coding.dojo.domain.Facing;
import com.coding.dojo.domain.Location;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void shouldMove1StepForward_FromOriginFacingEast() {
        int xAxis = 0;
        int yAxis = 0;
        Facing facing = Facing.EAST;
        MarsRover rover = new MarsRover(xAxis, yAxis, facing);

        char[] direction = new char[1];
        direction[0] = 'f';
        rover.move(direction);
        Location location = rover.location();

        assertEquals(1, location.getX());
        assertEquals(0, location.getY());
    }

    @Test
    public void shouldMove1StepBackward_FromOriginFacingNorth() {
        int xAxis = 0;
        int yAxis = 0;
        Facing facing = Facing.NORTH;
        MarsRover rover = new MarsRover(xAxis, yAxis, facing);

        char[] direction = new char[1];
        direction[0] = 'b';
        rover.move(direction);
        Location location = rover.location();

        assertEquals(0, location.getX());
        assertEquals(-1, location.getY());
    }

    @Test
    public void shouldMove4StepsBackward_FromOriginFacingNorth() {
        int xAxis = 0;
        int yAxis = 0;
        Facing facing = Facing.NORTH;
        MarsRover rover = new MarsRover(xAxis, yAxis, facing);

        char[] direction = new char[4];
        direction[0] = 'b';
        direction[1] = 'b';
        direction[2] = 'b';
        direction[3] = 'b';
        rover.move(direction);
        Location location = rover.location();

        assertEquals(0, location.getX());
        assertEquals(-4, location.getY());
    }
}
