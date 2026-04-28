import java.util.*;
public class magicnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        int rev=0;
        while(sum>0){
            int digit = sum % 10;
            rev=rev*10+digit;
            sum /= 10;
        }
        int prod=sum*rev;
        if(prod == n) {
            System.out.println("The number is a magic number.");
        } else {
            System.out.println("The number is not a magic number.");
        }
    }
}