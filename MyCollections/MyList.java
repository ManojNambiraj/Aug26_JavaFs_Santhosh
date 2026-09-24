package MyCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MyList {
    static void main(String[] args) {
//        ArrayList<Integer> marks = new ArrayList<>();
//
//        marks.add(100);
//        marks.add(200);
//        marks.add(300);
//
////        marks.add(0, 500);
//
////        marks.remove(1);
//        System.out.println(marks.get(1));

//        LinkedList<Integer> list = new LinkedList<>();
//
//        list.add(1);
//        list.add(20);
//        list.add(300);
//        list.add(500);
//
//        list.remove(0);
//
//        System.out.println(list);

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);

        set.remove(20);

        System.out.println(set.size());


    }
}
