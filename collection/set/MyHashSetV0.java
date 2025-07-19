package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementsData = new int[10];
    private int size = 0;

    public boolean add(int value) {
        if(contains(value)) {
            return false;
        }
        elementsData[size] = value;
        size++;
        return true;
    }

    public boolean contains(int value) {
        for (int data : elementsData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementsData=" + Arrays.toString(elementsData) +
                ", size=" + size +
                '}';
    }
}
