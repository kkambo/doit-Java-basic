package manipulation;

public class App {
    
    static String myName;
    
    static {
        myName = "kkambo";
    }

    private String foo = "bar";

    public static void main(String[] args) {
        Thread.currentThread();
        System.out.println("App.class.getSuperclass() = " + App.class.getSuperclass());
    }
}
