package org.example;

public class Robot extends RobotStatique {
    private Position position;
    public Robot(int x,int y){
        super();
        this.position= new Position(x,y);
    }

    public Robot(int x,int y, Direction d){
        super(d);
        this.position= new Position(x,y);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void avance(){
        switch (this.direction){
            case EST:
                this.getPosition().setX(this.getPosition().getX()+1);
                break;
            case SUD:
                this.getPosition().setY(this.getPosition().getY()-1);
                break;
            case NORD:
                this.getPosition().setY(this.getPosition().getY()+1);
                break;
            case OUEST:
                this.getPosition().setX(this.getPosition().getX()-1);
                break;
            default:
                break;
        }
    }
}