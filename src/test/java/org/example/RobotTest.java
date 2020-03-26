package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest {

    @Test
    public void testRobot(){
        Robot r = new Robot(1,2);
        assertEquals(r.getPosition().getX(),1);
        assertEquals(r.getPosition().getY(),2);
    }

    @Test
    public void avance() {
        Robot r = new Robot(0,1);
        r.avance();
        assertEquals(r.getPosition().getX(),0);
        assertEquals(r.getPosition().getY(),2);
    }

}