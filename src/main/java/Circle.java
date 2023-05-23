public class Circle implements Shape,Comparable<Shape> {

    private double radius;

    public Circle( double radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I'm a Circle with area " + getArea() );
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Shape o) {
        return (int)(this.getArea() - o.getArea());
    }
}
