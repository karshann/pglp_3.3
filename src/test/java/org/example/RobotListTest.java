package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotListTest {
    @Test
    public void ajouterRobot() throws Exception {
        RobotList rList = new RobotList();
        Robot r = new Robot(0,0);
        Robot r1 = new Robot(1,0);
        rList.ajoutRobot(r);
        rList.ajoutRobot(r1);
        assertEquals(rList.nb_robot(),2);
    }

    @Test
    public void avancer() throws Exception {
        RobotList rList = new RobotList();
        rList.ajoutRobot(new Robot(0,1,Direction.NORD));
        rList.ajoutRobot(new Robot(1,4,Direction.SUD));
        rList.avancer();
    }

}