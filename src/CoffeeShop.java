import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("A -> Americano ");
        System.out.println("C -> Cappucino  ");
        System.out.println("L -> Latte      ");
        System.out.println("E -> Espresso   ");

        String coffee = input.nextLine();
        switch(coffee){
            case"A":
                System.out.println("A -> Americano $3.00 ");
            break;

            case"C":
                System.out.println("C -> Cappucino $3.75 ");
                break;

            case"L":
                System.out.println("L -> Latte     $4.00 ");
                break;

            case"E":
                System.out.println("E -> Espresso  $2.50 ");
                break;
            default:
                System.out.println("invalid");
        }


    }
}
