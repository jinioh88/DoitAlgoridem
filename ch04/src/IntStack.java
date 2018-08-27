public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    public IntStack(int max, int ptr, int[] stk) {
        this.max = max;
        this.ptr = ptr;
        try {
            this.stk = stk;
        } catch(OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if(ptr>=max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }
}
