package Lab4;

public class StackTest {
    public static void main(String[] args)
    {
        StackofIntegers stack = new StackofIntegers(10);
        for (int i =0; i <10; i++)
        {
            stack.push(i);
        }
        while (!stack.empty())
        {
            System.out.print(stack.pop() + " ");
        }
    }
}
