package manipulation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LoadingTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Class c1 = s1.getClass();

        System.out.println("c1.getName() = " + c1.getName());
        System.out.println("c1.getSuperclass() = " + c1.getSuperclass());

        Method m[] = c1.getDeclaredMethods();

        for (Method method : m ){
            System.out.println("method = " + method.getName());
        }

        Field f[ ] = c1.getDeclaredFields();
        for(Field field : f)
            System.out.println("field.getName() = " + field.getName());
    }
}

class Student {
    private String name;
    private int roll_No;

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll_No() {
        return roll_No;
    }
    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }
}
