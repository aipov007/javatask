
public class Main{

    enum Shape {
        SQUARE(4, "Equal sides and angles"),
        RECTANGLE(4, "Opposite sides equal and parallel"),
        CIRCLE(0, "Round and continuous curve"),
        TRAPEZOID(4, "One pair of opposite sides parallel"),
        RHOMBUS(4, "Equal sides, opposite angles equal"),
        TRIANGLE(3, "Three sides and angles"),
        OVAL(0, "Elliptical shape"),
        HEXAGON(6, "Six sides and angles");

        private final int sides;
        private final String description;

        Shape(int sides, String description) {
            this.sides = sides;
            this.description = description;
        }

        public int getSides() {
            return sides;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            System.out.println(shape.name() + ": " + shape.getDescription() + " (" + shape.getSides() + " sides) - ordinal value: " + shape.ordinal());
        }
    }
}