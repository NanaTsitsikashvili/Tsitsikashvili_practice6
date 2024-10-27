public class Car {

    private String model;
    private int year;
    private double price;


    public Car(String model, int year, double price) {
        this.model = model;


        if (year >= 2000 && year <= 2024) {
            this.year = year;
        } else {
            System.out.println("Error: Year must be between 2000 and 2024");
            this.year = 2024;
        }


        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative");
            this.price = 0;
        }
    }

  
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Car car1 = new Car("BMW", 2023, 25000.00);
        Car car2 = new Car("Mercedes benz", 2022, 22000.00);


        Car car3 = new Car("Range Rover", 1999, 45000.00);  // Invalid year
        Car car4 = new Car("Toyota", 2023, -50000.00);        // Invalid price
        Car car5 = new Car("Mazda", 2025, 35000.00);   // Invalid year



        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
        car4.displayDetails();
        car5.displayDetails();

    }

}