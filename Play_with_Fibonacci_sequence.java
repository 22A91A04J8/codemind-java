import java.util.Scanner;

public class rama
{
    public static void main(String args[])
    {
        int n,a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            System.out.printf("%d ",a);
            c=a+b;
            a=b;
            b=c;
            n--;
        }
    }
}