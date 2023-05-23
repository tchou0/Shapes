public class Triangle implements Shape, Drawable{

    double base ;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("I'm a Triangle with area " + getArea() );

    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public int compareTo(Shape o) {
        return (int)(this.getArea() - o.getArea());
    }
}
