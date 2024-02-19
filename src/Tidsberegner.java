import java.util.Scanner;
public class Tidsberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hvor mange timer er der gået siden midnat?");



        int hour = input.nextInt();
        System.out.println(hour);
        System.out.println("Der er gået " + hour + " timer" + " Hvor mange minutter og sekunder er der gået?");
        int minuts = input.nextInt();
        System.out.println(minuts);
        int seconds = input.nextInt();
        System.out.println(seconds);
        System.out.println("Der er nu gået " + hour + " timer " + minuts + " minutter og " + seconds + " sekunder, siden midnat");
        int resultat = hour*60*60 + minuts * 60 + seconds;
        System.out.println("Svarende til " + resultat + " sekunder");
        /*
        int sekunderSidenMidnat = 40410;
        int sekunderIndtilMidnat = 45990;
        int timeOpgaveFærdig = 11;
        int minutOpgaveFærdig = 19;
        int sekundOpgaveFærdig = 50;


        System.out.println("sekunder: " + sekunder);
        System.out.println("Siden Midnat er der gået " + sekunderSidenMidnat + " sekunder");
        System.out.println("Der er " + sekunderIndtilMidnat + " sekunder indtil midnat");
        System.out.println("Opgaven blev færdig kl: " + timeOpgaveFærdig + "." + minutOpgaveFærdig + "."+ sekundOpgaveFærdig);
        System.out.println("Det har taget 9 minutter og 8 sekunder at løse opgaven");

         */




    }
}
