package Java;

class const_demo
{
    double l,b,h;

const_demo(double l,double b, double h)
{
 this.l=l;
 this.b=b;
 this.h=h;
}
const_demo(double l)
{
    l=b=h=l;
}
double volume()
{
    return l*b*h;
}

void print()
{
    System.out.println("Method overloading");
}
void print(double v)
{
    System.out.println("Volume of box="+v);
}

public static void main(String[] args) 
{
    double v1,v2;
    const_demo cuboid = new const_demo(10,20,30);
    const_demo cube= new const_demo(10);
   // double v1= cuboid.volume();
    //double v2= cube.volume();
    v1=cuboid.volume();
    v2=cube.volume();
    cube.print();
    cuboid.print();
    cube.print(v1);
    cuboid.print(v2);
}
}

