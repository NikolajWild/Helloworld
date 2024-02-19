import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1;
        int antalForsøg = 0;

        boolean rigtigeTal = true;


        while (rigtigeTal) {
            System.out.println("Gæt et tal mellem 1-10.");
            int brugersGæt = input.nextInt();
            antalForsøg++;

            if (numberToGuess == brugersGæt) {
                rigtigeTal = false;
            } else if (numberToGuess < brugersGæt) {
                System.out.println("Forkert tallet er lavere end " + brugersGæt);
            } else {
                System.out.println("Forket tallet er større end dit gæt. " + brugersGæt);
            }
        }
        System.out.println("Perfekt tallet jeg tænkte på var " + numberToGuess);
        System.out.println("Du brugte " + antalForsøg + " forsøg på at gætte mit tal.");
    }
}