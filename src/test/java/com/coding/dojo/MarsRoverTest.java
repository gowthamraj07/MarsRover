package com.coding.dojo;


import com.coding.dojo.domain.Facing;
import com.coding.dojo.domain.Location;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void shouldMove1StepForward_FromOriginPointingNorth() {
        int xAxis = 0;
        int yAxis = 0;
        Facing facing = Facing.NORTH;
        MarsRover rover = new MarsRover(xAxis, yAxis, facing);

        char[] direction = new char[1];
        direction[0] = 'f';
        rover.move(direction);
        Location location = rover.location();

        assertEquals(1, location.getX());
        assertEquals(0, location.getY());
    }
}
