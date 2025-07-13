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

        //잘못된 타입 인수 전달
        integerBox.set("문자열 전달 해버리기");
        Integer reult = (Integer) integerBox.get();
        //  String >> inter 캐스팅
        System.out.println("reult = " + reult);
    }
}
