package mchar;

/**
 * Created by 21508418 on 24/02/2016.
 */
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.EmptyStackException;

public class SimpleStackTest { // Test class

    @Test
    public void testCreateEmptyStack() { // Test case
// Code under test
        Stack stack = new SimpleStack();
// Assertions (oracle)
        assertTrue("A new stack should be empty", stack.isEmpty());
        assertEquals("A new stack has no element", 0, stack.getSize());
    }

    @Test
    public void testPush() throws EmptyStackException {
// Setup the "state of the world"
        Stack stack = new SimpleStack();
        Item item = new SimpleItem();
// Code under test
        stack.push(item);
// assertions (oracle)
        assertFalse("The stack must be not empty", !stack.isEmpty());
        assertEquals("The stack constains 1 item", 1, stack.getSize());
        assertSame("The pushed item is on top of the stack", item,
                stack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack() throws EmptyStackException {
// Setup the "state of the world"
        Stack stack = new SimpleStack();
// Code under test
        stack.pop(); // should throws an EmptyStackException.
    }

}
