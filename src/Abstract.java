public class Abstract
{
public static void main(String [] args)
{
    Rechtangle r=new Rechtangle();
    r.length=10;
    r.width=20;
    System.out.println("Area of rechtangle="+ r.getArea());


    Circle c=new Circle();
    c.radius=10;
    c.getArea();
    System.out.println("Area of circle="+ c.getArea());
}
}
