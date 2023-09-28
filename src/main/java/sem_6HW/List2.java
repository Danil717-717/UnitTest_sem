package sem_6HW;

import java.util.List;

public class List2 {
    private List<Integer> list;

    public List2(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "list=" + list ;
    }
}
