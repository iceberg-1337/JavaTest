package Movable;

public class MovableCircle {
    public int radius;
    public MovablePoint center;
        

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;

    }

    public void moveUp(int y, int ySpeed) {
        y = y + ySpeed;
    }

    ;

    public void moveDown(int y, int ySpeed) {
        y = y - ySpeed;
    }

    ;

    public void moveLeft(int x, int xSpeed) {
        x = x + xSpeed;
    }

    ;

    public void moveRight(int x, int xSpeed) {
        x = x - xSpeed;
    }
}
