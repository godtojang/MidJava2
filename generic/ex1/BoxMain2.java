package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        // object > integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        // object > String 캐스팅
        System.out.println("str = " + str);
        
        // 잘못된 타입 인수 전달
        integerBox.set("문자열 전달");
        Integer result = (Integer) integerBox.get();
        // String >> integer 캐스팅
        System.out.println("result = " + result);
    }
}
