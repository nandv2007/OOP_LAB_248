import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String b;
        double c;
        double d;
        double e;
	    boolean f;
        System.out.print("Enter Account Number: ");
        a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        b = sc.nextLine();
        System.out.print("Enter Balance: ");
        c = sc.nextDouble();
        System.out.print("Enter deposited amount: ");
        d = sc.nextDouble();
		e =c+d;
		System.out.println("The new balance is :" + e);
		f= e>5000;
		if(f){
			System.out.println("Minimum balence is maintained");
		}else{
			System.out.println("Minimum balence is not maintained");
	}
        
        sc.close();
    }
}

