package task2;

import task1.HeavyBox;

import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        HeavyBox box1=new HeavyBox(26);
        HeavyBox box2=new HeavyBox(10);
        HeavyBox box3=new HeavyBox(17);
        HeavyBox box4=new HeavyBox(30);

        Set<HeavyBox>boxes=new TreeSet<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.forEach(System.out::println);

    }
}
