public class LiterstoGallonsconverter {

    public static void main(String[] args){
        double gallons, liters;
        int counter = 0;

        counter = 0;

        for(gallons = 1; gallons <= 100; gallons += 4){
            liters = gallons * 3.79;

            System.out.println(liters+ " liters = " + gallons + "");
            counter ++;

            if (gallons == 1) {System.out.println("gallon");
            }

            if (gallons > 1) {System.out.println("gallons");
            }

            if (counter == 5){
                System.out.println("");
                counter = 0;
            }
        }
        System.out.println("We are done!!!!");
    }
}