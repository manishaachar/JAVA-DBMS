package Java;

interface Rectangle 
{
    float area_rect(float x, float y);
}

interface Triangle 
{
    float area_tri(float x, float y);
}

class area1 implements Rectangle,Triangle{
    public float area_rect(float x, float y)
    {
        return(x*y);
    }
    public float area_tri(float x, float y)
    {
      return((x*y)/2);
    }

}
class area{
    public static void main(String[] args) {
        area1 a=new area1();
        System.out.println("Rectangle:"+a.area_rect(10,10));
        System.out.println("Triangle:"+a.area_tri(10, 10));
    }
}