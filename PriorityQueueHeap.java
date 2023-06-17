class PriorityQueueHeap<T extends Comparable<T>> {
    private Heap<Element<T>> heap;

    private static class Element<T> implements Comparable<Element<T>> {
        private T item;
        private int priority;

        public Element(T item, int priority) {
            this.item = item;
            this.priority = priority;
        }

        @Override
        public int compareTo(Element<T> other) {
            return Integer.compare(this.priority, other.priority);
        }
    }

    public PriorityQueueHeap() {
        heap = new Heap<>();
    }

    public void enqueue(T item, int priority) {
        Element<T> element = new Element<>(item, priority);
        heap.insert(element);
    }

    public T dequeue() {
        Element<T> element = heap.remove();
        return element.item;
    }

    public T front() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        Element<T> element = heap.get(0);
        return element.item;
    }

    public T back() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        Element<T> element = heap.get(heap.size() - 1);
        return element.item;
    }
}