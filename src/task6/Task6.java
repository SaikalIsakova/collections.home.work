package task6;

import task1.HeavyBox;
import task6.service.ServiceBoxes;
import task6.service.impl.ServiceBoxesImpl;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        ServiceBoxes serviceBoxes=new ServiceBoxesImpl();
        HeavyBox box1=new HeavyBox(350);
        HeavyBox box2=new HeavyBox(200);
        HeavyBox box3=new HeavyBox(400);
        HeavyBox box4=new HeavyBox(30);

        ArrayList<HeavyBox>boxes=new ArrayList<>(Arrays.asList(box1,box2,box3,box4));
       ArrayList<HeavyBox>boxes1=new ArrayList<>(serviceBoxes.getList(boxes));
        System.out.println("Список коробок вес которых свыше 300кг = "+boxes1);






    }
}
