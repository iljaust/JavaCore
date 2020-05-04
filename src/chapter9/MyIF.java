package chapter9;

public interface MyIF {
    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
