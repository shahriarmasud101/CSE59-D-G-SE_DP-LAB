
public class Main2{
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5,4),
            new Circle(3)
        };
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area: "+ calculator.calculateTotalArea(shapes));
    }
}


interface Shape {
    double CalculateArea();
}
class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double CalculateArea(){
        return length * width;
    }
}
class Circle implements  Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public double CalculateArea(){
        return Math.PI * radius * radius;

    }
}
class AreaCalculator{
    public double calculateTotalArea(Shape[] shapes){
        double totalArea=0;

        for ( Shape shape : shapes){
            totalArea += shape.CalculateArea();
        }
        return totalArea;
    }
}
