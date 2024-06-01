package org.demo.carDemo;

/*
CarFactory Class explains about static variable also known as class variable
 */
public class CarFactory {

    // Static variable (class variable)

    public static int totalCarProduced = 0;

    public CarFactory(){
        totalCarProduced++;
    }


}
