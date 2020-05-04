package chapter9;

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("B классах, реализующих интерфейсы , " +
                "могут определятьсяи другие члены.");
    }
}
