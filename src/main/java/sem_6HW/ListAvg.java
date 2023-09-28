package sem_6HW;

import java.util.List;

public class ListAvg {
    public double getAverage(List<Integer> list) {
        long sum = 0;
        for (int i: list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }
}
