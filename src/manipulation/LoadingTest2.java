package manipulation;

public class LoadingTest2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        Class c1 = s1.getClass();
        Class c2 = s2.getClass();

        System.out.println(c1==c2);

    }
}