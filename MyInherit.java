class GrandParent{
    int AssetsWorth = 20000000;
}

class Parent extends GrandParent{
    private int bankBalance = 500000;
    String carname = "Honda City";
    int pocketMoney;

    Parent(int money){
        this.pocketMoney = money;
    }

    void behaviour(){
        System.out.println("Always having smiling face");
    }
}

class Ram extends Parent{
    Ram(int amount){
        super(amount);
    }
}

class Kavitha extends Parent{
    Kavitha(int amount){
        super(amount);
    }
}


public class MyInherit {
    static void main(String[] args) {
        Ram raj = new Ram(200);

        System.out.println("raj.AssetsWorth = " + raj.AssetsWorth);

    }
}
