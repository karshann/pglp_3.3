package org.example;

import java.util.List;
import java.util.ArrayList;

public class RobotList {
    private List<Robot> Robots;

    public RobotList(){
        this.Robots=new ArrayList<>();
    }

    public void ajoutRobot(Robot r)
    {
        this.Robots.add(r);
    }

    public int nb_robot(){
        return Robots.size();
    }

    public void avancer(){
        for (int i=0 ;i<this.Robots.size();i++){
            this.Robots.get(i).avance();
        }
    }
}