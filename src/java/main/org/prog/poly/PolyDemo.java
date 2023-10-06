package org.prog.poly;

import javax.swing.*;

public class PolyDemo {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
        Bike bike = new Bike();
        Human human = new Human();
        GasTruck gasTruck = new GasTruck();
        HugeTruck hugeTruck = new HugeTruck();

        followTheRoute(gasCar);
        followTheRoute(electricCar);
        followTheRoute(bike);
        followTheRoute(human);
        followTheRoute(gasTruck);
        followTheRoute(hugeTruck);

        gasCar.goTo(city: "Kyiv", destination: "Odessa");
        gasCar.goTo(city: "Kharkiv", destination: "Uman", passingThrough: "Kyiv");
        gasCar.goTo(city: "Lviv", destination: "Odessa", passingThrough: "Ivano-Frankivs'k", passengers:5);

    }
    public static void followTheRoute(IMovable iCar) {
        System.out.println("==========================");
        iCar.accelerate();
        iCar.turnLeft();
        iCar.accelerate();
        iCar.stop();
        iCar.turnRight();
        iCar.accelerate();
    }
}