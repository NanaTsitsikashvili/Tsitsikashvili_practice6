
public static void main(String[] args) {
    Car car1 = new Car("BMW", 2023, 25000.00);
    Car car2 = new Car("Mercedes Benz", 2022, 22000.00);

    Car car3 = new Car("Range Rover", 2020, 45000.00);
    Car car4 = new Car("Toyota", 2023, -50000.00);
    Car car5 = new Car("Mazda", 2025, 35000.00);


    car1.displayDetails();
    System.out.println();
    car2.displayDetails();
    System.out.println();
    car3.displayDetails();
    System.out.println();
    car4.displayDetails();
    System.out.println();
    car5.displayDetails();
    System.out.println();


    Dog dog = new Dog("Toy", "Vegetable", "Toy Poodle");
    dog.displayInfo();
    System.out.println(); // Blank line for spacing


    Rectangle rectangle = new Rectangle(5, 10);
    rectangle.area();
    System.out.println(); // Blank line for spacing


    Employee emp = new Employee("Tamar Ghlonti", 50000);
    emp.displayDetails();
    System.out.println(); // Blank line for spacing


    Manager mgr = new Manager("Ketevani Ghlonti", 80000, "Quality Assurance");
    mgr.displayDetails();
}