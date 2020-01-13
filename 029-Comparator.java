package com.company;

import java.util.Comparator;

public class ComImpl implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        if(o1%10 > o2%10)
            return 1;

        return -1;
    }

}

----------------------------------------------------------------------

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(33);
        arrayList.add(22);
        arrayList.add(77);
        arrayList.add(55);
        arrayList.add(44);
        arrayList.add(11);

        arrayList.add(3,69);

        Comparator<Integer> com = new ComImpl();

        Collections.sort(arrayList,com);

        //Collections.reverse(arrayList);

        arrayList.forEach(System.out::println);

    }
}
