import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {


    @Override
    public int compare(Circle o1, Circle o2) {
        return (int)(o2.getArea()- o1.getArea());
    }
}
