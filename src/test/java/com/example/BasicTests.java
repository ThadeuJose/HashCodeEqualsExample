package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BasicTests {
    @Test
    public void shouldBeEqualsToHimself() {
        Person p1 = new Person("Name 1", 21, "1223121");

        assertEquals(p1, p1);
        assertTrue(p1.equals(p1));
        assertEquals(p1.hashCode(), p1.hashCode());
    }

    @Test
    public void shouldBeEquals() {
        Person p1 = new Person("Name 1", 21, "1223121");
        Person p2 = new Person("Name 1", 21, "1223121");

        assertEquals(p1, p2);
        assertTrue(p1.equals(p2));
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void shouldBeDiferentBecauseOfNull() {
        Person p1 = new Person("Name 1", 21, "1223121");
        Person p2 = new Person("Name 1", 21, null);

        assertNotEquals(p1, p2);
        assertFalse(p1.equals(p2));
        assertNotEquals(p1.hashCode(), p2.hashCode());
    }
}
