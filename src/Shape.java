interface Shape {
    String getName();
    double area();
}
class Circle implements Shape{
    int rad;
    public Circle(int rad) {
        this.rad = rad;
    }
    public String getName(){
        return "Circle";
    }
    public double area(){
        return Math.PI*Math.pow(rad,2);
    }
}
class Rectangle implements Shape{
    int l,b;
    public Rectangle(int l,int b) {
        this.l = l;
        this.b = b;
    }
    public double area(){
        return l*b;
    }
    public String getName(){
        return "Rectangle";
    }
}

class UseShape{
    public static void main(String[] args) {
        Shape p;
        //Run-Time Poly
        p=new Circle(5);
        System.out.println(p.getName());
        System.out.println(p.area());

        p=new Rectangle(10,20);
        System.out.println(p.getName());
        System.out.println(p.area());
    }
}