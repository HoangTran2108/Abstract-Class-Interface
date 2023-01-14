public class Run {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.5, "red", false);
        shapes[1] = new Rectangle(7, 5, "yellow", false);
        shapes[2] = new Square(9, "blue", true);

        System.out.println("Pre:");
        for (Shape i : shapes) {
            System.out.println(i);
        }

        System.out.println("After:");
        for (Shape i : shapes) {
            i.resize(Math.random() * 100);
            System.out.println(i);
        }

    }
}