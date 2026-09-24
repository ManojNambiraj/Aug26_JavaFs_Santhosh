package MyExceptions;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Demo {

    static void display() throws InvalidAgeException {
        int age = 17;

        if (age > 18) {
            System.out.println("Eligible for voting");
        } else {
            throw new InvalidAgeException("Not Eligible");
        }
    }

    public static void main(String[] args) {
        try{
            display();
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
