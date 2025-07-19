package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        // 인스턴스 생성 시점에 T >> 타입 결정
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("hello");
        String string = stringGenericBox.get();
        System.out.println("string = " + string);
    }
}
