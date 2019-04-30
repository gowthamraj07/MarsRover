package com.coding.dojo;


import com.coding.dojo.domain.Facing;
import com.coding.dojo.domain.Location;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void shouldMove1StepForward_FromOriginFacingEast() {
        int xAxis = 0;
        int yAxis = 0;
        Facing facing = Facing.EAST;
        MarsRover rover = new MarsRover(xAxis, yAxis, facing);

        List<Character> direction = new LinkedList<Character>();
        direction.add('f');
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

        List<Character> direction = new LinkedList<Character>();
        direction.add('b');
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

        //char[] direction = new List[4];
        List<Character> direction = new LinkedList<Character>();
        direction.add('b');
        direction.add('b');
        direction.add('b');
        direction.add('b');
        rover.move(direction);
        Location location = rover.location();

        assertEquals(0, location.getX());
        assertEquals(-4, location.getY());
    }

    @Test
    public void shouldMove4StepsBackward_FromOriginFacingSouth() {
        int xAxis = 0;
        int yAxis = 0;
        Facing facing = Facing.SOUTH;
        MarsRover rover = new MarsRover(xAxis, yAxis, facing);

        //char[] direction = new List[4];
        List<Character> direction = new LinkedList<Character>();
        direction.add('b');
        direction.add('b');
        direction.add('b');
        direction.add('b');
        rover.move(direction);
        Location location = rover.location();

        assertEquals(0, location.getX());
        assertEquals(4, location.getY());
    }
}
