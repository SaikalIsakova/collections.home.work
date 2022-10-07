package task3;

import java.util.*;

import static java.util.Arrays.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arrayNum=new int[4];
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println("Enter some number...");
            arrayNum[i]=sc.nextInt();
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print (" " + arrayNum[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
        Integer[] arr2 = Arrays.stream(arrayNum).boxed().toArray(Integer[]::new);

        ArrayList <Integer>list=new ArrayList<>(Arrays.asList(arr2));

        TreeSet<Integer>treeSet=new TreeSet<>();
        treeSet.addAll(list);
        System.out.println(treeSet);
    }
}
