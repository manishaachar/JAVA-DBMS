package Java;

class method
{
    double b,h,l,a,w;
}

public class method_over{
    double b;
    double h;
    double l;
method_over(double b,double h, doublel)
{
    this.b=b;
    this.h=h;
    this.l=l;
}
// method_over(double l)
// {
//     this.l=l;
// }


// Area of triangle
double area()
{
 return 1/2*b*h;
}

// area of square
double area(double l)
{
 return 1/2*l*l;
}

// void print()
// {
//     System.out.println("Method overloading");
// }
void print(double a)
{
    System.out.println("Arae of Triangle=" +a);
}

void print(double a)
{
    System.out.println("Arae of square=" +a);
}

public static void main(String[] args) 
{
    double a1;
    method_over triangle = new method_over(10, 20);
    method_over square =new method()
    //const_demo cube= new const_demo(10);
   // double v1= cuboid.volume();
    //double v2= cube.volume();
    a1=triangle.area();
    //v2=cube.volume();
    triangle.print();
    //cuboid.print();
    triangle.print(a1);
    //cuboid.print(v2);
}


}
