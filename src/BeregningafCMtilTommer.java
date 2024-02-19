import java.util.Scanner;
public class BeregningafCMtilTommer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hej jeg er et værktøj der bruges til at regne tommer om til cencimenter, " +
                "hvis du vil regne tommer om til cencimeter bedes du indtaste et tal her:");

        double tomme = input.nextDouble();
        final double CENTIMETER_PER_TOMME = 2.54;
        double resultat = (tomme * CENTIMETER_PER_TOMME);

        System.out.println(tomme + " tommer Svarer til " + resultat + "cm.");
    }
}
