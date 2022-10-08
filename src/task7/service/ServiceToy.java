package task7.service;

import task7.Product;

import java.util.Map;

public interface ServiceToy {
    void sortOutByKey(Map<String, Product>map);
    void sortOutByValue(Map<String,Product>map);
    void getMap(Map<String,Product>map);

}
