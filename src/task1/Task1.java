package task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        HeavyBox box1=new HeavyBox(15);
        HeavyBox box2=new HeavyBox(20);
        HeavyBox box3=new HeavyBox(25);
        HeavyBox box4=new HeavyBox(30);

        ArrayList<HeavyBox>boxes=new ArrayList<>(Arrays.asList(box1,box2,box3,box4));
        boxes.forEach(System.out::println);
        boxes.set(0,new HeavyBox(1));
        boxes.remove(box4);
        HeavyBox[]arrayBoxes=boxes.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(arrayBoxes));
        boxes.clear();
    }
}
