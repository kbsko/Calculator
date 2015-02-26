import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public class Mul implements Cmd {
    @Override
    public void exec(Stack<Double> stack, String[] parts) {
        stack.push((stack.pop()) * stack.pop());
    }
}
