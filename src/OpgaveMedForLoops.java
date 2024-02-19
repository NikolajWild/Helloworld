import java.util.Scanner;
public class OpgaveMedForLoops {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){

            System.out.println("2 gange " + i + " = " + i*2);}

        for (int i = 1; i <= 6; i++) {
            System.out.print(i * 2 + " ");
        }
        System.out.println();

        for (int i = 1; i <= 79; i += 15) {
            System.out.print(i + 3 + " ");
        }
        System.out.println();

        for (int i = 30; i > -20; i -= 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = -7; i < 14; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 97; i > 81; i -= 3) {
            System.out.print(i + " ");
        }

    }
}




