public class Node<E>{
    private E data;
    private Node<E> left;
    private Node<E> right;
// Constructores

    public Node(E data, Node<E> left, Node<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(E data) {
        this(data, null, null);
    }
// getters, setters

    public void setData(E data) {
        this.data = data;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public E getData() {
        return data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public Node<E> getRight() {
        return right;
    }
    public String toString(){
        return this.data.toString();
    }
}
