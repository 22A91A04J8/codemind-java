import java.util.Scanner;
public class Rama
{
    public static void main(String args[])
    {
        int x,y,sum;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        sum=x%y;
        System.out.println(sum);
    }
    
}