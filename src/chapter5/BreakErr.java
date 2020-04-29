package chapter5;

public class BreakErr {
    public static void main(String[] args) {
        one :
        for (int i = 0; i <3; i++) {
            System.out.println("Пpoxoд " + i + ": ");

        }
        for (int i = 0; i < args.length; i++) {
            if(i == 10)
            System.out.print(i + " ");
            
        }
    }
}
