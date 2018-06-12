import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue queue;

    @BeforeEach
    void constructorTest() {
        queue = new Queue();
    }

    @Test
    void isHeadNullAfterInitializeNewQueueTest() {
        assertNull(queue.getHead());
    }

    @Test
    void setHeadTest() {
        Node<String> node = new Node<>("Laundry", 1);
        queue.enqueue(node);

        Node result = queue.getHead();

        assertEquals(node, result);
    }

    @Test
    void isTailNullAfterInitializeNewQueueTest() {
        assertNull(queue.getTail());
    }

    @Test
    void updateTailAfterAddFirstElementTest() {
        Node<String> node = new Node<>("Bath", 0);
        queue.enqueue(node);

        Node result = queue.getTail();

        assertEquals(node, result);
    }

    @Test
    void updateTailAfterAddTwoElementsTest() {
        Node<String> node1 = new Node<>("Bath", 0);
        Node<String> node2 = new Node<>("Laundry", 1);

        queue.enqueue(node1);
        queue.enqueue(node2);

        Node tailResult = queue.getTail();

        assertEquals(node2, tailResult);
    }

    @Test
    void sizeTest() {
        Node<String> node1 = new Node<>("Bath", 0);
        Node<String> node2 = new Node<>("Laundry", 1);
        Node<String> node3 = new Node<>("Clean kitchen", 0);

        queue.enqueue(node1);
        queue.enqueue(node2);
        queue.enqueue(node3);

        int result = queue.getSize();

        assertEquals(3, result);
    }

    @Test
    void dequeuePriorityTest() {
        Node<String> node1 = new Node<>("Bath", 0);
        Node<String> node2 = new Node<>("Laundry", 1);
        Node<String> node3 = new Node<>("Clean kitchen", 0);

        queue.enqueue(node1);
        queue.enqueue(node2);
        queue.enqueue(node3);

        Node result = queue.dequeue();

        assertEquals(node2, result);
    }

    @Test
    void dequeuePriorityWithFourElementsTest() {
        Node<String> node1 = new Node<>("Bath", 0);
        Node<String> node2 = new Node<>("Laundry", 1);
        Node<String> node4 = new Node<>("Eat food", 3);
        Node<String> node3 = new Node<>("Clean kitchen", 0);

        queue.enqueue(node1);
        queue.enqueue(node2);
        queue.enqueue(node4);
        queue.enqueue(node3);

        Node result = queue.dequeue();

        assertEquals(node4, result);
    }

    @Test
    void isQueueEmptyTest() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void isQueueNotEmpty() {
        Node<String> node1 = new Node<>("Bath", 0);

        queue.enqueue(node1);

        assertFalse(queue.isEmpty());
    }

}