package chapter7;

class Test4 {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }
    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String args[]) {
        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;

        ob.setc(100);

        System.out.println("a, b, и c: " + ob.a + " " +
                ob.b + " " + ob.getc());
    }
}
