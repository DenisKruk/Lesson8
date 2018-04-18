import static java.lang.System.*;

public class Student {
    public static int counter;
    private int age;
    private String name;
    private School school;

    static {
        System.out.println("static initializer");
    }
    {
        age = 20;
        name = "Ivan";
        school = new School(237, "address");
    }
    {
        counter++;
    }

    public Student() {
    }

    public School getSchool() {
        return school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(School school) {
        this(20, "Ivan");
        this.school = school;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        Student st = new Student(21,"vasia");
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(Student.counter);
        Student st2 = new Student();
        System.out.println(st2.getName());
        System.out.println(st2.getAge());
        System.out.println(Student.counter);

    }

}

class School {
    private int number;
    private String address;

    public School(int number, String address) {
        this.number = number;
        this.address = address;
    }
}