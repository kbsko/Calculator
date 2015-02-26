import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public class Add implements Cmd {
    @Override
    public void exec(Stack<Double> stack, String[] parts) {
        double b = stack.pop();
        double a = stack.pop();
        stack.push(a + b);
    }
}
