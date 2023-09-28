package sem_6HW;

import java.util.List;

public record List1(List<Integer> list) {

    @Override
    public List<Integer> list() {
        return list;
    }

    @Override
    public String toString() {
        return "list=" + list;
    }
}
