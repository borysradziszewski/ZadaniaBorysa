package Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5,2,3,4);
        MovableCircle movableCircle = new MovableCircle(4,movablePoint);

        List<Movable> movablesList = new ArrayList<>();

        movablesList.add(movablePoint);
        movablesList.add(movableCircle);

        movablesList.forEach(movable -> movable.moveUp());


    }
}
