package Overload;

public class Shape {

    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("A new shape is created");
        this.shapeName = "Undefined shape";
    }

    public Shape(double radius){
        System.out.println("A circle is created");
        this.shapeName = "Circle";
    }

    public Shape(int edges, double edgeLength){
        System.out.println("A square is created");
        this.shapeName = "Square";
        this.numberOfEdges = 4;
    }

    public Shape(int edges, double e1, double e2){
        System.out.println("A rectangle is created");
        this.shapeName = "Rectangle";
        this.numberOfEdges = 4;
    }

    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("A triangle is created");
        this.shapeName = "Triangle";
        this.numberOfEdges = 3;
    }

    public String getShapeDetails(){
        return "Shape name: " + shapeName + "\n" + "Number of edges : " + numberOfEdges;
    }
}
