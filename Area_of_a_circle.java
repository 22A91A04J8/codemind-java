import java.util.Scanner;
 
public class Circle {
    public static void main(String args[]) {
        int r;
        double pi=3.14,area;
        Scanner s= new Scanner(System.in);
        r= s.nextInt();
        area=pi*r*r;
        
 
       
 
        System.out.printf("%.2f",area);
}
}