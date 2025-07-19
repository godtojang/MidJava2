package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic((50_000));


    }

}
