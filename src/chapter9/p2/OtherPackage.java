package chapter9.p2;

public class OtherPackage {
    OtherPackage() {
        chapter9.p1.Protection p = new chapter9.p1.Protection();
        System.out.println("other package constructor");

        System.out.println("n_pub = " + p.n_pub);
    }
}
