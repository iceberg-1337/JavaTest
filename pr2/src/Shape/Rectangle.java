package Shape;
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "blue";
        width = 5;
        length = 4;
    }
    public Rectangle(double width, double length){
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea() {
        return length*width;
    }
    @Override
    public double getPerimeter() {
        return width*2 + length*2;
    }
    @Override
    public String toString() {
        return "Shape: rectangle, length: "+this.length+", width: "+this.width+", color: "+this.color;
    }
}
