class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void area() {
        System.out.println("Unknown area");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public Rectangle(double side) {
        this(side, side); // Calls the two-argument constructor for squares
    }

    @Override
    public void area() {
        double area = length * width;
        System.out.println("Area of " + name + ": " + area);
    }
}