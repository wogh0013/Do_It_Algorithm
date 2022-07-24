package Chap04.Unit2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();

        que.offer("Data1");
        que.offer("Data2");
        que.offer("Data3");
        que.offer("Data4");

        System.out.println("Queue 값 포함 여부 : " + que.contains("Data1"));
        System.out.println("Queue 다음 출력값 확인 : " + que.peek());
        System.out.println("Queue 크기 확인 : " + que.size());

        que.remove("Data3");

        for(int i=0; i<que.size();)
            System.out.println(que.poll());

        que.clear();
        System.out.println(que.isEmpty());
    }
}
