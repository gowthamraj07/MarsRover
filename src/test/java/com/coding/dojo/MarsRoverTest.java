package com.coding.dojo;


import com.coding.dojo.domain.Location;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void shouldMove1StepForward() {
        MarsRover rover = new MarsRover();

        char[] direction = new char[1];
        direction[0] = 'f';
        rover.move(direction);
        Location location = rover.location();

        assertEquals(1, location.getX());
        assertEquals(0, location.getY());
    }
}
