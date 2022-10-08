package task7;

import task7.service.ServiceToy;
import task7.service.impl.ServiceToyImpl;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {
//        Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
//        Перебрать и распечатать пары значений - entrySet().
//                Перебрать и распечатать набор из имен продуктов  - keySet().
//                Перебрать и распечатать значения продуктов - values().
//                Для каждого перебора создать свой метод.

        ServiceToy toy=new ServiceToyImpl();

        Map<String,Product>toys=new HashMap<>();
        toys.put("Teddy",new Product("Bear",10.65));
        toys.put("Mickey Mouse",new Product("Mouse",7.45));
        toys.put("Barbie",new Product("Doll",9));

        toy.getMap(toys);
        toy.sortOutByKey(toys);
        toy.sortOutByValue(toys);



    }
}
