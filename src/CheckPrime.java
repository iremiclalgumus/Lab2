import java.util.Scanner;
public class CheckPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;

        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= input.nextInt();
        if(isPrime(number)){
            System.out.println(number+"is prime");

        }else {
            System.out.println(number + "is not prime");
            System.out.println(number + "is not prime");

        }
    }

}
