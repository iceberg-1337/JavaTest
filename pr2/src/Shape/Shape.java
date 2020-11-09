package Shape;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape(){};

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color = color;
    }

    public void SetColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea(){
        return getArea();
    };

    public double getPerimeter(){
        return getPerimeter();
    }

    public String toString() {
        return "Perimeter @ ("+getPerimeter()+", Area @ "+getArea()+").";
    }
}
