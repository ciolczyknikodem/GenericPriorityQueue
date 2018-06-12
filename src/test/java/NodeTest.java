import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void constructorWithParametersTest() {
        Node<String> node = new Node<>("Laundry", 1);
    }

}