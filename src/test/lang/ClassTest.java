package test.lang;

public class ClassTest {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println("The class of " + obj +
                " is " + obj.getClass().getName());
    }
}
