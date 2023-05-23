import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(12);
        Shape s = new Square(12);
        Drawable t = new Triangle(12,12);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c);
        shapes.add(s);
        shapes.add(new Circle((4)));
        shapes.add(new Square((3)));
        shapes.add(new Circle((12)));
        shapes.add(new Square((5)));
        shapes.add(new Circle((7)));
        shapes.add(new Square((9)));



        for (Shape shape: shapes){
            shape.draw();
        }
        Collections.sort(shapes);

        for (Shape shape: shapes){
            shape.draw();
        }

        ArrayList<Circle> circles = new ArrayList<>();
        circles.add((new Circle(1)));
        circles.add((new Circle(46)));
        circles.add((new Circle(15)));
        circles.add((new Circle(11)));
        circles.add((new Circle(176)));
//        Collections.sort(circles.new CircleComparator ());

        for (Shape shape: circles) {
            shape.draw();
        }

    }

}
