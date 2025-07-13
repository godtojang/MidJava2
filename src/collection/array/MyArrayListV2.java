package collection.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFALUT_CAPACITY = 5;

    private Object[] elementsData;
    private int size = 0;

    public MyArrayListV2() {
        elementsData = new Object[DEFALUT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementsData = new Object[DEFALUT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if (size == elementsData.length) {
            grow();
        }
        elementsData[size] = e;
        size++;
    }

    private void grow() {
        int oldCapacity = elementsData.length;
        int newCapacity = oldCapacity * 2;
        elementsData = Arrays.copyOf(elementsData, newCapacity);
                                    //기존 배열         새로운길이
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
