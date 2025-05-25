package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void testAllItemsNull() {
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(null, "")
        );
        assertEquals("allItems list can't be null!", ex.getMessage());
    }

    @Test
    void testItemWithNullName() {
        List<Item> items = List.of(new Item(null, 1, 100, 0));
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items, "")
        );
        assertEquals("Invalid item!", ex.getMessage());
    }

    @Test
    void testValidHighValuesValidCard() {
        List<Item> items = List.of(new Item("Acka", 11, 350, 0.1));
        double result = SILab2.checkCart(items, "1234567890123456");
        // -30 + (350 * 0.9 * 11) = -30 + 3465 = 3435
        assertEquals(3435.0, result);
    }

    @Test
    void testValidItemInvalidCardChars() {
        List<Item> items = List.of(new Item("Acka", 1, 100, 0));
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items, "1a34ab3d56d8")
        );
        assertEquals("Invalid card number!", ex.getMessage());
    }

    @Test
    void testValidItemNullCard() {
        List<Item> items = List.of(new Item("Acka", 1, 100, 0));
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items, null)
        );
        assertEquals("Invalid card number!", ex.getMessage());
    }

    @Test
    void testTXX_Condition() {
        List<Item> items = List.of(new Item("Acka", 0, 310, 0));
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items, null)
        );
        assertEquals("Invalid card number!", ex.getMessage());
    }

    @Test
    void testFTX_Condition() {
        List<Item> items = List.of(new Item("Acka", 1, 100, 0.1));
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items, null)
        );
        assertEquals("Invalid card number!", ex.getMessage());
    }

    @Test
    void testFFF_Condition() {
        List<Item> items = List.of(new Item("Acka", 1, 100, 0));
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items, null)
        );
        assertEquals("Invalid card number!", ex.getMessage());
    }

    @Test
    void testFFT_Condition() {
        List<Item> items = List.of(new Item("Acka", 11, 100, 0));
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items, null)
        );
        assertEquals("Invalid card number!", ex.getMessage());
    }
}