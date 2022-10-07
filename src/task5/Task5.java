package task5;

import task1.HeavyBox;

import java.util.ArrayDeque;

public class Task5 {
    public static void main(String[] args) {
        HeavyBox box1=new HeavyBox(26);
        HeavyBox box2=new HeavyBox(10);
        HeavyBox box3=new HeavyBox(17);
        HeavyBox box4=new HeavyBox(30);

        ArrayDeque<HeavyBox>boxes=new ArrayDeque<>();
        boxes.offer(box1);
        boxes.offer(box2);
        boxes.offer(box3);
        boxes.offer(box4);
        System.out.println(boxes);

        while (boxes.peek()!=null){
            boxes.poll();
        }


    }
}
