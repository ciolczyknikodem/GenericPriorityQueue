public class Queue {

    private Node head;
    private Node tail;
    private int size;

    public void enqueue(Node node) {
        size++;

        if (head == null) {
            head = node;
        }
        else {
            tail.setNext(node);
        }
        tail = node;

    }

    public Node dequeue() {
        Node current = head;
        Node dequeueElement = head;

        for (int i = 0; i < size; i++) {
            if (current.getNext() != null) {
                if (current.getPriority() > current.getNext().getPriority()) {
                    dequeueElement = current;
                }
                current = current.getNext();
            }
        }
        size--;
        return dequeueElement;
    }

    public boolean isEmpty() {
        return size < 1;
    }

    public int getSize() { return size; }
    public Node getHead() { return head; }
    public Node getTail() { return tail; }
}
