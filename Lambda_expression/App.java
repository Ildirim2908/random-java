package Lambda_expression;
import java.math.*;
public class App {
    public static boolean isPalindrome(int num) {
        String original = String.valueOf(num);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
    public static void main(String[] args) {
        int x=17;
        System.out.println("Your number is: "+x);
        IsOdd isodd = (a) -> {
            if((a%2)==0){
                System.out.println("Number is even!");
            }
            else{
                System.out.println("Number is odd!");
            }
        };
        isodd.checking(x);
        IsPrime isprime = (b) -> {
            System.out.print("Prime?: ");
            System.out.println(BigInteger.valueOf(b).isProbablePrime(10));
        };
        isprime.checker(x);
        IsPalindrome ispalindrome = (c) -> {
            System.out.print("Palindrome?: ");
            System.out.println(isPalindrome(c));
        };
        ispalindrome.checkerr(x);
    }
}
