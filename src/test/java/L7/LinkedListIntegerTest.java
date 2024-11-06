package L7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedListIntegerTest {

    LinkedList<Integer> list = new LinkedList<>();

    @Test
    void addElemTest() {
        list.add(5);
        assertEquals(list.size(), 1);
        assertEquals(list.getHead().getValue(), 5);
        assertEquals(list.getTail().getValue(), 5);
        list.add(7);
        assertEquals(list.size(), 2);
        assertEquals(list.getHead().getValue(), 5);
        assertEquals(list.getTail().getValue(), 7);
        list.add(6);
        assertEquals(list.size(), 3);
        assertEquals(list.getHead().getValue(), 5);
        assertEquals(list.getTail().getValue(), 6);
    }

    @Test
    void findByElemTest() {
        list.add(5);
        list.add(7);
        list.add(6);
        assertEquals(list.findByValue(6).getValue(), list.getTail().getValue());
        assertEquals(list.findByValue(5).getValue(), list.getHead().getValue());
        assertEquals(list.findByValue(7).getValue(), 7);
    }

    @Test
    void deleteElemTest() {
        list.add(5);
        list.add(7);
        list.add(6);
        list.delete(5);
        assertEquals(list.size(), 2);
        assertEquals(list.getHead().getValue(), 7);
        list.delete();
        assertEquals(list.size(), 1);
        assertEquals(list.getTail().getValue(), 7);
    }

    @Test
    void ExceptionsTest() {
        assertThrows(LinkedListException.class,
                () -> list.delete());
        list.add(5);
        assertThrows(LinkedListException.class,
                () -> list.findByValue(7));
        assertThrows(LinkedListException.class,
                () -> list.delete(7));
    }
}
