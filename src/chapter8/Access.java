package chapter8;

class A1 {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}


class B1 extends A1 {
    int total;

    void sum() {
        //total = i + j;
    }
}

public class Access {
    public static void main(String args[]) {
        B subOb = new B();

        //subOb.setij(10, 12);

        subOb.sum();
        //System.out.println("Total is " + subOb.total);
    }
}
