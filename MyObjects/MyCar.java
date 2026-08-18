package MyObjects;

public class MyCar {
    int no_of_wheels;
    String color;
    int no_of_sheets;
    String fuel;

        //    Default Constructor
        //    MyCar(){
        //        System.out.println("It's a Constructor");
        //    }

//    Parameterized Constructor
    MyCar(int wheels, String colors, int sheets, String fuel_type) {
        this.no_of_wheels = wheels;
        this.color = colors;
        this.no_of_sheets = sheets;
        this.fuel = fuel_type;
    }

    void demo(int a, int b, String c) {
        System.out.println(c + ": " + (a + b));
    }
}
