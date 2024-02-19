import java.util.Scanner;
public class Fortune {
    public static void main(String[] args) {
        System.out.println("Vælg et tal fra 1-10");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();
        if (inputtedNum< 5) {
            System.out.println("Enjoy the good luck");
        } else {
            System.out.println("hey");
        }


    }
}
