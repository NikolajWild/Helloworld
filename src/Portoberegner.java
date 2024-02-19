import java.util.Scanner;

public class Portoberegner {
    public static void main(String[] args) {
        int pris = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Indsæt vægten af pakken her. ");

        int gram = input.nextInt();

        if (gram > 0 && gram <= 2000) {
            if (gram <= 0) {
                pris = 0;
            } else if (gram <= 100) {
                pris = 25;
            } else if (gram <= 250) {
                pris = 50;
            } else if (gram <= 2000) {
                pris = 75;
            }
            System.out.println("Et brev med denne vægt koster " + pris + "kr.");
        } else {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
        }

        input.close();
    }
}




