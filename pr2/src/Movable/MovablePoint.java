package Movable;

public class MovablePoint {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    //public String toString(){}
    public void moveUp(int y, int ySpeed){
        this.y = this.y+this.ySpeed;
    };
    public void moveDown(int y, int ySpeed){
        this.y = this.y - this.ySpeed;
    };
    public void moveLeft(int x, int xSpeed){
        this.x = this.x + this.xSpeed;
    };
    public void moveRight(int x, int xSpeed){
        this.x = this.x - this.xSpeed;
    };
}
