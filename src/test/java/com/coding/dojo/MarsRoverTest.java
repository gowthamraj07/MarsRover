package com.coding.dojo;


import com.coding.dojo.domain.Facing;
import com.coding.dojo.domain.Location;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void shouldMove1StepForward_FromOriginFacingEast() {
        MarsRover rover = new MarsRover(0, 0, Facing.EAST);

        List<Character> direction = Collections.singletonList('f');
        rover.move(direction);

        assertEquals(new Location(1,0), rover.location());
    }

    @Test
    public void shouldMove1StepBackward_FromOriginFacingNorth() {
        MarsRover rover = new MarsRover(0, 0, Facing.NORTH);

        List<Character> direction = Collections.singletonList('b');
        rover.move(direction);

        assertEquals(new Location(0, -1), rover.location());
    }

    @Test
    public void shouldMove4StepsBackward_FromOriginFacingNorth() {
        MarsRover rover = new MarsRover(0, 0, Facing.NORTH);

        List<Character> direction = Arrays.asList('b', 'b', 'b', 'b');
        rover.move(direction);

        assertEquals(new Location(0, -4), rover.location());
    }

    @Test
    public void shouldMove4StepsBackward_FromOriginFacingSouth() {
        MarsRover rover = new MarsRover(0, 0, Facing.SOUTH);

        List<Character> direction = Arrays.asList('b', 'b', 'b', 'b');
        rover.move(direction);

        assertEquals(new Location(0, 4), rover.location());
    }

    @Test
    public void shouldMove4StepsBackward_FromOriginFacingEast() {
        MarsRover rover = new MarsRover(0, 0, Facing.EAST);

        List<Character> direction = Arrays.asList('b', 'b', 'b', 'b');
        rover.move(direction);

        assertEquals(new Location(-4, 0), rover.location());
    }

    @Test
    public void shouldMove4StepsBackward_FromOriginFacingWest() {
        MarsRover rover = new MarsRover(0, 0, Facing.WEST);

        List<Character> direction = Arrays.asList('b', 'b', 'b', 'b');
        rover.move(direction);

        assertEquals(new Location(4, 0), rover.location());
    }

    @Test
    public void shouldMove4StepsForward_FromOriginFacingWest() {
        MarsRover rover = new MarsRover(0, 0, Facing.WEST);

        List<Character> direction = Arrays.asList('f', 'f', 'f', 'f');
        rover.move(direction);

        assertEquals(new Location(-4, 0), rover.location());
    }

    @Test
    public void shouldMove4StepsForward_FromOriginFacingNorth() {
        MarsRover rover = new MarsRover(0, 0, Facing.NORTH);

        List<Character> direction = Arrays.asList('f', 'f', 'f', 'f');
        rover.move(direction);

        assertEquals(new Location(0, 4), rover.location());
    }

    @Test
    public void shouldMove4StepsForward_FromOriginFacingSouth() {
        MarsRover rover = new MarsRover(0, 0, Facing.SOUTH);

        List<Character> direction = Arrays.asList('f', 'f', 'f', 'f');
        rover.move(direction);

        assertEquals(new Location(0, -4), rover.location());
    }

    @Test
    public void shouldStayAtSamePosition_WhenMovingForwardAndBackward2TimesEachAnyDirection() {
        MarsRover rover = new MarsRover(0, 0, Facing.SOUTH);

        List<Character> direction = Arrays.asList('f', 'f', 'b', 'b');
        rover.move(direction);

        assertEquals(new Location(0, 0), rover.location());
    }
}
