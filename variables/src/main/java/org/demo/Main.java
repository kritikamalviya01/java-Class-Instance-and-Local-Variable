package org.demo;

import org.demo.carDemo.Car;
import org.demo.carDemo.CarFactory;
import org.demo.carDemo.CarLocal;


public class Main {
    public static void main(String[] args) {

        // class variable or static variable
        CarFactory car1 = new CarFactory();
        CarFactory car2 = new CarFactory();
        CarFactory car3 = new CarFactory();

        System.out.println("Total car produced: "+ CarFactory.totalCarProduced); // Output = 3

        // Testing Instance Variable
        System.out.println();

        Car carValue1 = new Car(10000);
        Car carValue2 = new Car(20000);
        Car carValue3 = new Car(15000);

        System.out.println("Car 1 Mileage: " + carValue1.getMileage());
        System.out.println("Car 2 Mileage: " + carValue2.getMileage());
        System.out.println("Car 3 Mileage: " + carValue3.getMileage());

        //Testing Local Variable

        System.out.println();

        CarLocal carLocal = new CarLocal();
        int efficiency = carLocal.calculateFuelEfficiency(500,25);
        System.out.println("Fuel efficiency: " + efficiency);
    }
}