public class Node <T> {

    private T value;
    private int priority;
    private Node next;

    public Node(T value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public int getPriority() { return priority; }
    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
}
