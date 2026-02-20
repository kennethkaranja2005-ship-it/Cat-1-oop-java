Class: Showroom




import java.util.Scanner;

public class Showroom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Brand: ");

        String brand = input.nextLine();

        System.out.print("Enter Model: ");

        String model = input.nextLine();

        System.out.print("Enter Year: ");

        int year = input.nextInt();

        input.nextLine();

        System.out.print("Enter Fuel Type: ");

        String fuelType = input.nextLine();

        Car car1 = new Car(brand, model, year, fuelType);

        System.out.println("\nCar Details:");

        car1.displayDetails();

        input.close();
    }
}