package Lab4;

public class StackofIntegers {


    private int size = 0;
    int[] elements;

    public StackofIntegers(int capacity) {
         this.elements = new int[capacity];

    }

    public boolean empty()
    {
        if(this.size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int peek()
    {
        return this.elements[this.size-1];
    }

    public void push(int value)
    {
        this.elements[size] = value;
        this.size++;
    }
    public int pop()
    {
        return this.elements[--this.size];
    }
}
