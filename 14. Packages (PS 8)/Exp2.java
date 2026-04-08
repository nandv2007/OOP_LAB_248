import Exp2.*;

public class Exp2 {
    public static void main(String[] args) {
        Operations op = new Operations();
        Subtraction sub = new Subtraction();
        System.out.println("Multiply = " + op.multiply(5, 4));
        System.out.println("Subtract = " + sub.subtract(10, 3));
    }
}