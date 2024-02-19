public class ArrayOpgave {
    public static void main(String[] args) {
        String[] minArray = new String[]{"Hej", "med", "dig"};
        for (String ord : minArray) {
            System.out.print(ord + " ");
        }
        System.out.println();

        Double[] værdier = new Double[]{3.4, 2.5, 1.2, 6.7};

            System.out.println(værdier[2]);
            System.out.println(værdier.length);
            //System.out.println(værdier[4]);


        int[] myArray = new int[8];
        myArray[0] = 34;
        myArray[7] = 117;
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
