package chapter9.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("кoнcтpyктop этого же пакета");
        System.out.println("n = " + p.n);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
