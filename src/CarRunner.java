import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CarRunner {

    public static void main(String[] args) {
        Car[] cars = new Car[5];

        cars[0] = new Car(1, "BMW", "M3", 2012, "Red", 10000L, "AP000PA");
        cars[1] = new Car(2, "BMW", "M3",2016 , "Green", 18000L, "AP111PA");
        cars[2] = new Car(3, "BMW", "M3", 2012, "Blue", 12000L, "AP222PA");
        cars[3] = new Car(4, "Mersedes-Benz", "GLS",2020 , "Black", 30000L, "AP333PA");
        cars[4] = new Car(5, "Audi", "Q7", 2019, "White", 25000L, "AP444PA");

        //Task a
        Scanner console = new Scanner(System.in);
        System.out.println("Task a)\nEnter mark:");
        String mark = console.next();

        Car.get_cars_by_mark(cars, mark);

        //Task b
        System.out.println("Task b)\nEnter model:");
        String model = console.next();
        System.out.println("\nEnter years of exploitation:");
        int years = console.nextInt();

        Car.get_cars_by_model_and_date(cars, model, years);

        //Task c
        System.out.println("Task c)\nEnter date:");
        int date = console.nextInt();
        System.out.println("\nEnter price:");
        Long price = console.nextLong();

        Car.get_cars_by_date_and_price(cars, date, price);
    }
}
