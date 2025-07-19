package generic.ex1;
                    // 타입 매개변수
public class GenericBox<T> {

    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
