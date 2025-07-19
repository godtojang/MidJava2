package collection.list;

public class BatchProcessor {
    //1 . 처음엔 그냥 의존
    //private final MyArrayList<Integer> list = new MyArrayList<>();
    //코드 변경
    //private final MyLinkedList<Integer> list = new MyLinkedList<>();

    //2. 인터페이스를 통한방법
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();  // 시간 체크용
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();  // 시간 체크용
        System.out.println("크기 : " + size + ", 계산 시간 : "
                + (endTime - startTime) + " ms");
    }
}
