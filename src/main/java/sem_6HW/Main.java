package sem_6HW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);

        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);

        List1 list1 =  new List1(arrayList1);
        List2 list2 =  new List2(arrayList2);
        ListAvg listAvg = new ListAvg();

        System.out.println("Arraylist 1: " + list1);
        System.out.println("Arraylist 2: " + list2);

        double res1 =  listAvg.getAverage(list1.list());
        double res2 =  listAvg.getAverage(list1.list());

        System.out.println("Avg list1: " + res1);
        System.out.println("Avg list2: " + res2);

        double result = res1 - res2;

        ComparisonList comparisonList = new ComparisonList();
        comparisonList.CompList(result);

    }
}
