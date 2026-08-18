//        OOPs --> Object-Oriented Programming Languages
//          1. class
//          2. Object
//          3. Inheritance
//          4. Encapsulation
//          5. Abstraction
//          6. Polymorphism

package MyObjects;

public class Myoops {
    static void main(String[] args) {
        MyCar honda = new MyCar(4, "Blue", 5, "Petrol");
        MyCar hyundai = new MyCar(5, "red", 7, "EV");

        System.out.println("Honda:");
        System.out.println(honda.no_of_wheels);
        System.out.println(honda.color);
        System.out.println(honda.no_of_sheets);
        System.out.println(honda.fuel);

        System.out.println("Hyundai:");
        System.out.println(hyundai.no_of_wheels);
        System.out.println(hyundai.color);
        System.out.println(hyundai.no_of_sheets);
        System.out.println(hyundai.fuel);

        honda.demo(2, 5, "Honda");
        hyundai.demo(7, 2, "Hyundai");
    }
}
