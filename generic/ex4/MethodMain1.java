package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        //타입 인자 명시적 전달
        System.out.println("타입 인자 명시적 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>genericMethod(10);
        Double DoubleValue = GenericMethod.<Double>genericMethod(20.0);
        //타입 추론, 타입 인자 생략
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);


    }
}
