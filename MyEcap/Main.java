package MyEcap;

// Getter & Setter

class Student{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

}

public class Main {
    static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("John");
        System.out.println(s1.getName());
        s1.setAge(30);
        System.out.println(s1.getAge());

    }
}
