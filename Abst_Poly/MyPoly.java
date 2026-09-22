package Abst_Poly;

public class MyPoly {

    void add(int a, int b){
        System.out.println("Method 1: " + (a + b));
    }

    void add(int a, int b, int c){
        System.out.println("Method 2: " + (a + b + c));
    }

    void add(double a, double b){
        System.out.println("Method 3: " + (a + b));
    }

    static void main(String[] args) {
        MyPoly obj = new MyPoly();

        obj.add(1, 2);
        obj.add(1, 2, 6);
        obj.add(1.5, 2.6);
    }
}
