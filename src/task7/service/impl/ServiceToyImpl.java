package task7.service.impl;

import task7.Product;
import task7.service.ServiceToy;

import java.util.ArrayList;
import java.util.Map;

public class ServiceToyImpl implements ServiceToy {
    @Override
    public void sortOutByKey(Map<String, Product> map) {
        ArrayList<String>key=new ArrayList<>(map.keySet());
        System.out.println("Ключи : "+key);

    }

    @Override
    public void sortOutByValue(Map<String, Product> map) {
    ArrayList<Product>value=new ArrayList<>(map.values());
        System.out.println("Значения : "+ value);
    }

    @Override
    public void getMap(Map<String, Product> map) {
        for (Map.Entry entry: map.entrySet()) {

            System.out.println(entry);

        }
    }
}
