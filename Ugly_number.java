import java.util.Scanner;
public class ugly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        while(n!=1)
        {
            if(n%5==0)
            {
                n/=5;
            }
            else if(n%3==0)
            {
                n/=3;
            }
            else if(n%2==0)
            {
                n/=2;
            }
            else
            {
                System.out.println("Not Ugly Number");
                c=1;
                break;
            }
        }
        if(c==0){
            System.out.println("Ugly Number");
        }
    }
}