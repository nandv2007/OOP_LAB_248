import java.util.Scanner;
public class Exp3{
    public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
        System.out.println("Assignment Operation");
	System.out.print("Enter a number: ");
        int n = sc.nextInt();
        n += 5;  
        System.out.println("After n+=5 : " + n);
        n *= 4;  
        System.out.println("After n*=4 : " + n);
        n -= 3;
        System.out.println("After n-=3 : " + n);
        n /= 2;  
        System.out.println("After n/=2 : " + n);
        n %= 6;
        System.out.println("After n%=6 : " + n);
    }
}