import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by marcking2 on 7/23/17.
 */
public class CarApp2 {
    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);


        int selection = 0;  //selects from the menu
        int listNum = 0;  //identifies the elements in the array
        boolean loop = true; //controls end of loop
        String buyCar = "";

        ArrayList<Car2> carArrayList = new ArrayList<>();
        System.out.print("\n\n\nWelcome to HONEST NEWBIE'S New & Used Cars!");

//list of cars to work from in the ArrayList
        carArrayList.add(new UsedCar("BMW", "328i", 2011, 11000, 109000));
        carArrayList.add(new Car2("Ford", "Fusion", 2017, 28000));
        carArrayList.add(new UsedCar("GM", "Corvette", 2015, 30000, 78000));
        carArrayList.add(new Car2("Lexus", "GX 460", 2017, 66000));
        carArrayList.add(new UsedCar("Mercedes", "CL500", 2001, 18000, 160000));
        carArrayList.add(new Car2("Ford", "Mustang", 2017, 35000));
        carArrayList.add(new UsedCar("BMW", "740", 2010, 19000, 152000));
        carArrayList.add(new UsedCar("Ford", "Pinto", 1974, 2.63, 732.9));


        do {
            //setup columns to display information
            System.out.println("\n\n\nCurrent Inventory:");
            System.out.printf("\n\n%-2s %-12s%-12s%-12s%-18s%-18s\n", "#", "Make", "Model", "Year", "Price", "Mileage(Used Cars)");
            System.out.printf("%-2s %-12s%-12s%-12s%-18s%-18s\n", "==", "==========", "==========", "==========", "==============", "==================");

            for (Car2 x : carArrayList) {
                listNum = (carArrayList.indexOf(x) + 1);
                System.out.print(listNum + ". ");
                System.out.println(x);

            }
            System.out.println("\n" + (listNum + 1) + ". Quit");

            System.out.print("\nWhich car would you like:  ");
            selection = (scnr.nextInt() - 1);
            System.out.println("Selection--"+selection);
            System.out.println((listNum + 1));
            if (selection >= 0 && selection < (listNum + 1)) {
                System.out.print("\n\n   ");
                System.out.print(carArrayList.get(selection));

                System.out.println("\nWould you like to buy this car? (y/n)");
                scnr.next();
                buyCar = scnr.nextLine();


                if (buyCar.equalsIgnoreCase("y")) {

                    carArrayList.remove(selection - 1);
                    System.out.println("Excellent! Our finance department will be in touch shortly.");
                    selection = 0;
                }
            }

        if (selection == (listNum + 1)) {
            loop = false;

        }
    } while(loop);
        System.out.println("Have a great day!");
}
}