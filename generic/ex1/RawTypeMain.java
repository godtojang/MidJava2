package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox inGenericBox = new GenericBox();
        inGenericBox.set(10);
        Integer result = (Integer) inGenericBox.get();
    }
}
