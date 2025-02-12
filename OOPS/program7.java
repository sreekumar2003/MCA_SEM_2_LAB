import java.util.Scanner;

interface printable {
    public void display();
    public void show();
}
interface computable {
    public double area();
    public double perimeter();
    public double volume();
}
interface drawable{
    public void draw();
}
class rectangle implements printable, computable, drawable {
    double l;
    double b;
    public rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    public void display(){
        System.out.println("Length: "+l+"width: "+b);
    }
    public void show(){

    }
    public double area(){
        return l*b;
    }
    public double perimeter(){
        return 2*(l+b);
    }
    public double volume(){
        return 0;
    }
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}
class sphere implements printable, computable, drawable{
    double r;
    public sphere(double r) {
        this.r = r;
    }
    public void display(){
        System.out.println("Radius: "+r);
    }
    public void show(){

    }
    public double area(){
        return 4*3.14*r*r;
    }
    public double perimeter(){
        return 2*3.14*r;
    }
    public double volume(){
        return (4.0/3.0)*3.14*r*r;
    }
    public void draw(){
        System.out.println("Drawing a Sphere");
    }
}
public class valuedemo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        double l=sc.nextDouble();
        System.out.println("Enter the width of rectangle");
        double w = sc.nextDouble();
        System.out.println("Enter the radius of sphere");
        double r = sc.nextDouble();
        rectangle r1 = new rectangle(l,w);
        sphere s1 = new sphere(r);
        r1.display();
        r1.show();
        System.out.println("Area of reatangle is : "+r1.area());
        System.out.println("perimeter of rectangle is: "+r1.perimeter());
        System.out.println("Volume of rectangle is: "+r1.volume());
        r1.show();

        s1.display();
        s1.show();
        System.out.println("Area of Sphere is : "+s1.area());
        System.out.println("perimeter of Sphere is: "+s1.perimeter());
        System.out.println("Volume of Sphere is: "+s1.volume());
        s1.show();
        sc.close();
    }
}
