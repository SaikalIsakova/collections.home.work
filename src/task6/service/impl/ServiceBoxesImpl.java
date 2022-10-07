package task6.service.impl;

import task1.HeavyBox;
import task6.service.ServiceBoxes;

import java.util.ArrayList;
import java.util.List;

public class ServiceBoxesImpl implements ServiceBoxes {
    @Override
    public List <HeavyBox> getList(List<HeavyBox> list) {
        List<HeavyBox>list2=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getWeight()>300){
                list2.add(list.get(i));
            }
        } return  list2;}

    }

