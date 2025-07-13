package collection.array;

public class MyArrayListMainV3 {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addLast");
        System.out.println(list);

        System.out.println("addFisrt");
        list.add(0, "addFisrt");
        System.out.println(list);

        Object remove1 = list.remove(4);
        System.out.println("remove(4) = " + remove1);
        System.out.println(list);


    }
}
