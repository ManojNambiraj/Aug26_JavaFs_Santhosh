package Files;

import java.io.FileInputStream;

public class Main {
    static void main(String[] args) {
        try{
            FileInputStream fs = new FileInputStream("data.txt");

            int data;

            while( (data = fs.read()) != -1){
                System.out.println((char)data);
            }

            fs.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
