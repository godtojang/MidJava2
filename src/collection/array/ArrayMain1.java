package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        //인덱스 입력
        System.out.println("=== index 입력 : 0(1) === ");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //인덱스 변경
        System.out.println("=== index 변경 : 0(1) === ");
        arr[2] = 10;
        System.out.println("arr[2] = " + arr[2]);

        //인덱스 조회 0(1)
        System.out.println("=== index 조회 : 0(1) === ");
        System.out.println("arr[2] =" + arr[2]);

        //검색 0(n)
        System.out.println("=== 배열 검색 조회 : 0(n) === ");
        System.out.println(Arrays.toString(arr));
        int value = 10;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]" + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + "찾아따");
                break;
            }
        }
    }
}
