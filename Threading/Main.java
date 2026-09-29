package Threading;

class StudentThread extends Thread{
    public void run(){
        try{
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                System.out.println("Thread 1:" + i);
            }

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

class TeacherThread extends Thread{
    public void run(){
        try{
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                System.out.println("Thread two:" + i);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class Main {
    static void main(String[] args) {
        StudentThread t1 = new StudentThread();
        TeacherThread t2 = new TeacherThread();

        t1.start();
        t2.start();
    }
}
