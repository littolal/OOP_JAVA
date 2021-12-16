import java.util.*;
class box
{
    int l,b,h;
    void volume()
    {
        System.out.println("Enter length,breadth,height ");
        Scanner sc =new Scanner (System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        int v = (l*b*h);
        System.out.println("Volume = "+ v);
    }
}

class Main 
{
    public static void main (String args[])
    {
        box ob1= new box();
        ob1.volume();
        box ob2= new box();
        ob2.volume();
    }
}