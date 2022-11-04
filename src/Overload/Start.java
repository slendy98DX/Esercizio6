package Overload;

public class Start {

    public static void main(String[] args) {

        Shape undefinedShape = new Shape();
        Shape circle = new Shape(5);
        Shape square = new Shape(4,5);
        Shape rectangle = new Shape(4, 2, 7);
        Shape triangle = new Shape(3, 1, 3, 9);


        String shape = undefinedShape.getShapeDetails();
        String shape1 = circle.getShapeDetails();
        String shape2 = square.getShapeDetails();
        String shape3 = rectangle.getShapeDetails();
        String shape4 = triangle.getShapeDetails();

        System.out.println(shape);
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println(shape4);

    }
}
