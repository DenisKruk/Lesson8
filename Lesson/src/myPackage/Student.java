package myPackage;

import static anotherPackage.Student.*;
import static java.lang.System.*;

public class Student {
    public static void main(String[] args) {
        Student st = new Student();
        anotherPackage.Student st2 = new anotherPackage.Student();
        out.println(counter);
    }
}
