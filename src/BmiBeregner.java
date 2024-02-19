import java.util.Scanner;

public class BmiBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("BMI værktøj, indsæt venligst først din højde i meter her: ");
        double bmiHøjdeIMeter = input.nextDouble();

        System.out.println("Indsæt venligst din vægt i KG her: ");
        int bmiVægtIKG = input.nextInt();

        double resultatAfBmi = bmiVægtIKG / (bmiHøjdeIMeter * bmiHøjdeIMeter);
        System.out.println("Din BMI er: " + resultatAfBmi);

        if (resultatAfBmi <= 18.5) {
            System.out.println("Du er undervægtig.");
        } else if (resultatAfBmi <= 25) {
            System.out.println("Du er normalvægtig.");
        } else if (resultatAfBmi <= 30) {
            System.out.println("Du er overvægtig.");
        } else  {
            System.out.println("Du er svært overvægtig.");
        }
    }
}


