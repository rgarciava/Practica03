import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> {
    private List<T> heap;

    public Heap() {
        heap = new ArrayList<>();
    }

    public void insert(T item) {
        heap.add(item);
        percolateUp(heap.size() - 1);
    }
}