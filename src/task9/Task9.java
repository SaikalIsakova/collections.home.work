package task9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {

        Map<Pet,Pet>pets=new HashMap<>();
        pets.put(new Cat("Murka",true,"Scottish"),new Pet("Cat",6));
        pets.put(new Dog("Rex","Black"),new Pet("Dog",12));
        pets.put(new Parrot("Joie",10,"Brazil",100),new Pet("Parrot",8));

        ArrayList<Pet>list=new ArrayList<>(pets.keySet());
        for (Pet item:list) {

        System.out.println(item);
        }
    }
}
