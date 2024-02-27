package poli2;

import poli.B;

public class Main {
    public static void main(String[] args) {
//   1     Car[] cars = {new Bmw(), new Mercedes()};
//        driveAllCars(cars);
   Bmw b =new Bmw();
   b.drive();
        System.out.println(b.a);

  Car c = b;
  c.drive();
        System.out.println(c.a);
        //t6ilk78k
    }

//1    public static void driveAllCars(Car[] cars) {
//        for (int i = 0; i < cars.length; i++) {
//            Car c = cars[i];
//            c.drive();
//        }
//    }

}