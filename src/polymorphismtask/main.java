/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismtask;

/**
 *
 * @author aytaj.veyisli
 */
public class main {

    public static void main(String[] args) {
//        Car[] cars = {new BMW(), new Mercedes()};
//        driveAllCars(cars);

        BMW b = new BMW();
       // System.out.println(b.a); //1 ozununkunu gorecek
       // b.drive();//ozununkunu oxuyacaq
        
        
        Car car = new Car();
      //  System.out.println(car.a);//5 ozununkunu gorecek
       // car.drive();//ozununkunu oxuyacaq
        
        Car c = b;
        c.drive(); //bmw drive print edecek override edir eslinde drive car-in drive-di amma sadece head-i bodysi bmwnin drivedi
        //c.carMethod();//burda da isbat olunur ki yuxaridaki drive car-di 
        
        Car cr = b; //cr bmw-nin car-a aid olan hissesini gorur 
        Mechanic m = b; //m bmw-nin mechanice aid olan hissesini gorur
        cr.drive();//bmw drive
        cr.company();//mechanic copmany
        
        m.company();//mechanic company
        
        
        
    }

    public static void driveAllCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car c = cars[i];
            c.drive();
        }
    }
}
