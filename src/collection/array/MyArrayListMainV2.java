package collection.array;

public class MyArrayListMainV2 {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println("== 데이터 추가 ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        //여기서 부터 범위 초과 리스트를 늘리지 않으면 예외 발생
        list.add("f");
        System.out.println(list);

    }
}
