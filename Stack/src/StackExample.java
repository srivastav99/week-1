
    import java.util.Stack;
    public class StackExample {

        public static void main(String[] args)
        {
//creating an instance of Stack class
            Stack<Integer> stk= new Stack<>();



// pushing elements into stack
            stk.push(1);
            stk.push(2);
            stk.push(3);
            stk.push(4);
            stk.push(5);
            stk.push(6);
//prints elements of the stack
            System.out.println("Elements in Stack: " + stk);
            System.out.println("Elements removed:");
            System.out.println(stk.pop());
            System.out.println(stk.pop());
            System.out.println("Elements in Stack after removing 2 elements: " + stk);
        }
    }
