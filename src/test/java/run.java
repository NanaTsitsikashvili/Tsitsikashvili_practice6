
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
