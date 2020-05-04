package chapter7;

class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    void meth1(Test2 o) {
        o.a *=  2;
        o.b /= 2;
    }
}

public class PassObjRef {
    public static void main(String args[]) {
        Test2 ob = new Test2(15, 20);

        System.out.println("ob.a и ob.b после вызова: " +
                ob.a + " " + ob.b);

        ob.meth1(ob);

        System.out.println("ob.a и ob.b после вызова: " +
                ob.a + " " + ob.b);
    }

}
