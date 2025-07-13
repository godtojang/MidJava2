package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFALUT_CAPACITY = 5;

    private Object[] elementsData;
    private int size = 0;
    //기본 생성자 >> 사이즈가 정해진
    public MyArrayListV1() {
        elementsData = new Object[DEFALUT_CAPACITY];
    }
    //생성자 사이즈를 내가 동적으로 만들기위홰
    public MyArrayListV1(int initialCapacity) {
        elementsData = new Object[DEFALUT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementsData[size] = e;
        size++;
    }

    public Object get(int index) {
        return elementsData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementsData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementsData[i])) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementsData, size))
                +" size = " + size + ",  capacity = " + elementsData.length;
    }
}
