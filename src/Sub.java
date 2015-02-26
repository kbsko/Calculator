import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public class Sub implements Cmd {
    @Override
    public void exec(Stack<Double> stack, String[] parts) {
        double a;
        double b;
        b = stack.pop();
        a = stack.pop();
        stack.push(a - b);
    }
}
