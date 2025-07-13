package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox inGenericBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        inGenericBox.set(10);
        Integer result = (Integer) inGenericBox.get();
        System.out.println("result = " + result);
    }
}
