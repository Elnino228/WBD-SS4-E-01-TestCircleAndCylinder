public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(5.0,"green");
        System.out.println(circle);

        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(3.0,4.0,"yellow");
        System.out.println(cylinder);
    }
}
class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle(){
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public  double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString(){
        return "A circle has radius equal "+radius
                +" and color is "+color;
    }

}
class Cylinder extends Circle{
    private double height=1.0;

    public Cylinder(){
    }
    public Cylinder(double radius,double height,String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString(){
        return "A cylinder has height equal "+height
                +" and is subclass of "+super.toString();
    }

}
