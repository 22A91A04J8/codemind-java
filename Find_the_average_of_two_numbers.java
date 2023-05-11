import java.util.Scanner;
public class Rama
{
    public static void main(String args[])
    {
        float x,y,z;
        Scanner sc=new Scanner(System.in);
        x=sc.nextFloat();
        y=sc.nextFloat();
        z=(x+y)/2;
        System.out.printf("%.4f",z);
    }
    
}