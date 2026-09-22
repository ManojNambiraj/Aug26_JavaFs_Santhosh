package Abst_Poly;

abstract class Student {
    abstract void Marks();
}

class MyMarks  {
    void Marks(){
        System.out.println("My marks is 80%");
    }
}

public class MyAbc  {
    static void main(String[] args) {
        MyMarks obj = new MyMarks();
        obj.Marks();
    }
}
