package chapter8;

class A3 {
    A3() {
        System.out.println("B конструкторе А .");
    }
}

class B3 extends A3 {
    B3() {
        System.out.println("B конструкторе В.");
    }
}

class C3 extends B3 {
    C3() {
        System.out.println("B конструкторе C.");
    }
}

public class CallingCons {
    public static void main(String args[]) {
        C3 c = new C3();
    }

}
