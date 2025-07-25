package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //인덱스 입력
        System.out.println("=== index 입력 : 0(1) === ");
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        //배열의 첫번 째 위치에 추가
        System.out.println("배열의 첫번 째 위치에 추가 0(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        //인덱스 위치에 추가
        System.out.println("배열의 index(2) 째 위치에 4 추가 0(n)");
        int index = 2;
        int value = 4;
        addAtInex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 마지막 위치에 5 추가 0(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));

    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }

    private static void addAtInex(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i < index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0 ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }
}









