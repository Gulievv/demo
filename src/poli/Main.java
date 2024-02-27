package poli;

public class Main {
    public static void main(String[] args) {

    A a = new A();
    method(a);

    }

    public static void method(Object o) {
        System.out.println("A");
    }

    public static void method(A a) {
        System.out.println("A");

    }
    public static void method(C c) {
        System.out.println("A");
    }

    public static void method(B b) {
        System.out.println("B");
    }
}
