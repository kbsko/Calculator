import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public class Sqrt implements Cmd {
    @Override
    public void exec(Stack<Double> stack, String[] parts, Define def) {
        stack.push(Math.sqrt(stack.pop()));
    }
}
