package Task4;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint movablePoint;

    public MovableCircle(int radius, MovablePoint movablePoint) {
        this.radius = radius;
        this.movablePoint = movablePoint;
    }

    @Override
    public void moveUp() {
        //  movablePoint.setY(movablePoint.getY() + movablePoint.getxSpeed());
        System.out.println("Moving circle up");
        movablePoint.moveUp();

    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();

    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();

    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }
}
