
import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<E>> {
     private List<T> heap;

    public Heap() {
        heap = new ArrayList<>();
    }

    public void insert(T item) {
        heap.add(item);
        int index = heap.size() - 1;
        while (index > 0 && heap.get(index).compareTo(heap.get(parent(index))) > 0) {
            swap(index, parent(index));
            index = parent(index);
        }
    }



    public void insert(T item) {
        heap.add(item);
        percolateUp(heap.size() - 1);
    }

    // clase insert
    public void insert(T item, T a[]) {
        a[++n] = x;
        T temp;
        for (j = n; j > 1 && a[j] > a[j / 2]; j /= 2) {
            // intercambiamos con el padre
            temp = a[j];
            a[j] = a[j / 2];
            a[j / 2] = temp;
        }
    }

    // clase eliminar
    public void eliminar( T a[] ) {
        m = a[1]; // La variable m lleva el máximo
        a[1] = a[n--];
        j = 1;
        while(2*j < n) { // mientras tenga algún hijo
            k = 2*j; # el hijo izquierdo
            if ( k+1 <= n && a[k+1] > a[k])
                k = k+1; # el hijo derecho es el mayor
            if ( a[j] > a[k])
                break; // es mayor que ambos hijos
        t = a[j];
        a[j] = a[k];
        a[k] = t;
        j = k; // lo intercambiamos con el mayor hijo
}
        }
}