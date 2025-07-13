package generic.ex1;
                // 타입 매개변수
public class GenericBox<T> {

    private T vlaue;

    public T get() {
        return vlaue;
    }

    public void set(T vlaue) {
        this.vlaue = vlaue;
    }
}
