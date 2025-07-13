package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        //인스턴스 생성 시점에 T >>타입 결정 
        integerBox.set(10);
        //인티저 타입만 허용 
        Integer integer = integerBox.get(); 
        //캐스팅이 필요 없음
        System.out.println("integer = " + integer);
        
        GenericBox<String> stringGenericBox = new GenericBox<String>();
        stringGenericBox.set("안녕");
        String str = stringGenericBox.get();
        System.out.println("str = " + str);

        //다른 타입 어떤 타입이던지 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);
        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
        
    }



}
