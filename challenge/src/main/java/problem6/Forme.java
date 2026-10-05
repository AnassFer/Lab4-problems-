package problem6;


abstract class Forme {
    public abstract double getSurface();
}


class Square extends Forme {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square";
    }
}


class Circle extends Forme {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
