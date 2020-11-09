package Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
            System.out.println(s1);
            System.out.println(s1.getArea());
            System.out.println(s1.getPerimeter());
            System.out.println(s1.getColor());
            System.out.println(s1.isFilled());

        Shape s2 = new Rectangle(1.0, 2.0, "RED", false);
            System.out.println(s2);
            System.out.println(s2.getArea());
            System.out.println(s2.getPerimeter());
            System.out.println(s2.getColor());
            System.out.println(s2.isFilled());

        Shape s3 = new Square(6.6);
            System.out.println(s3);
            System.out.println(s3.getArea());
            System.out.println(s3.getPerimeter());
            System.out.println(s3.getColor());
            System.out.println(s3.isFilled());
        
    }
}
