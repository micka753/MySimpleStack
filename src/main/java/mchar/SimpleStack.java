package mchar;

import java.util.EmptyStackException;

/**
 * Created by 21508418 on 24/02/2016.
 */
public class SimpleStack implements Stack {

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
