package is.hi.hbv202g.ass5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntStackTest {

    private IntStack stack;

    @Before
    public void ConstructStack() {
        stack = new IntStack();
    }


    @Test
    public void testNewStackIsNotFull() {

        assertFalse(stack.isFull());
    }

    @Test
    public void testFullStackIsFull() {
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());

    }

    @Test
    public void TestStackOneLessThanFull() {
        for (int i = 0; i < stack.getCapacity() - 1; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue() {
        int push = 9;
        stack.push(push);

        assertEquals(push, stack.pop());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void TestPopOnEmptyStack() {
        stack.pop();

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void TestPushedOnFullStack() {
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(i);
        }
        stack.push(3);
    }

    @Test
    public void IsEmptyStackEmpty() { //two test cases

        assertTrue(stack.isEmpty());
    }

    @Test
    public void IsEmptyStackNotEmpty() {
        stack.push(24);
        assertFalse(stack.isEmpty());
    }
}

