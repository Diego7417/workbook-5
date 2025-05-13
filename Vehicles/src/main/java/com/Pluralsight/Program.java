package com.Pluralsight;

import java.util.concurrent.Callable;

public class Program {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setColor("Orange");
        System.out.println("The vehicle color :" + vehicle.getColor());
        vehicle.setNumberOfPassengers(3);
        System.out.println("Passenger capacity :" + vehicle.getNumberOfPassengers());
        vehicle.setCargoCapacity(25);
        System.out.println("Luggage capacity :" + vehicle.getCargoCapacity());
        vehicle.setFuelCapacity(28);
        System.out.println("Fuel capacity is" + " " + vehicle.getFuelCapacity() + " " + "gallons");


        Moped moped = new Moped();
        moped.setColor("Red");
        System.out.println("The moped color :" + moped.getColor());
        moped.setNumberOfPassengers(1);
        System.out.println("Moped capacity :" + moped.getNumberOfPassengers());
        moped.setCargoCapacity(1);
        System.out.println("Luggage capacity : " + moped.getCargoCapacity());
        moped.setFuelCapacity(3);
        System.out.println("Fuel capacity is" + " " + moped.getFuelCapacity() + " " + "gallons");
        moped.hasHelmet();



        Car car = new Car();
        car.setColor("Green");
        System.out.println("The van color :" + car.getColor());
        car.setNumberOfPassengers(6);
        System.out.println("Van capacity :" + car.getNumberOfPassengers());
        car.setCargoCapacity(15);
        System.out.println("Luggage capacity : " + car.getCargoCapacity());
        car.setFuelCapacity(32);
        System.out.println("Fuel capacity is" + " " + car.getFuelCapacity() + " " + "gallons");
        car.isVan();

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setColor("Blue");
        System.out.println("The semi-truck color :" + semiTruck.getColor());
        semiTruck.setNumberOfPassengers(2);
        System.out.println("Semi-truck capacity :" + semiTruck.getNumberOfPassengers());
        semiTruck.setCargoCapacity(80);
        System.out.println("Pallet capacity : " + semiTruck.getCargoCapacity());
        semiTruck.setFuelCapacity(140);
        System.out.println("Fuel capacity is" + " " + semiTruck.getFuelCapacity() + " " + "gallons");
        semiTruck.hasCabin();

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("Grey");
        System.out.println("The hovercraft color :" + hovercraft.getColor());
        hovercraft.setNumberOfPassengers(2);
        System.out.println("Hovercraft capacity :" + hovercraft.getNumberOfPassengers());
        hovercraft.setCargoCapacity(3);
        System.out.println("Luggage capacity : " + hovercraft.getCargoCapacity());
        semiTruck.setFuelCapacity(22);
        System.out.println("Fuel capacity is" + " " + semiTruck.getFuelCapacity() + " " + "gallons");
        hovercraft.engine();

    }
}
