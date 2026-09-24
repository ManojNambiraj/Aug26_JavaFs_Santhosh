package MyExInterface;

interface Student {
    void display();
    int a = 10;
}

class Marks {
    void Total(){
        System.out.println("Total");
    }
}

class Ram extends Marks implements Student  {
    public void display(){
        System.out.println("Demo");
    }

    static void main(String[] args) {
        Ram obj = new Ram();

        obj.display();
    }
}