package chapter8;

abstract class A7 {
    abstract void callme();

    void callmetoo() {
        System.out.println("Этo конкретный метод.");
    }
}

class B7 extends A7 {
    void callme() {
        System.out.println("Peaлизaция метода callme () из класса В.");
    }
}

public class AbstractDemo {
    public static void main(String args[]) {
        B7 b = new B7();

        b.callme();
        b.callmetoo();
    }
}
